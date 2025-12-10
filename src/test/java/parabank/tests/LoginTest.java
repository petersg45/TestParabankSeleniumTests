package parabank.tests;

import parabank.base.BaseTest;
import parabank.driver.DriverFactory;
import parabank.pages.LoginPage;
// import parabank.pages.DashboardPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void invalidLoginErrorDisplayed() {

        DriverFactory.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");

        LoginPage login = new LoginPage();

        login.enterUsername("wrong");
        login.enterPassword("wrong");
        login.clickLogin();

        Assert.assertEquals(login.getErrorMessage(), "The username and password could not be verified.");
    }
}
