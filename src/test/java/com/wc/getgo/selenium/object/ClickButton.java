package com.wc.getgo.selenium.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickButton {

    private WebDriver driver;
    private WebElement element;

    private ClickButton(WebDriver driver) {
        this.driver = driver;
    }

    private ClickButton(WebElement element) {
        this.element = element;
    }

    public static ClickButton clickButton(WebDriver driver) {
        return new ClickButton(driver);
    }

    public static ClickButton clickButton(WebElement element) {
        return new ClickButton(element);
    }

    public ClickButton xpath(String xpath) {
        this.element = driver.findElement(By.xpath(xpath));
        return this;
    }

    public ClickButton id(String id) {
        this.element = driver.findElement(By.id(id));
        return this;
    }

    public ClickButton click() {
        this.element.click();
        return this;
    }
}
