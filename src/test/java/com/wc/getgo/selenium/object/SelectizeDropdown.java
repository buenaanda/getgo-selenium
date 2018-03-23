package com.wc.getgo.selenium.object;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.wc.getgo.selenium.global.Sleep.sleep;

public class SelectizeDropdown {

    private WebDriver driver;
    private WebElement element;
    private String locator;

    private SelectizeDropdown(WebDriver driver) {
        this.driver = driver;
    }

    private SelectizeDropdown(WebElement element) {
        this.element = element;
    }

    public static SelectizeDropdown selectizeDropdown(WebDriver driver) {
        return new SelectizeDropdown(driver);
    }

    public static SelectizeDropdown selectizeDropdown(WebElement element) {
        return new SelectizeDropdown(element);
    }

    public SelectizeDropdown dropdownLocator(String locator) {
        this.element = driver.findElement(By.xpath(locator));
        this.locator = locator;
        return this;
    }

    private SelectizeDropdown clickDropdown() {
        this.element.click();
        return this;
    }

    public SelectizeDropdown setText(String text) {
        clickDropdown();
        String dropdownLocator = locator;
        String dropdownTextfieldLocator = String.format("%s/input", dropdownLocator);
        driver.findElement(By.xpath(dropdownTextfieldLocator)).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.xpath(dropdownTextfieldLocator)).sendKeys(text);
        sleep(1000);
        return this;
    }

    public SelectizeDropdown select() {
        String dropdownResultLocator =  String.format("%s[contains(@class, 'selectize-dropdown single')]/div/div/span", locator);
        driver.findElement(By.xpath(dropdownResultLocator)).click();
        return this;
    }
}
