package practices2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.youtube.com");

        System.out.println("Window's Sizes = " + driver.manage().window().getSize()); //Window's Sizes = (1552, 832)

        System.out.println("Window's Positions = " + driver.manage().window().getPosition()); //Window's Positions = (-8, -8)

        driver.manage().window().setSize(new Dimension(800,1200));
        Thread.sleep(3000);

        driver.manage().window().setPosition(new Point(500,400));
        Thread.sleep(3000);

        driver.close();
    }
}
