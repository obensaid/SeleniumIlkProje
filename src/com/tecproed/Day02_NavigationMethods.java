package com.tecproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer aspireS7\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();

        webDriver.get("http://google.com");
        //get methodu ile ayni islemi yapiyor
        webDriver.navigate().to("http://amazon.com");

        //asagidaki method bir sayfa geri gitmeye yariyor
        webDriver.navigate().back();

        //bu da geri  gittigimiz sayfadan tekrar sonsayfamiza gitmemize yariyor
        webDriver.navigate().forward();

        //bu method da sayfayi yenilememizi saglar
        webDriver.navigate().refresh();

    }
}
