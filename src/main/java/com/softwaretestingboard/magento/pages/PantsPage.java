package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PantsPage extends Utility {

    private static final Logger log = LogManager.getLogger(PantsPage.class.getName());

    @CacheLookup
    @FindBy(css = ".product-item-link")
    WebElement productName;
    @CacheLookup
    @FindBy(css = "[data-role=\"swatch-option-880\"][data-rendered=\"true\"] .swatch-option.text")
    WebElement size32;
    @CacheLookup
    @FindBy(css = "[data-role=\"swatch-option-880\"][data-rendered=\"true\"] .swatch-option.text")
    WebElement colourBlack;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addedPant;
    @CacheLookup
    @FindBy(css = ".message-success.success.message div a")
    WebElement linkShoppingCart;

    public void hoverAndClickProductSize() {
        log.info("Mouse hoover on product and click size 32");
        mouseHoverToElement(productName);
        mouseHoverToElementAndClick(size32);
    }

    public void hoverAndClickProductColour() {
        log.info("Mouse hoover on product and click on colour black");
        mouseHoverToElement(productName);
        mouseHoverToElementAndClick(colourBlack);
    }

    public void hoverAndClickOnAddToCartButton() {
        log.info("Mouse hoover and clock on add to cart button");
        mouseHoverToElement(productName);
        mouseHoverToElementAndClick(addToCartButton);
    }

    public String getTextAddedPantToShoppingCart() {
        log.info("Get text - added pant to shopping cart");
        return getTextFromElement(addedPant);
    }

    public void clickOnShoppingCart() {
        log.info("Click on shopping cart");
        clickOnElement(linkShoppingCart);
    }
}
