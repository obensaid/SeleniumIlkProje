package com.tecproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\acer aspireS7\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://google.com");
        webDriver.navigate().to("https://www.youtube.com/watch?v=BsWb8NpfYYw");

        String sayfaTitle = webDriver.getTitle();
        String sayfaUrl = webDriver.getCurrentUrl();

        System.out.println(sayfaTitle);
        System.out.println(sayfaUrl);
    }
}
