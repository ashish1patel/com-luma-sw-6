package com.softwaretestingboardmagento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.PantsPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MenTestSteps {
    @When("Mouse Hover on Men Menu")
    public void mouseHoverOnMenMenu() {
        new HomePage().mouseHoverToMenMenu();
    }

    @And("Mouse Hover on Bottoms")
    public void mouseHoverOnBottoms() {
        new HomePage().mouseHoverToMenBottoms();
    }

    @And("Click on Pants")
    public void clickOnPants() {
        new HomePage().clickOnPants();
    }

    @And("Mouse Hover on product name Cronus Yoga Pant and click on size 32.")
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnSize() {
        new PantsPage().hoverAndClickProductSize();
    }

    @And("Mouse Hover on product name Cronus Yoga Pant and click on colour Black.")
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack() {
        new PantsPage().hoverAndClickProductColour();
    }

    @And("Mouse Hover on product name Cronus Yoga Pant and click on Add To Cart Button.")
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() {
        new PantsPage().hoverAndClickOnAddToCartButton();
    }

    @And("Verify the text {string}")
    public void verifyTheText(String expectedText) {
        Assert.assertEquals(expectedText,new PantsPage().getTextAddedPantToShoppingCart());
    }

    @And("Click on shopping cart Link into message")
    public void clickOnShoppingCartLinkIntoMessage() {
        new PantsPage().clickOnShoppingCart();
    }

    @And("Verify the text of {string}")
    public void verifyTheTextShoppingCart(String expectedText) {
       Assert.assertEquals(expectedText,new ShoppingCartPage().getTextShoppingCart());
    }

    @And("Verify the product name {string}")
    public void verifyTheProductNameCronusYogaPant(String expectedText) {
       Assert.assertEquals(expectedText,new ShoppingCartPage().getTextCronusYogaPant());
    }

    @And("Verify the product size ‘{int}’")
    public void verifyTheProductSize(int expectedSize) {
      Assert.assertEquals(expectedSize,new ShoppingCartPage().getTextSize32());
    }

    @Then("Verify the product colour {string}")
    public void verifyTheProductColourBlack(String expectedText) {
        Assert.assertEquals(expectedText,new ShoppingCartPage().getBlackText());
    }


}
