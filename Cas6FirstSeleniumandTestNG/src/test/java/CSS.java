import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Да се кликне на логин кпчето, да се внесат одпосле username и password, да се кликне логин.
//По желба да се кликне на некој производ.
//Да се искуца со користење на методи (By.id, By.name, etc.)
//Да се искуца со користење на CSS селектори
//Да се искуца со користење на xPath селектори
public class CSS {
    @Test
    public void test() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);
        //by ID
        driver.findElement(By.cssSelector("input[name=user-name")).sendKeys("error_user");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[value=Login]")).click();
        Thread.sleep(3000);
        //driver.findElement(By.cssSelector());

        driver.quit();
    }
}