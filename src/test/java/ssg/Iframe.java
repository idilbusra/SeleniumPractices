package ssg;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Iframe extends TestBase {

    @Test
    public void iframeTesti() {
        driver.get("https://the-internet.herokuapp.com/iframe");

        WebElement baslik = driver.findElement(By.tagName("h3"));
        System.out.println(baslik.getText());

        driver.switchTo().frame("mce_0_ifr");

        WebElement paragraf = driver.findElement(By.tagName("p"));
        System.out.println(paragraf.getText());

        driver.switchTo().parentFrame();
        System.out.println(baslik.getText());
    }
}
