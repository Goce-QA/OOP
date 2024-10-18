package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    protected static WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;


    }

    public void product() {
       String productName = driver.findElement(By.xpath("//*[@class='inventory_item_name ']")).getText();
       System.out.println(productName);
    }

}
