import org.testng.TestNG;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

public class TestNGExample {
    private int number;
    private final String USER_NAME = "abobus04";
    private final String USER_PASSWORD = "1408228";

    @BeforeClass
    public void setup(){
        number = 2;
    }

    @AfterClass
    public void tearDown(){
        number = 0;
    }

    @Test(groups = "regress")
    public void simple_calc_test(){
        assertEquals(2 + 2, 4, "Wrong number");
    }

    @Test
    public void simple_calc_test2(){
        assertEquals(number + 2, 4, "Wrong number");
    }

    @Test(description = "parameterized test")
    @Parameters({"name", "password"})
    public void parameterized_test(String name, String password){
        assertEquals(USER_NAME, name, "Wrong user name");
        assertEquals(USER_PASSWORD, password, "Wrong user password");
    }

    @DataProvider(name = "credits")
    public static Object[][] creditsProvider(){
        return new Object[][]{
                {"bebrus01", "abobus02"},
                {"bebrus01", "1408228"},
                {"abobus04", "abobus02"},
                {"abobus04", "1408228"},
        };
    }

    @Test(dataProvider = "credits")
    public void data_provider_test(String name, String password){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(name, USER_NAME, "Wrong user name");
        softAssert.assertEquals(password, USER_PASSWORD, "Wrong password name");
        softAssert.assertAll();
    }
}
