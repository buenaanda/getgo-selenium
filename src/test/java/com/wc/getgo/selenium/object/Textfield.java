package com.wc.getgo.selenium.object;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.wc.getgo.selenium.global.Sleep.sleep;

public class Textfield {

    private WebDriver driver;
    private WebElement element;

    private Textfield(WebDriver driver) {
        this.driver = driver;
    }

    private Textfield(WebElement element) {
        this.element = element;
    }

    public static Textfield textfield(WebDriver driver) {
        return new Textfield(driver);
    }

    public static Textfield textfield(WebElement element) {
        return new Textfield(element);
    }

    public Textfield xpath(String xpath) {
        this.element = driver.findElement(By.xpath(xpath));
        return this;
    }

    public Textfield id(String id) {
        this.element = driver.findElement(By.id(id));
        return this;
    }

    public Textfield selectAll() {
        this.element.sendKeys(Keys.COMMAND, "a");
        return this;
    }

    public Textfield setText(String text) {
        sleep(500);
        selectAll();
        backspace();
        this.element.sendKeys(text);
        return this;
    }

    public Textfield backspace() {
        this.element.sendKeys(Keys.BACK_SPACE);
        return this;
    }

    public Textfield pageDown() {
        this.element.sendKeys(Keys.PAGE_DOWN);
        return this;
    }

    public Textfield pageUp() {
        this.element.sendKeys(Keys.PAGE_UP);
        return this;
    }
}
