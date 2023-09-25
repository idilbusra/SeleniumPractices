package ssg;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;


public class ActionsTestleri extends TestBase {
    @Test
    public void moveToElement() {
        driver.get("https://the-internet.herokuapp.com/jqueryui/menu");

        WebElement menu1 = driver.findElement(By.id("ui-id-3"));
        WebElement menu2 = driver.findElement(By.id("ui-id-4"));
        WebElement menu3 = driver.findElement(By.id("ui-id-5"));

        Actions actions = new Actions(driver);
        actions.moveToElement(menu1).perform();
        bekle(1);
        actions.moveToElement(menu2).perform();
        bekle(1);
        actions.click(menu3).perform();

    }


    @Test
    public void contextClick() {
        driver.get("https://the-internet.herokuapp.com/context_menu");

        WebElement hotSpot = driver.findElement(By.id("hot-spot"));

        Actions actions = new Actions(driver);
        actions.contextClick(hotSpot).perform();

        driver.switchTo().alert().accept();

    }

    @Test
    public void dragAndDrop() {
        driver.get("https://demoqa.com/droppable");

        WebElement dragElement = driver.findElement(By.id("draggable"));
        WebElement dropElement = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragElement, dropElement).perform();

    }

}
