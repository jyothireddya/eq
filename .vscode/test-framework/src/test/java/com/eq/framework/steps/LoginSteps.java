package com.eq.framework.steps;

import com.eq.framework.browser.DriverFactory;
import com.eq.framework.config.Config;
import com.eq.framework.pages.LoginPage;
import com.eq.framework.pages.ProductsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.testng.Assert.assertTrue;

public final class LoginSteps {
    private LoginPage loginPage;
    private ProductsPage productsPage;

    @Given("the Swag Labs login page is open")
    public void openLoginPage() {
        loginPage = new LoginPage(DriverFactory.get());
        loginPage.open();
    }

    @When("I sign in with the configured valid user")
    public void signInWithConfiguredUser() {
        productsPage = loginPage.signIn(Config.get("test.user"), Config.get("test.password"));
    }

    @Then("the products page is displayed")
    public void verifyProductsPage() {
        assertTrue(productsPage.isDisplayed(), "Products page should be visible after login");
    }
}