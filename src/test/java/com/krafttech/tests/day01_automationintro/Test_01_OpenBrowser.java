package com.krafttech.tests.day01_automationintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_01_OpenBrowser {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com"); // Baştaki "https://" kısmı olmadan adrese gitmez
        driver.get("https://facebook.com");   // ama "www." kısmı olmadan da adrese gider

        String actualTitle = driver.getTitle();




    }
}
