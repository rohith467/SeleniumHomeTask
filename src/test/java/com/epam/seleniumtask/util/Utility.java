package com.epam.seleniumtask.util;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class Utility {
    private static final String DRIVER_SCREENSHOT_PATH="C:\\Users\\bindigari_rohith\\Desktop\\SeleniumHomeTask\\failure.png";
    private static final String ELEMENT_SCREENSHOT_PATH="C:\\Users\\bindigari_rohith\\Desktop\\SeleniumHomeTask\\element-failure.png";
    public void takeScreenshotOfDriver(WebDriver webDriver) throws IOException {
        File screenshotFile=((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile,new File(DRIVER_SCREENSHOT_PATH));
        Allure.addAttachment("Driver Screenshot", FileUtils.openInputStream(screenshotFile));
    }
    public void takeScreenshotOfElement(WebDriver webDriver, WebElement webElement) throws IOException {
        File elementFile = webElement.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(elementFile, new File(ELEMENT_SCREENSHOT_PATH));
        Allure.addAttachment("Element Screenshot",FileUtils.openInputStream(elementFile));
    }

}
