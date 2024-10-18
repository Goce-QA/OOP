package utisl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;

public class DataProvidersClass {


    @DataProvider(name = "textbox")
    public Object[][] textBox() {

        String fullName = "Goce Andonoski";
        String email = "goce.andonoski@gmail.com";
        String addresscurent = "Taftalidze 1";
        String addresspermanent = "Prilep";
    }
}
