package com.tecproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\acer aspireS7\\Documents\\" +
                        "selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://yotube.com");
        String titleYoutube = webDriver.getTitle();
        if (titleYoutube.toLowerCase().contains("video")){
            System.out.println("video iceriyor");
        }else{
            System.out.println("hayir icermiyor");
        }
        webDriver.quit();
    }
}
