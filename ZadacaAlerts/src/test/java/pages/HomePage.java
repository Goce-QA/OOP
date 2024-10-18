package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage {
    protected static WebDriver driver;
    String firstNameData = "Petre";
    String lastNameData = "Petkoski";
    String emailData = "p.petkoski@mail.com";
    String passwordData = "Createpassword1#";
    String alreadyCreatedMessage = "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.";




    By createAnAccount = By.xpath("//*[contains(text() , 'Create an Account')]");
    By firstName = By.xpath("//*[@id='firstname']");
    By lastName = By.xpath("//*[@id='lastname']");
    By email = By.xpath("//*[@id='email_address']");
    By password = By.xpath("//*[@id='password']");
    By confirmPassword = By.xpath("//*[@id='password-confirmation']");
    By createAccount = By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span");
    By alreadyCreated = By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div");



    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    public void createAccount () throws InterruptedException {
        driver.findElement(createAnAccount).click();
        Thread.sleep(1000);
        driver.findElement(firstName).sendKeys(firstNameData);
        Thread.sleep(1000);
        //driver.findElement(lastName).sendKeys(lastNameData);
        Thread.sleep(1000);
        driver.findElement(email).sendKeys(emailData);
        Thread.sleep(1000);
        scrollDown(400);
        Thread.sleep(1000);
        driver.findElement(password).sendKeys(passwordData);
        Thread.sleep(1000);
        driver.findElement(confirmPassword).sendKeys(passwordData);
        Thread.sleep(1000);
        driver.findElement(createAccount).click();
        Thread.sleep(1000);

        System.out.println(driver.findElement(alreadyCreated).getText());

        //Assert.assertEquals(driver.findElement(alreadyCreated).getText(), alreadyCreatedMessage);
    }

    public void productsBuying ()throws InterruptedException {

        Actions actions = new Actions(driver);

        driver.navigate().to("https://magento.softwaretestingboard.com/");
        Thread.sleep(2000);
        WebElement menMenu = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]/a/span[1]"));
        actions.moveToElement(menMenu).perform();
        Thread.sleep(2000);

        WebElement topsMenu = driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]"));
        actions.moveToElement(topsMenu).perform();
        Thread.sleep(2000);

        WebElement jacketsMenue = driver.findElement(By.xpath("//*[@id=\"ui-id-19\"]"));
        jacketsMenue.click();
        Thread.sleep(2000);

        WebElement styleMenu = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[2]/div/div[2]/div/div[1]/div[1]"));
        styleMenu.click();
        Thread.sleep(2000);

        WebElement item1FromMenu = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[2]/div/div[2]/div/div[1]/div[2]/ol/li[9]"));
        item1FromMenu.click();
        Thread.sleep(2000);

        scrollDown(300);
        Thread.sleep(2000);

        WebElement jacket1Size = driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-170\"]"));
        jacket1Size.click();
        Thread.sleep(2000);

        WebElement jacket1Color = driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-49\"]"));
        jacket1Color.click();
        Thread.sleep(2000);

        WebElement jacket1AddToCart = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[4]/div/div[1]/form/button/span"));
        jacket1AddToCart.click();
        Thread.sleep(2000);

        WebElement clearAll = driver.findElement(By.xpath("//*[@id=\"layered-filter-block\"]/div[2]/div[2]/a/span"));
        clearAll.click();
        Thread.sleep(2000);

        WebElement styleMenu1 = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[2]/div/div[2]/div/div[1]/div[1]"));
        styleMenu1.click();
        Thread.sleep(2000);

        WebElement item2FromMenu = driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[3]/a"));
        item2FromMenu.click();
        Thread.sleep(2000);

        Select s = new Select(driver.findElement(By.id("sorter")));
        s.selectByValue("name");
        Thread.sleep(2000);

        scrollDown(900);
        Thread.sleep(2000);

        WebElement jacket2Size = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/ol/li[6]/div/div/div[3]/div/div/div[5]"));
        jacket2Size.click();
        Thread.sleep(2000);

        WebElement jacket2Color = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/ol/li[6]/div/div/div[3]/div[2]/div/div[1]"));
        jacket2Color.click();
        Thread.sleep(2000);

        WebElement jacket2AddToCart = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[6]/div/div/div[4]/div/div[1]/form/button/span"));
        jacket2AddToCart.click();
        Thread.sleep(2000);

        scrollDown(-900);
        Thread.sleep(2000);

        WebElement goToCart = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div"));
        goToCart.click();
        Thread.sleep(2000);

        WebElement proceedToCheckout = driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]"));
        proceedToCheckout.click();

    }

    public void scrollDown(int pixel) {
        ((JavascriptExecutor) driver).executeScript("scroll(0," + pixel + ")");
    }
}

