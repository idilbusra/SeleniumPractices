package ssg;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class FileUploadTesti extends TestBase {
    @Test
    public void fileUploadTesti() {
        //Siteye gidilir
        driver.get("https://testpages.eviltester.com/styled/file-upload-test.html");

        // Dosya yolunu tanımla
        String farkliKisim = System.getProperty("user.home");
        String ortakKisim = "\\Downloads\\deneme.txt";
        String dosyaYolu = farkliKisim + ortakKisim;

        // Dosya seç butonuna tıkla
        WebElement dosyaSecButonu = driver.findElement(By.id("fileinput"));
        dosyaSecButonu.sendKeys(dosyaYolu);

        WebElement uploadButonu = driver.findElement(By.name("upload"));
        uploadButonu.click();

        WebElement yuklenenDosya = driver.findElement(By.id("uploadedfilename"));

        // Dosya yüklenene kadar bekle
        visibleWait(yuklenenDosya, 60);

        // Dosyanın yüklendiğini doğrula
        Assert.assertTrue(yuklenenDosya.isDisplayed());

    }
}
