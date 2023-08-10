package practices2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

        driver.get("https://www.amazon.com");
        driver.navigate().refresh();
        driver.navigate().refresh();

        WebElement searchBox= driver.findElement(By.name("field-keywords"));
        searchBox.sendKeys("Nutella", Keys.ENTER);
        Thread.sleep(3000);

        WebElement firstImage = driver.findElement(By.className("s-image"));
        firstImage.click();

        Thread.sleep(3000);

        driver.close();







    }
}
