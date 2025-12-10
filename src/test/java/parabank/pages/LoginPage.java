package parabank.pages;

import parabank.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(name = "username")
    private WebElement usernameInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(css = "input[value='Log In']")
    private WebElement loginBtn;

    @FindBy(css = ".error")
    private WebElement errorMessage;

    public void enterUsername(String username) {
        type(usernameInput, username);
    }

    public void enterPassword(String password) {
        type(passwordInput, password);
    }

    public void clickLogin() {
        click(loginBtn);
    }

    public String getErrorMessage() {
        return getText(errorMessage);
    }
}
