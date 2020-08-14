package com.tecproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver",
            "C:\\Users\\acer aspireS7\\Documents\\" +
            "selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("http://amazon.com");
        String sayfaBilgisi  = webDriver.getTitle();
        if (sayfaBilgisi.toLowerCase().contains("car")){
            System.out.println("Car kelimesi geciyor"+sayfaBilgisi);
        }else{
            System.out.println("Car kelimesi gecmiyor"+sayfaBilgisi);

        }
webDriver.quit();

    }
}

