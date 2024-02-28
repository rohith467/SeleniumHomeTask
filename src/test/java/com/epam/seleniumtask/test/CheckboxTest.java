package com.epam.seleniumtask.test;
import com.epam.seleniumtask.factory.WebDriverSingleton;
import com.epam.seleniumtask.service.CheckboxService;
import com.epam.seleniumtask.util.Utility;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.io.IOException;

public class CheckboxTest {
    WebDriver webDriver;
    CheckboxService service;
    Utility util;
    @Parameters("browser")
    @BeforeTest
    public void setWebDriver(String inputWebDriver){
        webDriver= WebDriverSingleton.createWebDriver(inputWebDriver);
        service=new CheckboxService();
        util=new Utility();
    }
    @Test
    public void verifyFirstCheckboxClick(){
        Assert.assertTrue(service.clickingOnFirstCheckBox(webDriver));
    }
    @Test @Severity(value = SeverityLevel.NORMAL) @Description("Test for second CheckBox")
    public void verifySecondCheckboxClick() {

//        try {
            Assert.assertFalse(service.clickingOnSecondCheckBox(webDriver));
//        } catch (AssertionError e) {
//            util.takeScreenshotOfElement(webDriver, service.getSecondWebElement(webDriver));
//            util.takeScreenshotOfDriver(webDriver);
//        }
    }
    @AfterMethod
    public void screenshotOfTest(ITestResult result) throws IOException {
            util.takeScreenshotOfDriver(webDriver);

    }
    @AfterMethod
    public void screenshotOfElement(ITestResult result) throws IOException {

        util.takeScreenshotOfElement(webDriver, service.getSecondWebElement(webDriver));

    }

}
