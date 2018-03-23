package com.wc.getgo.selenium.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.wc.getgo.selenium.common.Seleniumbase.driver;
import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;
import static com.wc.getgo.selenium.global.Sleep.sleep;
import static com.wc.getgo.selenium.object.ClickButton.clickButton;
import static com.wc.getgo.selenium.object.Dropdown.dropdown;

public class DatePicker {

    private WebElement element;
    private String xpath;

    public static DatePicker datePicker() {
        return new DatePicker();
    }

    public DatePicker locator(String xpath) {
        this.xpath = xpath;
        this.element = driver.findElement(By.xpath(xpath));
        return this;
    }

    public DatePicker click() {
        this.element.click();
        sleep(1000);
        return this;
    }

    public DatePicker selectMonth(String month) {
        String monthDropdownLocator = String.format("%s/following-sibling::div/div/div/div/div/select[@class='ui-datepicker-month']", xpath);
        if(seleniumExtension().isElementVisible("xpath", monthDropdownLocator) == false) {
            monthDropdownLocator = "//div[@id='ui-datepicker-div']/div/div/select[@class='ui-datepicker-month']";
        }
        dropdown(driver).dropdownLocator(monthDropdownLocator).selectValue(month).select();
        return this;
    }

    public DatePicker selectYear(String year) {
        String yearDropdownLocator = String.format("%s/following-sibling::div/div/div/div/div/select[@class='ui-datepicker-year']", xpath);
        if(seleniumExtension().isElementVisible("xpath", yearDropdownLocator) == false) {
            yearDropdownLocator = "//div[@id='ui-datepicker-div']/div/div/select[@class='ui-datepicker-year']";
        }
        dropdown(driver).dropdownLocator(yearDropdownLocator).selectValue(year).select();
        return this;
    }

    public DatePicker selectDay(String day) {
        String dayLocator = String.format("%s/following-sibling::div/div/div/table[@class='ui-datepicker-calendar']/tbody/tr/td/a[contains(@class, 'ui-state') and contains(text(), '%s')]", xpath, day);
        if(seleniumExtension().isElementVisible("xpath", dayLocator) == false) {
            dayLocator = String.format("//div[@id='ui-datepicker-div']/table[@class='ui-datepicker-calendar']/tbody/tr/td/a[contains(@class, 'ui-state') and contains(text(), '%s')]", day);
        }
        clickButton(driver).xpath(dayLocator).click();
        sleep(1000);
        return this;
    }
}
