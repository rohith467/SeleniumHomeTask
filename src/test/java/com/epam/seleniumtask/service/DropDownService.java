package com.epam.seleniumtask.service;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownService {
    private void goToWebsite(WebDriver webDriver) {
        webDriver.get("http://the-internet.herokuapp.com/dropdown");
    }

    public boolean clickingFirstOptionInTheDropDown(WebDriver webDriver){
        goToWebsite(webDriver);
        WebElement element = webDriver.findElement(By.xpath("//select[@id='dropdown']"));
        Select dropdown = new Select(element);
        dropdown.selectByIndex(1);
        return dropdown.getFirstSelectedOption().isSelected();
    }

    public boolean clickingSecondOptionInTheDropDown(WebDriver webDriver){
        goToWebsite(webDriver);
        WebElement element = webDriver.findElement(By.xpath("//select[@id='dropdown']"));
        Select dropdown = new Select(element);
        dropdown.selectByIndex(2);
        return dropdown.getFirstSelectedOption().isSelected();
    }
}
