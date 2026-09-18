package com.eq.framework.hooks;

import com.eq.framework.browser.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public final class Hooks {
    @Before
    public void setUp() {
        DriverFactory.start();
    }

    @After
    public void tearDown() {
        DriverFactory.stop();
    }
}