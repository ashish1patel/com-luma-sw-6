package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    @CacheLookup
    @FindBy(css = "main div h1 span")
    WebElement textShoppingCart;

    @CacheLookup
    @FindBy(css = "[data-th=\"Item\"] div strong a")
    WebElement textCronusYogaPant;

    @CacheLookup
    @FindBy(css = ".item-options>dd:first-of-type")
    WebElement textSize32;

    @CacheLookup
    @FindBy(css = ".item-options>dd:last-of-type")
    WebElement textBlack;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement getProductNameText;

    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement quantityText;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement productPriceText;

    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement updateQty;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement clickUpdateQty;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
    WebElement productPriceText1;

    public String getTextShoppingCart() {
        log.info("Get text shopping cart");
        return getTextFromElement(textShoppingCart);
    }

    public String getTextCronusYogaPant() {
        log.info("Get text cronus yoga pant");
        return getTextFromElement(textCronusYogaPant);
    }

    public String getTextSize32() {
        log.info("Get text size 32");
        return getTextFromElement(textSize32);
    }

    public String getBlackText() {
        log.info("Get text black");
        return getTextFromElement(textBlack);
    }

    public String verifyTheProductName() {
        log.info("Verify the product name");
        return getTextFromElement(getProductNameText);
    }

    public String verifyTheQuantity(){
        return getTextFromElement(quantityText);
    }
/*
   public String verifyTheQuantityNumber() throws InterruptedException {
      Thread.sleep(3000);
      return getAttributeValueFromElement(quantityText);
  }*/

    public String verifyTheProductPrice() {
        log.info("Verify the product price");
        return getTextFromElement(productPriceText);
    }

    public void updateTheQuantity(String qty) throws InterruptedException {
        log.info("Update the quantity");
        sendTextToElement(updateQty, Keys.BACK_SPACE + qty);
    }


    public void clickOnUpdateShoppingCart() {
        log.info("Click on update the shopping cart");
        clickOnElement(clickUpdateQty);
    }

    public String verifyTheProductPrice1() {
        log.info("Verify the product price");
        return getTextFromElement(productPriceText1);
    }
}
