package practices03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) throws InterruptedException {

        //siteye git
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.lalshoes.com/");
        Thread.sleep(1500);

        //hesabim butonuna tikla
        WebElement hesabimElement = driver.findElement(By.xpath("(//span[@class='dropdown-toggle'])[2]"));
        hesabimElement.click();
        Thread.sleep(1500);

        //giris yap butonuna tikla
        WebElement girisYapElement = driver.findElement(By.xpath("(//a[@class='userlink-login active-hover'])[1]"));
        girisYapElement.click();

        //uyeol butonuna tikla
        WebElement uyeOlElement = driver.findElement(By.xpath("//*[text()='Üye Ol']"));
        uyeOlElement.click();
        Thread.sleep(1500);

        //isim kutusuna isim gir
        driver.findElement(By.id("FirstName")).sendKeys("Ben");
        Thread.sleep(1500);

        //soyisim kutusuna soyisim gir
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("DollarsLover");
        Thread.sleep(1500);

        //fakemailden mail al
        //fakemail icin driver olustur
        //mail kutusuna fakemailden gelen mail adresini yaz
        //sifre kutusuna sifre gir
        //kayitol/uyeol butonna tikla
        //alisverise devam et butonuna tikla

    }

}
