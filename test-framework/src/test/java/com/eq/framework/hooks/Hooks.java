package com.eq.framework.hooks;

import com.eq.framework.browser.DriverFactory;
import com.eq.framework.config.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public final class Hooks {
    @Before
    public void setUp() {
        DriverFactory.start();
    }

    @After
    public void tearDown() {
        try {
            TimeUnit.SECONDS.sleep(Config.getLong("observe.seconds"));
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        } finally {
            DriverFactory.stop();
        }
    }
}