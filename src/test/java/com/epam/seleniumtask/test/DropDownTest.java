package com.epam.seleniumtask.test;

import com.epam.seleniumtask.factory.WebDriverSingleton;
import com.epam.seleniumtask.service.DropDownService;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DropDownTest {
    WebDriver webDriver;
    DropDownService service;
    @Parameters("inputWebDriver")
    @BeforeTest
    public void setWebDriver(@Optional("chrome")String inputWebDriver){
        webDriver= WebDriverSingleton.createWebDriver(inputWebDriver);
        service=new DropDownService();

    }
    @Test
    public void verifyFirstDropDownOption() {
        Assert.assertTrue(service.clickingFirstOptionInTheDropDown(webDriver));
    }
    @Test
    public void verifySecondDropDownOption(){
        Assert.assertTrue(service.clickingSecondOptionInTheDropDown(webDriver));
    }
}