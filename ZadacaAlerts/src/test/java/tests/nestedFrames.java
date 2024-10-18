package tests;
//Open: https://demoqa.com/
//Navigate to the Nested Frames page
//Verify the text in the parent frame
//Verify the text in the child frame

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.BaseClass;

public class nestedFrames extends BaseClass {
    public SoftAssert assertt=new SoftAssert();

    @Test
    public void nestedFrame() throws InterruptedException{
        driver.navigate().to("https://demoqa.com/nestedframes");
        String originalHeading = driver.getWindowHandle();
        driver.switchTo().frame("frame1");
        String parentFrame = driver.findElement(By.xpath("/html/body")).getText();
        System.out.println(parentFrame);
        assertt.assertEquals("Parent frame", parentFrame);

//        driver.switchTo().window(originalHeading);
//        driver.switchTo().frame("frame1");
        driver.switchTo().frame(0);
        String childFrame = driver.findElement(By.xpath("/html/body/p")).getText();
        System.out.println(childFrame);
        assertt.assertEquals("Child Iframe", childFrame);

    }

}
