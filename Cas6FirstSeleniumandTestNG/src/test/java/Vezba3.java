import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Vezba3 {
    @Test
    public void test() throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='login-button']")).click();
        Thread.sleep(1000);
        String firstelementprice=driver.findElement(By.xpath("//*[contains(@class, 'inventory_item_price')]")).getText();
        Thread.sleep(1000);
        String forthementprice=driver.findElement(By.xpath("//*[@id='inventory_container']/div/div[4]/div/div[2]/div")).getText();
        Thread.sleep(1000);


        firstelementprice=firstelementprice.replaceAll("\\$","");
        double doubleprice1 = Double.parseDouble(firstelementprice);

        forthementprice=forthementprice.replaceAll("\\$","");
        double doubleprice4 = Double.parseDouble(forthementprice);

        if(doubleprice1==doubleprice4){
            System.out.println("The price of the First and the Fourth item are the same"+firstelementprice);
       }
        else {
           System.out.println("The price of the First and the Fourth item are different\t"+firstelementprice+"\t"+"and \t"+forthementprice);
        }



        driver.quit();
    }
}
