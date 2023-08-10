package practices1;

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

        driver.get("https://wwww.amazon.com");
        driver.navigate().refresh();
        driver.navigate().refresh();

        String amazonTitle = driver.getTitle();
        if (amazonTitle.contains("on")) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }

        String amazonUrl=driver.getCurrentUrl();
        if(amazonUrl.contains("Amazon")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        String amazonWindowHandleValue= driver.getWindowHandle();
        System.out.println("Amazon Window Handle Value = " + amazonWindowHandleValue);

        driver.close();

    }
}
