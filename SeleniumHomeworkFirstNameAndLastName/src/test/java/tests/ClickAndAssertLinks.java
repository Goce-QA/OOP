package tests;

import org.testng.annotations.Test;
import utils.BaseClassLinks;


public class ClickAndAssertLinks extends BaseClassLinks {


    @Test

    public void linkTest() throws InterruptedException {
        scrollDown(300);

        linksPage.clickOnLinks();

    }
}
