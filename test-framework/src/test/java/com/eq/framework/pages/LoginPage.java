package com.eq.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.eq.framework.config.Config;

public final class LoginPage extends BasePage {
    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(Config.get("app.url"));
    }

    public ProductsPage signIn(String user, String secret) {
        type(username, user);
        type(password, secret);
        click(loginButton);
        return new ProductsPage(driver);
    }
}
