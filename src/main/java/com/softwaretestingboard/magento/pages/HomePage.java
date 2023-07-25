package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-4']//span[contains(text(),'Women')]")
    WebElement womenMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']")
    WebElement tops;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jackets;

    @CacheLookup
    @FindBy(css = "li.level0.nav-3>a.level-top.ui-corner-all>span:nth-of-type(1)")
    WebElement menMenu;

    @CacheLookup
    @FindBy(css = "#ui-id-18 span")
    WebElement menBottoms;

    @CacheLookup
    @FindBy(css = "#ui-id-23 span")
    WebElement menPants;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearMenu;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement begs;

    public void mouseHoverToMenMenu() {
        log.info("Mouse hoover to men menu");
        mouseHoverToElement(menMenu);

    }

    public void mouseHoverToMenBottoms() {
        log.info("Mouse hoover on men bottom");
        mouseHoverToElement(menBottoms);
    }

    public void clickOnPants() {
        log.info("Click on pants");
        mouseHoverToElementAndClick(menPants);
    }

    public void mouseHoverOnWomenMenu() {
        log.info("Mouse hoover women menu");
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTops() {
        log.info("Mouse hoover on tops");
        mouseHoverToElement(tops);
    }

    public void clickOnJackets() {
        log.info("Click on jackets");
        mouseHoverToElementAndClick(jackets);
    }

    public void mouseHOverOnGearManu() {
        log.info("Mouse hoover on gear menu");
        mouseHoverToElement(gearMenu);
    }

    public void clickOnBags() {
        log.info("Click on bags");
        mouseHoverToElementAndClick(begs);
    }
}
