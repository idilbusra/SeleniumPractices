package ssg;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;


public class Alert extends TestBase {
    @Test
    public void simpleAlert() {
        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("alertButton")).click();

        bekle(3);

        org.openqa.selenium.Alert alert = driver.switchTo().alert();
        String alertMesaj = alert.getText();
        System.out.println(alertMesaj);

        alert.accept();
    }

    @Test
    public void confirmAlert() {
        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("confirmButton")).click();

        bekle(2);
        System.out.println("Alert Mesajı: " + driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

        bekle(3);
    }

    @Test
    public void promptAlert() {
        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("promtButton")).click();

        org.openqa.selenium.Alert alert = driver.switchTo().alert();

        bekle(3);
        System.out.println("Alert Mesajı: " + alert.getText());
        alert.sendKeys("Gürkay");
        alert.accept();
        bekle(3);
    }

    @Test
    public void noAlertPresentException() {
        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("timerAlertButton")).click();

        bekle(2);

        driver.switchTo().alert().accept();
    }

    @Test
    public void unhandledAlertException() {
        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("timerAlertButton")).click();

        bekle(6);

        driver.findElement(By.id("promtButton")).click();
    }

    @Test
    public void authenticationPopup() {
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        bekle(5);
    }

}