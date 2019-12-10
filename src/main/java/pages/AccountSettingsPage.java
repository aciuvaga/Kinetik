package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

@Getter
public class AccountSettingsPage extends PageObject {

    public AccountSettingsPage(final WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/input[1]")
    private static WebElement inputNewUsername;

    @FindBy(xpath = "//button[@id=\"page_account\"]")
    private static WebElement privacySettingsButton;

    @FindBy(xpath = "/html/body/div[1]/div/main/div[5]/div[1]/div[2]/div/div/div[2]/div[4]/div/div[4]/button")
    private static WebElement saveButton;

    @FindBy(xpath = "//input[@id=\"dzr-app\"]")
    private static WebElement measurementCheckbox;

    @FindBy(xpath = "//input[@id=\"dzr-app\"]")
    private static WebElement adSDRCheckbox;

    @FindBy(xpath = "//button@id=\"dzr-app\"]")
    private static WebElement agreeButton;

    @FindBy(xpath = "//select[@id=\"language\"]")
    private static WebElement languageDropdown;

    @FindBy(xpath = "//*[@id=\"language\"]/option[20]")
    private static WebElement selectOptionRo;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]")
    private static WebElement confirmationMessage;

    public static void inputNewUsername(String newUsername){
       inputNewUsername.clear();
        inputNewUsername.sendKeys(newUsername);
    }

    public static void privacySettingsButton(){
        privacySettingsButton.click();
    }

    public static void saveButton(){
        saveButton.click();
    }

    public static void measurementCheckbox(){
        measurementCheckbox.click();
    }

    public static void adSDRCheckbox(){
        adSDRCheckbox.click();
    }

    public static void agreeButton(){
        agreeButton.click();
    }

    public static void languageDropdown(){
        languageDropdown.click();
    }

    public static void selectOptionRo(){
        selectOptionRo.click();
    }

    public static void confirmationMessageDisplayed(){
        assertTrue(confirmationMessage.isDisplayed());
    }



}
