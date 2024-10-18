package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.BaseClass;

public class datePicker extends BaseClass {
    public SoftAssert assertt = new SoftAssert();

    @Test
    public void datePick() throws InterruptedException {
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
        driver.findElement(By.id("datetimepicker1")).click();
        Select select = new Select(driver.findElement(By.xpath("//select[@aria-label='Month']")));
        select.selectByIndex(4);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@aria-label='Year']")).click();
        driver.findElement(By.xpath("//input[@aria-label='Year']")).sendKeys("2018");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@aria-label='May 18, 2018']")).click();
        Thread.sleep(5000);
    }

    @Test
    public void datePicker2() throws InterruptedException {
        int currentYear, selectYear = 2030, yearDifference;
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
        Thread.sleep(5000);
        driver.findElement(By.id("datetimepicker1")).click();
        Select s = new Select(driver.findElement(By.xpath("//select[@aria-label='Month']")));
        s.selectByIndex(2);
        String year = driver.findElement(By.xpath("//input[@aria-label='Year']")).getAttribute("value");
        currentYear = Integer.parseInt(year);
        yearDifference = currentYear - selectYear;
        if (yearDifference > 0) {
            for (int i = 1; i <= yearDifference; i++) {
                driver.findElement(By.xpath("//span[@class='arrowDown']")).click();
            }
        } else if (yearDifference < 0) {
            for (int i = 1; i <= Math.abs(yearDifference); i++) {
                driver.findElement(By.xpath("//span[@class='arrowUp']")).click();
            }
        }
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@aria-label='March 16, 2030']")).click();
        Thread.sleep(5000);
    }
}
