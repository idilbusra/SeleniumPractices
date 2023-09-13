package ssg;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class TC01 extends TestBase {
    @Test
    public void locatorsTest() {
        //Test Görevi:
        //https://www.kitapyurdu.com/ adresine gidiniz.
        driver.get("https://www.kitapyurdu.com/");

        //“En Çok Satılanlar” bölümündeki ilk ürünü tıklayın.
        List<WebElement> enCokSatilanlarListesi = driver.findElements(By.className("pr-details"));
        String ilkKitapAdi = enCokSatilanlarListesi.get(0).getText().split("\n")[0];
        enCokSatilanlarListesi.get(0).click();

        //Seçilen ürüne ait sayfanın açıldığını doğrulayınız.
        WebElement kitapAdi= driver.findElement(By.tagName("h1"));
        Assert.assertEquals(ilkKitapAdi,kitapAdi.getText());

        //“Devamını Oku…” butonuna basınız.
        WebElement devamButonu =driver.findElement(By.linkText("Devamını Oku"));
        devamButonu.click();

        //Ürünü sepete ekleyiniz.
        WebElement sepeteEkleButonu = driver.findElement(By.id("button-cart"));
        sepeteEkleButonu.click();

        //Sepete gidiniz.
        WebElement sepeteGit= driver.findElement(By.partialLinkText("epetiniz"));
        sepeteGit.click();

        //Ürüne ait kontrol kutusunu işaretleyiniz.
        WebElement kontrolKutusu = driver.findElement(By.name("cart_selection[]"));

        if (!kontrolKutusu.isSelected()){
            kontrolKutusu.click();
        }
        Assert.assertTrue(kontrolKutusu.isSelected());

        //Ürün miktarını değiştiriniz.
        WebElement urunMiktari = driver.findElement(By.name("quantity"));
        urunMiktari.clear();
        urunMiktari.sendKeys("5");
        Assert.assertEquals("5", urunMiktari.getAttribute("value"));



    }

}
