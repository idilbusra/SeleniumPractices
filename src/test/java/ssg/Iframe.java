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


    @Test
    public void nestedFrameTesti() {
        driver.get("https://demoqa.com/nestedframes");

        WebElement metin = driver.findElement(By.xpath("//*[contains(text(),'arent frame')]"));
        System.out.println(metin.getText());

        WebElement baslik = driver.findElement(By.className("main-header"));
        System.out.println(baslik.getText());

        WebElement iframe = driver.findElement(By.xpath("//iframe[@src='/sampleiframe']"));
        driver.switchTo().frame(iframe);

        WebElement ilkFrameMetni = driver.findElement(By.tagName("body"));
        System.out.println(ilkFrameMetni.getText());

        driver.switchTo().frame(0);
        WebElement childFrameMetni = driver.findElement(By.tagName("body"));
        System.out.println(childFrameMetni.getText());

        driver.switchTo().defaultContent();
        System.out.println(baslik.getText());

    }
}