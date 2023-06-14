package com.krafttech.tests.day01_automationintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_02_WindowMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.krafttechnologie.com/");
        driver.manage().window().maximize();

        Dimension size = driver.manage().window().getSize();
        System.out.println("size = " + size);

        //driverın pointini alma -->açılan driver penceresinin sol üst noktasını verir
        Point position = driver.manage().window().getPosition();
        System.out.println("position = " + position);

        driver.manage().window().setPosition(new Point(+1000, 0));
        driver.manage().window().maximize();
        Thread.sleep(3000);


        driver.close();

    }
}
