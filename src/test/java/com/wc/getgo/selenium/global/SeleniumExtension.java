package com.wc.getgo.selenium.global;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.wc.getgo.selenium.common.Seleniumbase.driver;

public class SeleniumExtension {

    private WebElement element;
    private Boolean element1;

    public static SeleniumExtension seleniumExtension() {
        return new SeleniumExtension();
    }

    public boolean isElementVisible(String label, String locator) {
        try {
            if(label == "xpath") {
                element = driver.findElement(By.xpath(locator));
            } else if(label == "id") {
                element = driver.findElement(By.id(locator));
            }
        } catch (NoSuchElementException e) {
           return false;
        }
        return element.isDisplayed();
    }

    public boolean waitForElementVisible(String label, String locator) {
        try {
            if(label == "xpath") {
                element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
            }
            if(label == "id") {
                element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.id(locator)));
            }
        } catch(TimeoutException e) {
            return false;
        }
        return true;
    }

    public boolean waitForElementNotVisible(String label, String locator) {
        try {
            if(label == "xpath") {
                element1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
            }
            if(label == "id") {
                element1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.invisibilityOfElementLocated(By.id(locator)));
            }
        } catch(TimeoutException e) {

        }
        return true;
    }

    public String getText(String label, String locator) {
        if(label == "xpath") {
            element = driver.findElement(By.xpath(locator));
        } else if(label == "id") {
            element = driver.findElement(By.id(locator));
        }
        return element.getText();
    }

    public String getValue(String label, String locator) {
        if(label == "xpath") {
            element = driver.findElement(By.xpath(locator));
        } else if(label == "id") {
            element = driver.findElement(By.id(locator));
        }
        return element.getAttribute("value");
    }

    public Boolean isTextPresent(String text) {
        String res = driver.getPageSource();
        return res.contains(text);
    }

    public Boolean isSelected() {
        return element.isSelected();
    }

    public Boolean isUnselected() {
        return !element.isSelected();
    }

    public String getAttribute(String xpathLocator, String attribute) {
        element = driver.findElement(By.xpath(xpathLocator));
        String att = element.getAttribute(attribute);
        return att;
    }

    public SeleniumExtension xpath(String locator) {
        this.element = driver.findElement(By.xpath(locator));
        return this;
    }

    public SeleniumExtension id(String id) {
        this.element = driver.findElement(By.id(id));
        return this;
    }

    public Boolean isDisabled() {
        return !element.isEnabled();
    }
}
