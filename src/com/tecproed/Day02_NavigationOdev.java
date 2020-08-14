package com.tecproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {
    public static void main(String[] args) {
        //ilk once  google .com a gidiniz
        //buradanyoutube gidiniz
        //google,coma geri gidiniz
        //sonra tekrar youtube a  geri gidiniz
        //ve yenileyin
        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer aspireS7\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://google.com");
        webDriver.navigate().to("http://youtube.com");
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.quit();

    }
}
