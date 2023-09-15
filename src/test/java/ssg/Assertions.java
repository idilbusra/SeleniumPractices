package ssg;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Assertions extends TestBase {
     /*
    Test Görevi:
        https://www.kitapyurdu.com/ adresine gidiniz.
        Anasayfanın açıldığını doğrulayınız (Url, Title, Logo)
        Arama motorunda "java" kelimesini aratınız.
        Ürün listesinin dolu olduğunu doğrulayınız.
        Arama sonuçlarının "java" kelimesini içerdiğini doğrulayınız.
        Arama sonuçlarının "javascript" kelimesini içermediğini doğrulayınız.
    */
     @Test
     public void assertionsTestleri() {
         // Kitap Yurdu sitesine git
         driver.get("https://www.kitapyurdu.com/");

         // URL ile doğrula
         String expectedUrl = "https://www.kitapyurdu.com/";
         String actualUrl = driver.getCurrentUrl();
         Assert.assertEquals(expectedUrl, actualUrl);

         // Title ile doğrula
         String expectedTitle = "Kitapyurdu";
         String actualTitle = driver.getTitle();
         Assert.assertTrue(actualTitle.contains(expectedTitle));

         // Logo ile doğrula
         WebElement logo = driver.findElement(By.cssSelector("[src*='wh:d8e078ec3']"));
         Assert.assertTrue(logo.isDisplayed());

         // Arama motorunda "java" kelimesini arat
         WebElement aramaMotoru = driver.findElement(By.id("search-input"));
         aramaMotoru.sendKeys("java", Keys.ENTER);

         // Ürün listesinin dolu olduğunu doğrula
         List<WebElement> kitapListesi = driver.findElements(By.cssSelector("[class=name]"));
         Assert.assertNotNull(kitapListesi);

         // Arama sonuçlarının "java" kelimesini içerdiğini doğrula
         // Arama sonuçlarının "javascript" kelimesini içermediğini doğrula
         WebElement aramaSonucBasligi = driver.findElement(By.tagName("h1"));
         Assert.assertTrue(aramaSonucBasligi.getText().contains("java"));
         Assert.assertFalse(aramaSonucBasligi.getText().contains("javascript"));

         for (WebElement kitap : kitapListesi) {
             Assert.assertTrue(kitap.getText().contains("java")
                     || kitap.getText().contains("Java")
                     || kitap.getText().contains("JAVA"));

             Assert.assertFalse(kitap.getText().contains("javascript")
                     || kitap.getText().contains("Javascript")
                     || kitap.getText().contains("JavaScript")
                     || kitap.getText().contains("JAVASCRIPT"));
         }
     }
}
