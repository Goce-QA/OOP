import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
//• Open: https://computer-database.gatling.io/computers
//• Navigate to results 21-30
//• Get the names of all computers in the list.
//• Print the names in console output

public class Vezba4 {
    @Test

    public void test() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://computer-database.gatling.io/computers");
        Thread.sleep(1000);
        By nextButton =By.xpath("//*[text()='Next →']");
        driver.findElement(nextButton).click();
        Thread.sleep(1000);
        driver.findElement(nextButton).click();
        Thread.sleep(1000);
        List<WebElement> computers= driver.findElements(By.xpath("//tbody/tr/td[1]"));

        for (WebElement c : computers){
            System.out.println(c.getText());
        }

        driver.quit();
    }
}
