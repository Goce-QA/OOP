package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateComputerPage {
    public static WebDriver driver;
    private By addNewConputerButton = By.xpath("//*[@id='add']");
    private By computerName = By.xpath("//*[@id='name']");
    private By introducedDate = By.xpath("//*[@id='introduced']");
    private By discontinuedDate = By.xpath("//*[@id='discontinued']");
    private By createThisComputer = By.xpath("//*[@class='btn primary']");

    public CreateComputerPage(WebDriver driver){
        CreateComputerPage.driver = driver;

    }
    public void newComputer() {

        driver.findElement(addNewConputerButton).click();

        driver.findElement(computerName).sendKeys("Asus TUF F17");

        driver.findElement(introducedDate).sendKeys("2022-04-12");

        driver.findElement(discontinuedDate).sendKeys("2024-02-24");

        Select company = new Select(driver.findElement(By.xpath("//*[@id='company']")));

        company.selectByValue("36");

        driver.findElement(createThisComputer).click();

    }

}
