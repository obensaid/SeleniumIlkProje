package com.tecproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\acer aspireS7\\Documents\\" +
                        "selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        WebElement eMailBox = driver.findElement(By.id("email"));
        eMailBox.sendKeys("essaidelfi@hotmail.com");

        WebElement sifreKutusu = driver.findElement(By.id("pass"));
        sifreKutusu.sendKeys("sai1607ha07");
        WebElement login = driver.findElement(By.id("u_0_d"));
        login.click();
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }

        String url = driver.getCurrentUrl();
        System.out.println(url);
        if (url.contains("facebook.com/login/")){
            System.out.println("giris basarisiz");
        }else{
            System.out.println("giris basarili");
        }


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//driver.quit();

    }
}
