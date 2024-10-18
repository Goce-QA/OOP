package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.BaseClass;

//Open: https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm
//In the continents dropdown menu, select the second continent from the list
//Verify that the continent with index 2 is Africa
//Verify that the dropdown menu is not multiselect
public class vezbaDropDown extends BaseClass {
    public SoftAssert assertt=new SoftAssert();

    @Test
    public void vezbaDropDownMenu() throws InterruptedException {
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        Select select = new Select(driver.findElement(By.id("state")));
        select.selectByIndex(2);
        Thread.sleep(5000);
        assertt.assertTrue(true, "Uttar Pradesh");

}
    @Test

    public void exercise3() throws InterruptedException {

        Thread.sleep(5000);

        driver.manage().window().maximize();

        driver.navigate().to("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

        Select s = new Select(driver.findElement(By.id("state")));

        s.selectByValue("Uttar Pradesh");

        Assert.assertEquals(s.getOptions().get(3).getText(), "Haryana");

        Assert.assertFalse(s.isMultiple());

        Thread.sleep(5000);

    }
}
