package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.BaseClass;

public class Actions1 extends BaseClass {
    public SoftAssert assertt = new SoftAssert();


    @Test
    public void action() throws InterruptedException {
        Thread.sleep(5000);
        Actions action = new Actions(driver);
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
       // action.scr;
        driver.findElement(By.xpath("//*[@class='card-body']")).click();
        Thread.sleep(5000);
    }
}
