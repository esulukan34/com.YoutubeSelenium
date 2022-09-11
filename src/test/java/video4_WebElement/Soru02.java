package video4_WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru02 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https:www.facebook.com adresine gidin
        driver.get("https://www.facebook.com");

        //2-cookies cikarsa kabul et butonuna basin

        //3- e-posta adresine rastgele bir mail girin
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("siradanwyzklm@gmail.com");

        //4- sifre kismina rastgele bir sifre girin
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");

        //5- giris yap butonuna basin
        driver.findElement(By.xpath("//button[@name='login']")).click();

        //6- uyari olarak "Girdiğin e-posta bir hesaba bağlı değil.
        // Hesabını bul ve giriş yap." mesajinin ciktigin test edin
        WebElement sonucYazisiElementi = driver.findElement(By.xpath("//div[@class='_9ay7']"));
        String expectedSonucYazisi = "Girdiğin e-posta bir hesaba bağlı değil. Hesabını bul ve giriş yap.";
        String actualSonucYazisi = sonucYazisiElementi.getText();
        if(expectedSonucYazisi.equals(actualSonucYazisi)){
            System.out.println("Test PASSED");
        }else
            System.out.println("Test FAILED");

        // Sayfayi kapatin
        //driver.close();
    }
}
