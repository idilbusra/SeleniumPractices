package ssg;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.util.Set;

public class WindowHandle extends TestBase {
    @Test
    public void test01() {
        driver.get("https://letcode.in/windows");

        driver.findElement(By.id("home")).click();

        System.out.println("İlk Pencere Başlığı: " + driver.getTitle());

        String ilkPencere = driver.getWindowHandle();
        System.out.println("İlk Pencere Kodu: " + ilkPencere);

        Set<String> pencereler = driver.getWindowHandles();
        System.out.println("Tüm Pencere Kodları: " + pencereler);

        for (String pencere : pencereler) {
            if (!pencere.equals(ilkPencere)) {
                driver.switchTo().window(pencere);
            }
        }
        System.out.println("İkinci Pencere Başlığı: " + driver.getTitle());

        driver.switchTo().window(ilkPencere);
        System.out.println("İlk Pencere Başlığı: " + driver.getTitle());

    }
}

