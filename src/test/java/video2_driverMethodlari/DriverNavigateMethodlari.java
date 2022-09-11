package video2_driverMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverNavigateMethodlari {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // driver.manage().window() method'lari
        // 1- A - driver.manage().window().getSize(); --> icinde oldugumuz sayfanin pixel olarak olculerini dondurur
        System.out.println(driver.manage().window().getSize()); // (1200, 769) pixel
        System.out.println(driver.manage().window().getSize().height); // 769

        // 1- B - driver.manage().window().getPosition(); --> icinde oldugumuz sayfanin pixel olarak konumunu dondurur
        System.out.println(driver.manage().window().getPosition()); // (22, 47)

        // 1- C - driver.manage().window().setPosition(new Point(15,15));
        // icinde oldugumuz sayfanin sol alt kosesini bizim yazacagimiz pixel noktasina tasir
        driver.manage().window().setPosition(new Point(15,11));

        // 1- D - driver.manage().window().setSize(new Dimension(900,600));
        // icinde oldugumuz sayfanin sol alt kosesi sabit olarak bizim verrdigimiz olculeri getirir
        driver.manage().window().setSize(new Dimension(900,600));

        // komutu ve boyutu yenilendikten sonra tekrar yazdirirsak
        System.out.println("yeni pencere olculeri : " + driver.manage().window().getSize()); // (900, 600)
        System.out.println("yeni pencere konumu : " + driver.manage().window().getPosition()); // (15, 25)

        // 1- E - driver.manage().window().maximize(); --> icinde oldugumuz sayfa maximize yapar
        // 1- F - driver.manage().window().fullscreen(); --> icinde oldugumuz sayfa fullscreen yapar

        // Farklari gormek icin bu method'lari kullanip, baslangic noktalarini ve boyutlarini yazdiralim
        driver.manage().window().maximize();
        System.out.println("maximize konumu : " + driver.manage().window().getPosition()); // (0, 25)
        System.out.println("maximize boyut : " + driver.manage().window().getSize()); // (1440, 813)

        driver.manage().window().fullscreen();
        System.out.println("fullscreen konumu : " + driver.manage().window().getPosition()); // (0,0)
        System.out.println("fullscreen boyut : " + driver.manage().window().getSize()); // (1440, 900)

        // 1- G - driver.manage().window().minimize(); --> icinde oldugumuz minimize yapar
        driver.manage().window().minimize();

        // 2- driver.manage().timeouts();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*      wait konusunu ilerde tek basina ele alacagiz
                ancak her class Yapmamız gereken bir ayar olduğu için burada kısaca değinelim
                implicitlyWait : driver'a sayfanın yüklenmesi ve kullanacağımız webelementlerin bulunması için
                                bekleyeceği maximum süreyi belirtir.
                                driver bu süre içerisinde sayfa yüklenir/webElement bulunursa
                                beklemeden çalışmaya devam eder.
                                bu süre bitti halde sayfa yüklenememiş/webElement bulunamamışsa
                                exception vererek çalışmayı durdurur.

                Duration.ofSeconds(15) : Duration class'i Selenium-4 ile gelen zaman class'idir.
                                        Yani driver'a ne kadar bekleyecegini soyler
                                        Duration.ofSeconds(15) yerine milis,minutes,hours da kullanilabilir
         */

        /*
        NOT :   Driver'in istedigimiz islemleri yaparken sorunla karsilasmamasi icin
                driver.manage() methodlarindan
                maximize() ve implicitlyWait() methodlarinin her test'te kullanilmasi
                FAYDALI OLACAKTIR.
         */

    }
}
