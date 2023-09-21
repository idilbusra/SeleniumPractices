package ssg;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class SelectTesti extends TestBase {
    /*
    Test Görevi - 1:
        https://letcode.in/dropdowns adresine gidin.
        Meyveler menüsünün tıklanabilir olduğunu doğrulayın.
        Meyveler menüsünden Apple seçeneğini görünen metin ile seçin.
        Seçilen seçeneğin Apple olduğunu doğrulayın.
        Menüde seçilen seçeneği yazdırın.
     */

    @Test
    public void dropDownTesti01() {
        // LetCode sitesine git
        driver.get("https://letcode.in/dropdowns");

        // Meyveler menüsünün tıklanabilir olduğunu doğrula
        WebElement meyveler = driver.findElement(By.id("fruits"));
        Assert.assertTrue(meyveler.isEnabled());

        // Meyveler menüsünden Apple seçeneğini görünen metin ile seç
        Select select = new Select(meyveler);
        select.selectByVisibleText("Apple");

        // Seçilen seçeneğin Apple olduğunu doğrula
        String apple = select.getFirstSelectedOption().getText();
        Assert.assertEquals("Apple", apple);

        // Menüde seçilen seçeneği yazdır
        System.out.println("Menüde Seçili Olan Seçenek: " + apple);
    }

    @Test
    public void dropDownTesti02() {
        /*
        Test Görevi - 2:
            letcode.in/dropdowns adresine gidin.
            Programlama Dilleri menüsünün tıklanabilir olduğunu doğrulayın.
            Menüdeki son seçeneği seçin.
            Seçilen seçeneğin C# olduğunu doğrulayın.
            Listede C++ seçeneğinin olmadığını doğrulayın.
            Menüdeki tüm elemanları yazdırın.
        */

        // LetCode sitesine git
        driver.get("https://letcode.in/dropdowns");

        // Programlama Dilleri menüsünün tıklanabilir olduğunu doğrula
        WebElement programlamaDilleri = driver.findElement(By.id("lang"));
        Assert.assertTrue(programlamaDilleri.isEnabled());

        // Menüdeki son seçeneği seç
        Select select = new Select(programlamaDilleri);
        List<WebElement> programlamaDilleriListesi = select.getOptions();
        select.selectByIndex(programlamaDilleriListesi.size() - 1);
        select.selectByVisibleText(programlamaDilleriListesi.get(programlamaDilleriListesi.size() - 1).getText());

        // Seçilen seçeneğin C# olduğunu doğrulayın.
        Assert.assertEquals("C#", select.getFirstSelectedOption().getText());

        // Listede C++ seçeneğinin olmadığını doğrula
        // Menüdeki tüm elemanları yazdır
        for (WebElement programlamaDili : programlamaDilleriListesi) {
            Assert.assertNotEquals("C++", programlamaDili.getText());
            System.out.println(programlamaDili.getText());
        }
    }
}