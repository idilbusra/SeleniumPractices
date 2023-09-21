package ssg;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

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
}