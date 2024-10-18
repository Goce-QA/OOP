package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LinksPage {
    protected static WebDriver driver;
    String createdMessage = "Link has responded with staus 201 and status text Created";
    String noContentMessage = "Link has responded with staus 204 and status text No Content";
    String movedMessage = "Link has responded with staus 301 and status text Moved Permanently";
    String badRequestMessage = "Link has responded with staus 400 and status text Bad Request";
    String unauthorizedMessage = "Link has responded with staus 401 and status text Unauthorized";
    String forbiddenMessage = "Link has responded with staus 403 and status text Forbidden";
    String notFoundMessage = "Link has responded with staus 404 and status text Not Found";

    String linkMessage;

    private By createdLink =By.xpath("//*[@id='created']");
    private By noContent = By.xpath("//*[@id='no-content']");
    private By moved = By.xpath("//*[@id='moved']");
    private By badRequest = By.xpath("//*[@id='bad-request']");
    private By unauthorized = By.xpath("//*[@id='unauthorized']");
    private By forbidden = By.xpath("//*[@id='forbidden']");
    private By notFound = By.xpath("//*[@id='invalid-url']");
    private By messageText = By.xpath("//*[@id='linkResponse']");


    public LinksPage(WebDriver driver){
        LinksPage.driver = driver;
    }

    public void clickOnLinks() throws InterruptedException {
        driver.findElement(createdLink).click();
        Thread.sleep(2000);
        linkMessage = driver.findElement(messageText).getText();
        Assert.assertEquals(createdMessage , linkMessage);
        System.out.print("\n"+"Assertion has passed"+"\n");

        driver.findElement(noContent).click();
        Thread.sleep(2000);
        linkMessage = driver.findElement(messageText).getText();
        Assert.assertEquals(noContentMessage , linkMessage);
        System.out.print("\n"+"Assertion has passed"+"\n");

        driver.findElement(moved).click();
        Thread.sleep(2000);
        linkMessage = driver.findElement(messageText).getText();
        Assert.assertEquals(movedMessage , linkMessage);
        System.out.print("\n"+"Assertion has passed"+"\n");

        driver.findElement(badRequest).click();
        Thread.sleep(2000);
        linkMessage = driver.findElement(messageText).getText();
        Assert.assertEquals(badRequestMessage , linkMessage);
        System.out.print("\n"+"Assertion has passed"+"\n");

        driver.findElement(unauthorized).click();
        Thread.sleep(2000);
        linkMessage = driver.findElement(messageText).getText();
        Assert.assertEquals(unauthorizedMessage , linkMessage);
        System.out.print("\n"+"Assertion has passed"+"\n");

        driver.findElement(forbidden).click();
        Thread.sleep(2000);
        linkMessage = driver.findElement(messageText).getText();
        Assert.assertEquals(forbiddenMessage , linkMessage);
        System.out.print("\n"+"Assertion has passed"+"\n");

        driver.findElement(notFound).click();
        Thread.sleep(2000);
        linkMessage = driver.findElement(messageText).getText();
        Assert.assertEquals(notFoundMessage , linkMessage);
        System.out.print("\n"+"Assertion has passed"+"\n");

    }
}
