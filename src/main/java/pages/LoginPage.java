package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Getter;

@Getter
public class LoginPage extends PageObject {

    @FindBy(xpath = "//a[@id='topbar-login-button']")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@id='login_mail']")
    private WebElement emailTextField;

    @FindBy(xpath = "//input[@id='login_password']")
    private WebElement passwordTextField;

    @FindBy(xpath = "//button[@id='login_form_submit']")
    private WebElement submitButton;

    LoginPage(final WebDriver driver) {
        super(driver);
    }
}
