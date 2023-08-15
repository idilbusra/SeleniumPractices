package practices03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Task Steps
        //    1.siteye git
        //    2.siteye gittigini kontrol et
        //    3.hesap olustur butonuna tikla
        //    4.hesap olustur butonuna tikla
        //    5.Tekrar hesap olustur butonuna tikla
        //    6.Adiniz bolumune "Busra" gir
        //    7.Soyadiniz bolumune "Surname" gir.
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
