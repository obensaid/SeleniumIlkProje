package com.tecproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {
    //java projemize chromedriver i tanittik
        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer aspireS7\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
       //seleniumile ilgli ilk kodumuz
        // webdriver nesnesi olusturarak chrome driveri kullanabilir hale getirdik
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.com");
        webDriver.close();
        //webDriver.quit();


    }
}
