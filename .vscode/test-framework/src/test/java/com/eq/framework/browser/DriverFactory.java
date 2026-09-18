package com.eq.framework.browser;

import com.eq.framework.config.Config;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public final class DriverFactory {
    private static final ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();

    private DriverFactory() {
    }

    public static void start() {
        if (DRIVER.get() != null) {
            return;
        }
        if (!Config.get("browser").equalsIgnoreCase("chrome")) {
            throw new IllegalArgumentException("Unsupported browser: " + Config.get("browser"));
        }
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        if (Config.getBoolean("headless")) {
            options.addArguments("--headless=new");
        }
        options.addArguments("--window-size=1440,1000");
        DRIVER.set(new ChromeDriver(options));
    }

    public static WebDriver get() {
        WebDriver driver = DRIVER.get();
        if (driver == null) {
            throw new IllegalStateException("WebDriver has not been started");
        }
        return driver;
    }

    public static void stop() {
        WebDriver driver = DRIVER.get();
        if (driver != null) {
            driver.quit();
            DRIVER.remove();
        }
    }
}