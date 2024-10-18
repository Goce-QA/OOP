import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//На страната https://computer-database.gatling.io/computers
//
//- Да се креира нов компјутер
//	- да се внесе дата на производство
//	- да се внесе дата на прекинување на производство
//	- да се верифицира пораката за успешно креиран компјутер
//
//Бонус
//Пребарајте го компјутерот дали постои (smiley)
//
//15 Минути дечки

public class Zadaca {
    public WebDriver driver;
    public SoftAssert assertt=new SoftAssert();

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();
        driver.get("https://computer-database.gatling.io/computers");


    }
    @Test
    public void createComputer (){

        driver.findElement(By.xpath("//*[@class='btn success']")).click();
        driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Our Computer");
        driver.findElement(By.xpath("//*[@id='introduced']")).sendKeys("2021-03-12");
        driver.findElement(By.xpath("//*[@id='discontinued']")).sendKeys("2024-06-10");
        driver.findElement(By.xpath("//*[@class='btn primary']")).click();
        String gettext= driver.findElement(By.xpath("//*[@class='alert-message warning']")).getText();
        String expextedtext ="Done ! Computer Our Computer has been created";
        assertt.assertEquals(gettext, expextedtext);
        System.out.println(expextedtext);
        System.out.println(gettext);
        System.out.println("Assert Passed");


        driver.quit();
    }

}
