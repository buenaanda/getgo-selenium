package com.wc.getgo.selenium.common;

import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

public class Seleniumbase {

    public static WebDriver driver;
    public static String url = "http://10.51.1.131";
    //public static String url = "https://getgo.unionbankph.com";

    @BeforeClass
    public void init() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterMethod
    public void takeScreenshotOnFailure(ITestResult testResult) throws IOException {
        String[] testClass = testResult.getTestClass().getName().split("\\.");
        if (testResult.getStatus() == ITestResult.FAILURE) {
            System.out.println(testResult.getStatus());
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("target" + File.separator + "surefire-reports" + File.separator + "screenshots" + File.separator + System.currentTimeMillis() + "_" +
                    testClass[testClass.length -1] + "_" + testResult.getName() + ".png"));
        }
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }
}
