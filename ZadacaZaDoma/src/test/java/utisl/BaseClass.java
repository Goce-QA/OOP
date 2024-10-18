//Да се креира тест со користење на POM, како и Array Data Provider кој
//ќе внесува информации во формата на следниот линк:
//https://demoqa.com/text-box
package utisl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class BaseClass {
    public WebDriver driver;
    public WebDriverWait wait;
    public SoftAssert assertt;
    String url = "https://demoqa.com/text-box";



    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get(url);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        assertt = new SoftAssert();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//*[@id='userName']")).sendKeys();

    }

    @AfterMethod

    public void exit (){
        driver.quit();
    }
}
