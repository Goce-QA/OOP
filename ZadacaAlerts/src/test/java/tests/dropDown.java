package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utils.BaseClass;

import java.util.List;

public class dropDown extends BaseClass {
    @Test
    public void dropdownSelectOptionMenu() throws InterruptedException {
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/select-menu");
        Select s = new Select(driver.findElement(By.id("oldSelectMenu")));
        s.selectByValue("3");
        Thread.sleep(2000);
        s.selectByIndex(0);
        Thread.sleep(2000);
        s.selectByVisibleText("Magenta");
        Thread.sleep(2000);
    }
    private void selectFromList(String id, String value) {
        List<WebElement> myList = driver.findElements(By.xpath("//select[@id='" + id + "']/option"));
        for (WebElement e: myList) {
            if (e.getText().equals(value)) {
                System.out.println(e.getText());
                e.click();
                break;
            }
        }
    }
    @Test
    public void dropdownListOptionMenu() throws InterruptedException {
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/select-menu");
        Thread.sleep(5000);
        selectFromList("oldSelectMenu", "Yellow");
        Thread.sleep(2000);
        selectFromList("oldSelectMenu", "Indigo");
        Thread.sleep(2000);
    }
    @Test
    public void multiselect() throws InterruptedException {
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/select-menu");
        Select s = new Select(driver.findElement(By.id("cars")));
        s.selectByValue("saab");
        Thread.sleep(2000);
        s.selectByIndex(0);
        Thread.sleep(2000);
        s.selectByVisibleText("Audi");
        Thread.sleep(2000);
        s.deselectByIndex(0);
        Thread.sleep(2000);
        s.deselectAll();
        Thread.sleep(2000);
    }
    @Test
    public void multiselectListOptionMenu() throws InterruptedException {
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/select-menu");
        selectFromList("cars", "Saab");
        Thread.sleep(2000);
        selectFromList("cars", "Audi");
        Thread.sleep(2000);
        selectFromList("cars", "Saab");
        Thread.sleep(2000);
    }

    @Test
    public void testTest () throws InterruptedException {

        Actions actions = new Actions(driver);

        driver.navigate().to("https://magento.softwaretestingboard.com/");
        Thread.sleep(2000);
        WebElement menMenu = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]/a/span[1]"));
        actions.moveToElement(menMenu).perform();
        Thread.sleep(2000);

        WebElement topsMenu = driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]"));
        actions.moveToElement(topsMenu).perform();
        Thread.sleep(2000);

        WebElement jacketsMenue = driver.findElement(By.xpath("//*[@id=\"ui-id-19\"]"));
        jacketsMenue.click();
        Thread.sleep(2000);

        WebElement styleMenu = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[2]/div/div[2]/div/div[1]/div[1]"));
        styleMenu.click();
        Thread.sleep(2000);

        WebElement item1FromMenu = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[2]/div/div[2]/div/div[1]/div[2]/ol/li[9]"));
        item1FromMenu.click();
        Thread.sleep(2000);

        scrollDown(300);
        Thread.sleep(2000);

        WebElement jacket1Size = driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-170\"]"));
        jacket1Size.click();
        Thread.sleep(2000);

        WebElement jacket1Color = driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-49\"]"));
        jacket1Color.click();
        Thread.sleep(2000);

        WebElement jacket1AddToCart = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[4]/div/div[1]/form/button/span"));
        jacket1AddToCart.click();
        Thread.sleep(2000);

        WebElement clearAll = driver.findElement(By.xpath("//*[@id=\"layered-filter-block\"]/div[2]/div[2]/a/span"));
        clearAll.click();
        Thread.sleep(2000);

        WebElement styleMenu1 = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[2]/div/div[2]/div/div[1]/div[1]"));
        styleMenu1.click();
        Thread.sleep(2000);

        WebElement item2FromMenu = driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[3]/a"));
        item2FromMenu.click();
        Thread.sleep(2000);

        Select s = new Select(driver.findElement(By.id("sorter")));
        s.selectByValue("name");
        Thread.sleep(2000);

        scrollDown(900);
        Thread.sleep(2000);

        WebElement jacket2Size = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/ol/li[6]/div/div/div[3]/div/div/div[5]"));
        jacket2Size.click();
        Thread.sleep(2000);

        WebElement jacket2Color = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/ol/li[6]/div/div/div[3]/div[2]/div/div[1]"));
        jacket2Color.click();
        Thread.sleep(2000);

        WebElement jacket2AddToCart = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[6]/div/div/div[4]/div/div[1]/form/button/span"));
        jacket2AddToCart.click();
        Thread.sleep(2000);

        scrollDown(-900);
        Thread.sleep(2000);

        WebElement goToCart = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div"));
        goToCart.click();
        Thread.sleep(2000);

        WebElement proceedToCheckout = driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]"));
        proceedToCheckout.click();

    }

    public void scrollDown(int pixel) {
        ((JavascriptExecutor) driver).executeScript("scroll(0," + pixel + ")");
    }
}