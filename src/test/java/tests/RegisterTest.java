package parabank.tests;

import parabank.base.BaseTest;
import parabank.driver.DriverFactory;
import parabank.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void successfulRegistration() {

        DriverFactory.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");

        RegisterPage register = new RegisterPage();

        register.openRegisterPage();
        String uniqueUser = "user" + System.currentTimeMillis();
        register.fillForm(uniqueUser);
        register.submitRegistration();

        Assert.assertTrue(register.getSuccessMessage().contains("Your account was created successfully"));
    }
}
