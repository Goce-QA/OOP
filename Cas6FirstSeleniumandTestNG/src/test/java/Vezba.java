import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//• Open: https://computer-database.gatling.io/computers
//• Filter the table for computer names containing ASCI
//• Get the name of the third computer in the filtered list.
//• Print the name in console output

public class Vezba {
    @Test
    public void test() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://computer-database.gatling.io/computers");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@required='required']")).sendKeys("ASCI");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='searchsubmit']")).click();
        Thread.sleep(3000);
        String computer = driver.findElement(By.xpath("//tbody/tr[3]/td[1]")).getText();
        Thread.sleep(3000);
        System.out.println(computer);
        driver.quit();
    }
}
