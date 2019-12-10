package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginPage extends PageObject {

    public LoginPage(final WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//a[@id=\"topbar-login-button\"]")
    private static WebElement loginButton;

    @FindBy(xpath = "//input[@id=\"login_mail\"]")
    private static WebElement loginMail;

    @FindBy(xpath = "//input[@id=\"login_password\"]")
    private static WebElement loginPassword;

    @FindBy(xpath = "//button[@id=\"login_form_submit\"]")
    private static WebElement loginFormSubmit;

    public static void loginButton(){
        loginButton.click();
    }

    public static void loginMail(String testCredentials){
        loginMail.sendKeys(testCredentials);
    }

    public static void loginPassword(String testCredentials){
        loginPassword.sendKeys(testCredentials);
    }

    public static void loginFormSubmit(){
        loginFormSubmit.click();
    }
}
