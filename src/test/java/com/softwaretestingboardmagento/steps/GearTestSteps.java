package com.softwaretestingboardmagento.steps;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ProductPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class GearTestSteps {
    @When("I Mouse Hover on Gear Menu")
    public void iMouseHoverOnGearMenu() {
        new HomePage().mouseHOverOnGearManu();
    }

    @And("I Click on Bags")
    public void iClickOnBags() {
        new HomePage().clickOnBags();
    }

    @And("I Click on Product Name Overnight Duffle")
    public void iClickOnProductNameOvernightDuffle() {
        new BagsPage().clickOnProduct();
    }

    @And("I Verify the text {string}")
    public void iVerifyTheText(String expectedText) {
        Assert.assertEquals(new ProductPage().verifyOvernightDuffleText(),expectedText);
    }

    @And("I Change Qty {string}")
    public void iChangeQty(String qty) {
       new ProductPage().changeQuantity(qty);
    }

    @And("I Click on Add to Cart Button.")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCart();
    }


    @And("I Verify the text of {string}")
    public void iVerifyTheTextOf(String expectedText) {
        Assert.assertEquals(new ProductPage().verifyProductAddText(),expectedText);
    }

    @And("I Click on shopping cart Link into message")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new ProductPage().clickOnShoppingCart();
    }

    @And("I Verify the product name {string}")
    public void iVerifyTheProductName(String expectedProductName) {
        Assert.assertEquals(new ShoppingCartPage(),expectedProductName);
    }

    @And("I Verify the Qty is {string}")
    public void iVerifyTheQtyIs(String expectedQty) {
        Assert.assertEquals(new ShoppingCartPage().verifyTheQuantity(),expectedQty);
    }

    @And("I Verify the product price {string}")
    public void iVerifyTheProductPrice(String expectedPrice) {
        Assert.assertEquals(new ShoppingCartPage().verifyTheProductPrice(),expectedPrice);
    }

    @And("I Change Qty to {string}")
    public void iChangeQtyTo(String changeQty) throws InterruptedException {
        new ShoppingCartPage().updateTheQuantity(changeQty);
    }

    @And("I Click on Update Shopping Cart button")
    public void iClickOnUpdateShoppingCartButton() {
        new ShoppingCartPage().clickOnUpdateShoppingCart();
    }



}
