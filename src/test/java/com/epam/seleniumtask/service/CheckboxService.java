package com.epam.seleniumtask.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxService {


    public boolean clickingOnFirstCheckBox(WebDriver webDriver){
        WebElement element = getFirstWebElement(webDriver);
        element.click();
        return element.isSelected();
    }

    public WebElement getFirstWebElement(WebDriver webDriver) {
        webDriver.get("http://the-internet.herokuapp.com/checkboxes");
        return webDriver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
    }

    public boolean clickingOnSecondCheckBox(WebDriver webDriver){
        WebElement element = getSecondWebElement(webDriver);
        element.click();
        return element.isSelected();
    }

    public WebElement getSecondWebElement(WebDriver webDriver) {
        webDriver.get("http://the-internet.herokuapp.com/checkboxes");
        return webDriver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));

    }


}
