import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Proba1 {
    @Test
    public void test() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/test-cases/");
        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[text()='\t\t\t\t\t\t\t5. Home page - Arrivals-Images-Reviews\t\t\t\t\t\t']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[text()='\t\t\t\t\t\t\t5. Home page - Arrivals-Images-Reviews\t\t\t\t\t\t']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[text()='//*[text()='\t\t\t\t\t\t\t18. Home-Arrivals-Add to Basket-Items-Check-out-Payment Gateway-Place order\t\t\t\t\t\t']']")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='accordion-222-sub_row_1-0-1-0-0']/ul//li[18]")).click();
        Thread.sleep(1000);
        String tekst=driver.findElement(By.xpath("//*[@class='ui module-accordion default rounded blue']/li[18]/div[2]/p")).getAttribute("innerHTML");
        System.out.print(tekst);
        Thread.sleep(1000);
        //[5:41 PM] Tester Academy3
        ////*[contains(@class,'title') and text()='Home Page']/../ul/li[18]/div[2]/p/br[2]

        driver.quit();
    }
}
