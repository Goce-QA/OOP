import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
//• Open: https://computer-database.gatling.io/computers
//• Navigate to results 61-70
//• Get the names of all computers in the list.
//• Print the names in console output
//• Print the Introduced date next to each name in console output

public class Vezba5 {
    @Test

    public void test() throws InterruptedException {
        int i=1;
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://computer-database.gatling.io/computers");
        Thread.sleep(500);

        By nextButton = By.xpath("//*[text()='Next →']");
        driver.findElement(nextButton).click();
        Thread.sleep(500);
        driver.findElement(nextButton).click();
        Thread.sleep(500);
        driver.findElement(nextButton).click();
        Thread.sleep(500);
        driver.findElement(nextButton).click();
        Thread.sleep(500);
        driver.findElement(nextButton).click();
        Thread.sleep(500);
        driver.findElement(nextButton).click();
        Thread.sleep(500);
        List<WebElement> computers= driver.findElements(By.xpath("//tbody/tr/td[1]"));


        for (WebElement c : computers){
            System.out.print(c.getText() + "\t\t");

            System.out.println(driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]")).getText());
            i++;

        }
        driver.quit();

    }
}
