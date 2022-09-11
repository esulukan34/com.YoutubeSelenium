package video4_WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https:www.amazon.com sayfasina gidin
        driver.get("https://www.amazon.com");

        // 2- arama cubuguna "Nutella" yazdirin
        WebElement arananKelime =driver.findElement(By.id("twotabsearchtextbox"));
        // 3- Nutella yazdiktan sonra ENTER'a basarak arama islemi yapin
        arananKelime.sendKeys("Nutella", Keys.ENTER);

        // 4- Bulunan sonuc sayisini yazdirin
        WebElement sonuc = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonuc.getText() +" bulundu");
    }
}
