package video2_driverMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethodlari {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //1 - driver.get("url") --> yazdigimiz url'e gider
        driver.get("https://www.amazon.com");

        //2- driver.getTitle() --> icinde oldugu sayfanin basligini dondurur
        System.out.println("sayfa title :" +driver.getTitle());

        //3- driver.getCurrentUrl() --> icinde oldugu sayfanin URL'ini dondurur
        System.out.println(driver.getCurrentUrl());

        //4- driver.getPageSource() --> icinde oldugu sayfanin kaynak kodlarini dondurur
        System.out.println("=============================================");
        System.out.println(driver.getPageSource());
        System.out.println("=============================================");

        // 5- driver.getWindowHandle --> gittigimiz pencerenin unique olarak verilen hatch kodunu dondurur
        System.out.println(driver.getWindowHandle());

        // 6- driver.getWindowHandles() --> driver'in actigi tum sayfalarin hatch kodlarini dondurur


    }
}
