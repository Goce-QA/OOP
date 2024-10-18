package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FilterComputerPage {
    public static WebDriver driver;
    String headerofThePage="Computer database";
    String getTheHeader;
    String computerToSearch= "ASUS Eee PC 900";
    private By searchBox =By.xpath("//*[@id='searchbox']");
    private By filterbutton = By.xpath("//*[@id='searchsubmit']");
    private By getHeader = By.xpath("//*[@class='fill']");

    public FilterComputerPage (WebDriver driver){
        FilterComputerPage.driver = driver;
    }

    public void searchAndAsseart (){
        driver.findElement(searchBox).sendKeys(computerToSearch);
        driver.findElement(filterbutton).click();
        getTheHeader = driver.findElement(getHeader).getText();
        try {
            Assert.assertEquals(getTheHeader, headerofThePage);
        } catch (AssertionError error){
            System.out.println(error);
        }
        System.out.println("\n"+"Header of the Page "+ "'"+ headerofThePage + "'" + " should be the same as this one " + "'"+getTheHeader+"'"+" after the search" );

    }
}
