package practices03;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {

    // 1-driver olusturalim
    // 2-Java class'imiza chromedriver.exe'yi tanitalim
    // 3-driver'in tum ekrani kaplamasini saglayalim
    // 4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklemesini söyleyelim.
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //5-"sahibinden.com" adresine gidelim
        // 6-Bu web adresinin sayfa basligini(title) ve adres(url)ini alalim
        driver.get("https://sahibinden.com");
        driver.navigate().refresh();
        driver.navigate().refresh();
        driver.navigate().refresh();

        String title=driver.getTitle();
        String pageURL= driver.getCurrentUrl();

        // 7-Title ve URL'nin "Kiralik" kelimesinin icerip icermedigini kontrol edelim

        if (title.contains("Kiralik")){
            System.out.println("sahibinden.com  title testi PASSED");
        }else{
            System.out.println("sahibinden.com title testi FAILED");
        }

        if (pageURL.contains("Kiralik")){
            System.out.println("URL testi PASSED");
        }else{
            System.out.println("URL testi FAILED");
        }

        // 8-Ardindan "gittigidiyor.com" adresine gidelim
        driver.navigate().to("https://gittigidiyor.com");
        driver.navigate().refresh();
        driver.navigate().refresh();
        driver.navigate().refresh();

        //9-Bu adresin basligini alalim ve "alisveris" kelimesini icerip icermedigini kontrol edelim

        String title2 =driver.getTitle();
        if (title2.contains("alisveris")){
            System.out.println("gittigidiyor.com title testi PASSED");
        }else{
            System.out.println("gittigidiyor.com title testi FAILED");
        }

        //10-Bir onceki web sayfamiza geri donelim
        //11-Sayfayi yenileyelim
        //12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        //13-Son adim olarak butun sayfalarimizi kapatmis olalim

    }



}
