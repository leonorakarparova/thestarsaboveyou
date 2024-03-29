package com.thestarsaboveyou.testng.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Browser {

    public static WebDriver driver;

    /**
     * Opens a new blank Chrome browser in full screen
     *  and sets an implicit wait of 10 seconds
     */
    public static void open(){
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    /**
     * Quits the browser and all it's windows
     */
    public static void quit(){
        driver.quit();
    }
}
