package practices1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        String actualTitle= driver.getTitle();

        System.out.println("Amazon page's title is : " + actualTitle); //Amazon page's title is : Amazon.com

        String actualUrl= driver.getCurrentUrl();

        System.out.println("Amazon page's Url is : " + actualUrl); //Amazon page's Url is : https://www.amazon.com/






    }

}
