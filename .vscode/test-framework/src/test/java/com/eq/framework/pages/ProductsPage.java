package com.eq.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public final class ProductsPage extends BasePage {
    private final By productsContainer = By.id("inventory_container");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayed() {
        return isDisplayed(productsContainer);
    }
}