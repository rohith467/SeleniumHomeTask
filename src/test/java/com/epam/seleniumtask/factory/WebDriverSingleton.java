package com.epam.seleniumtask.factory;

import com.epam.seleniumtask.exception.NotADefaultBrowserException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverSingleton {
    private static WebDriver driver;

    public static WebDriver getInstance(String browser) {
        if (driver == null) {
            synchronized (WebDriverSingleton.class) {
                if (driver == null) {
                    if (browser.equals("chrome")) {
                        driver = new ChromeDriver();
                    }
                }
                if(driver==null) {
                    if (browser.equals("firefox")) {
                        driver = new FirefoxDriver();
                    }
                }
                if(driver==null) {
                    if (browser.equals("edge")) {
                        driver = new EdgeDriver();
                    }
                }
            }
        }
        return driver;
    }
    public static WebDriver createWebDriver(String browser) {
        return switch (browser.toLowerCase()) {
            case "chrome" -> getInstance("chrome");
            case "edge" -> getInstance("edge");
            case "firefox" -> getInstance("firefox");
            default -> throw new NotADefaultBrowserException(browser);
        };
    }
    public static void closeInstance(String browser){
        if(getInstance(browser)!=null){
            getInstance(browser).close();
        }
    }
}

