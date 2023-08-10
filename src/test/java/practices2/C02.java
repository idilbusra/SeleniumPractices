package practices2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class C02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.trendyol.com");
        driver.navigate().refresh();

        WebElement searchBox= driver.findElement(By.className("V8wbcUhU"));

        Thread.sleep(3000);
        searchBox.sendKeys("dress", Keys.ENTER);
        Thread.sleep(3000);

        driver.close();

    }
}
