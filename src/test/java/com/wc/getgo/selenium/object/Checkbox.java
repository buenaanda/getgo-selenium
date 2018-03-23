package com.wc.getgo.selenium.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox {

    private WebDriver driver;
    private WebElement element;

    private Checkbox(WebDriver driver) {
        this.driver = driver;
    }

    private Checkbox(WebElement element) {
        this.element = element;
    }

    public static Checkbox checkbox(WebDriver driver) {
        return new Checkbox(driver);
    }

    public static Checkbox checkbox(WebElement element) {
        return new Checkbox(element);
    }

    public Checkbox xpath(String xpath) {
        this.element = driver.findElement(By.xpath(xpath));
        return this;
    }

    public Checkbox id(String id) {
        this.element = driver.findElement(By.id(id));
        return this;
    }

    public Checkbox check() {
        this.element.click();
        return this;
    }
}
