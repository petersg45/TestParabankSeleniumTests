package parabank.pages;

import parabank.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(linkText = "Register")
    private WebElement registerLink;

    @FindBy(id = "customer.firstName")
    private WebElement firstName;

    @FindBy(id = "customer.lastName")
    private WebElement lastName;

    @FindBy(id = "customer.address.street")
    private WebElement address;

    @FindBy(id = "customer.address.city")
    private WebElement city;

    @FindBy(id = "customer.address.state")
    private WebElement state;

    @FindBy(id = "customer.address.zipCode")
    private WebElement zip;

    @FindBy(id = "customer.phoneNumber")
    private WebElement phone;

    @FindBy(id = "customer.ssn")
    private WebElement ssn;

    @FindBy(id = "customer.username")
    private WebElement username;

    @FindBy(id = "customer.password")
    private WebElement password;

    @FindBy(id = "repeatedPassword")
    private WebElement confirmPassword;

    @FindBy(css = "input[value='Register']")
    private WebElement registerBtn;

    @FindBy(css = "#rightPanel p")
    private WebElement successMessage;


    public void openRegisterPage() {
        click(registerLink);
    }

    public void fillForm(String user) {
        type(firstName, "John");
        type(lastName, "Smith");
        type(address, "123 Road");
        type(city, "Boston");
        type(state, "MA");
        type(zip, "02110");
        type(phone, "1234567890");
        type(ssn, "1234");
        type(username, user);
        type(password, "Password123");
        type(confirmPassword, "Password123");
    }

    public void submitRegistration() {
        click(registerBtn);
    }

    public String getSuccessMessage() {
        return getText(successMessage);
    }
}
