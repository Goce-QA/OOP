import org.testng.annotations.*;

public class TestNGClass {
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }
}
