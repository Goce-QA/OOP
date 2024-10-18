import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class SeleniumClass {
    @Test
    public void test1() throws InterruptedException {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized");
        FirefoxDriver driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(5000);

        driver.quit();
    }
}
