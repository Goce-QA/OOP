import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Да се кликне на логин кпчето, да се внесат одпосле username и password, да се кликне логин.
//По желба да се кликне на некој производ.
//Да се искуца со користење на методи (By.id, By.name, etc.)
//Да се искуца со користење на CSS селектори
//Да се искуца со користење на xPath селектори
public class ByClass {
    @Test
    public void test() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);

        driver.findElement(By.className("input_error form_input")).sendKeys("error_user");
        Thread.sleep(3000);
        driver.findElement(By.className("input_error form_input")).sendKeys("secret_sauce");
        Thread.sleep(3000);
        driver.findElement(By.className("submit-button btn_action")).click();
        Thread.sleep(3000);

        driver.quit();
    }
}
