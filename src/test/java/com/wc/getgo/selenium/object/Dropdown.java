package com.wc.getgo.selenium.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    private WebDriver driver;
    private WebElement element;
    private Select select;
    private String value;

    private Dropdown(WebDriver driver) {
        this.driver = driver;
    }

    private Dropdown(WebElement element) {
        this.element = element;
    }

    public static Dropdown dropdown(WebDriver driver) {
        return new Dropdown(driver);
    }

    public static Dropdown dropdown(WebElement element) {
        return new Dropdown(element);
    }

    public Dropdown dropdownLocator(String locator) {
        this.element = driver.findElement(By.xpath(locator));
        return this;
    }

    public Dropdown selectValue(String value) {
        this.select = new Select(element);
        this.value = value;
        return this;
    }

    public Dropdown select() {
        this.select.selectByVisibleText(value);
        return this;
    }
}
