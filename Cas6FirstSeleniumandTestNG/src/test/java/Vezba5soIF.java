import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Vezba5soIF {
    @Test
    public void test() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://computer-database.gatling.io/computers");
        Thread.sleep(1000);
        By nextButton = By.xpath("//*[text()='Next →']");
        driver.findElement(By.xpath("//a[text() ='Next →']")).click();
        driver.findElement(By.xpath("//a[text() ='Next →']")).click();
        driver.findElement(By.xpath("//a[text() ='Next →']")).click();
        driver.findElement(By.xpath("//a[text() ='Next →']")).click();
        driver.findElement(By.xpath("//a[text() ='Next →']")).click();
        driver.findElement(By.xpath("//a[text() ='Next →']")).click();
        List<WebElement> computers = driver.findElements(By.xpath("//tbody/tr/td[1]"));
        for (
                WebElement computreNames : computers) {
            //System.out.println(computreNames.getText());
        }

        List<WebElement> data = driver.findElements(By.xpath("//tbody/tr/td[2]"));
        for (WebElement years : data) {
            //System.out.println(years.getText());
        }
        if (data.size() == computers.size()) {
            for (int i = 0; i < computers.size(); i++) {
                String counter = computers.get(i).getText();
                String years = data.get(i).getText();
                System.out.println(counter + "\t\t" + years);
            }
        }
        driver.quit();
    }
}
