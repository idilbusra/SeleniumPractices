package practices03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Task Steps
        //    1.siteye git
        driver.get("https://www.alkapida.com/");

        //    2.siteye gittigini kontrol et
        String actualData_URL = driver.getCurrentUrl();
        String expectedData_URL = "https://www.alkapida.com/";

        if (actualData_URL.contains(expectedData_URL)){
            System.out.println("Siteye giris yapildi");
        }else System.out.println("Siteye giris yapilamadi");

        //    3.hesap olustur butonuna tikla
        WebElement hesapOlusturButonu = driver.findElement(By.cssSelector(".fa.fa-pencil-alt"));
        hesapOlusturButonu.click();
        Thread.sleep(3000);
        //    4.Giriş butonuna tikla
        WebElement girisButonu = driver.findElement(By.cssSelector(".fa.fa-user"));
        girisButonu.click();
        Thread.sleep(3000);
        //    5.Tekrar hesap olustur butonuna tikla
        WebElement tekrarHesapButonu = driver.findElement(By.cssSelector(".fa.fa-pencil-alt"));
        tekrarHesapButonu.click();
        //    6.Adiniz bolumune "Busra" gir
        WebElement isimGirisi = driver.findElement(By.id("FirstName"));
        isimGirisi.sendKeys("Busra");
        //    7.Soyadiniz bolumune "Surname" gir.
        WebElement soyisimGirisi = driver.findElement(By.id("LastName"));
        soyisimGirisi.sendKeys("Surname");
        //    8.FakeMail'den fake mail al
        //    9.fakemail adresine git
        //    10.email kutusuna git email adresini al
        //    11.email adresin fakeMailden alinan adresi gir
        //    12.Ceptelefonu bilgilerini gir
        //    13.Önemli kampanyalardan eposta ile haberdar olmak istiyorum, kutusuna tikla
        //    14.Sifre kutusuna sifre kurallarina uygun sifre gir
        //    Şifrenizde 8 veya daha fazla karakter kullanın.
        //    Şifrenizin en az bir harf içermesine dikkat edin.
        //    Şifrenizin en az bir sayı içermesine dikkat edin.
        //
        //    15.Sifre tekrar kutusuna ayni sifreyi tekrar gir
        //    16.Hesabimi olustur butonuna tikla
        //    17.Mevcut bilgilerle giris yap


    }

}
