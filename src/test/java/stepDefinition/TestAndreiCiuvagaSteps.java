package stepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import managers.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pages.AccountSettingsPage;
import pages.AlbumsPage;
import pages.HomePage;
import pages.LoginPage;

import java.util.List;

public class TestAndreiCiuvagaSteps {
    LoginPage loginPage;
    WebDriver driver;
    AlbumsPage albumsPage;
    ConfigFileReader fileReader;
    HomePage homePage;
    WebDriverManager webDriverManager;
    AccountSettingsPage accountSettingsPage;

    @Given("^I navigate to the login page$")
    public void i_navigate_to_the_login_page() throws Throwable {
        webDriverManager = new WebDriverManager();
        fileReader = new ConfigFileReader();
        driver = webDriverManager.getDriver();
        driver.navigate().to(fileReader.getApplicationUrl());
        loginPage = new LoginPage(driver);
        loginPage.loginButton();
    }

    @When("^I submit username and password$")
    public void i_submit_username_and_password(DataTable dt) throws Throwable {
        List<String> user = dt.asList(String.class);
        loginPage.loginMail(user.get(0));
        loginPage.loginPassword(user.get(1));
        loginPage.loginFormSubmit();
    }

    @Given("User is on Deezer Home Page")
    public void userIsOnDeezerHomePage() {
        accountSettingsPage = new AccountSettingsPage(driver);
        albumsPage = new AlbumsPage(driver);
        homePage = new HomePage(driver);
    }

    @When("User clicks on Topbar-profile button")
    public void userClicksOnTopbarProfileButton() {
        homePage.profileButtonClick();
    }

    @And("User clicks on Account settings")
    public void userClicksOnAccountSettings() {
        homePage.accountSettingsLink();
    }

    @And("User Edits Username field with updateUsername")
    public void userEditsUsernameFieldWithUpdateUsername() {
        accountSettingsPage.inputNewUsername("andrew");
    }

    @And("Clicks on Save button")
    public void clicksOnSaveButton() {
        accountSettingsPage.saveButton();
    }

    @Then("Confirmation message Your data has been updated id displayed")
    public void confirmationMessageYourDataHasBeenUpdatedIdDisplayed() {
        accountSettingsPage.confirmationMessageDisplayed();
    }

    @When("User refreshes the page")
    public void userRefreshesThePage() {
        driver.navigate().refresh();
    }

    @And("User Clicks on user account")
    public void userClicksOnUserAccount() {
        homePage.profileButtonClick();
    }

    @Then("User account is updated with new username")
    public void userAccountIsUpdatedWithNewUsername() {
        homePage.checkUpdatedUsername();
        webDriverManager.closeDriver();
    }

    @And("Romanian language is selected from Language drop-down list")
    public void romanianLanguageIsSelectedFromLanguageDropDownList() {
    }

    @And("User Clicks on Save button")
    public void userClicksOnSaveButton() {
    }

    @Then("Confirmation message Your data has been updated is displayed")
    public void confirmationMessageYourDataHasBeenUpdatedIsDisplayed() {
    }

    @And("Language profile has been change")
    public void languageProfileHasBeenChange() {
        webDriverManager.closeDriver();
    }

    @And("Clicks on Privacy settings")
    public void clicksOnPrivacySettings() {
    }

    @Then("Cookie and tracking technology policy window is displayed")
    public void cookieAndTrackingTechnologyPolicyWindowIsDisplayed() {
    }

    @When("User uncheck Mesurement and Ad selection, delivery, reporting check-boxes")
    public void userUncheckMesurementAndAdSelectionDeliveryReportingCheckBoxes() {
    }

    @And("Presses on I agree button")
    public void pressesOnIAgreeButton() {
    }

    @Then("User is return on Account Settings")
    public void userIsReturnOnAccountSettings() {
    }

    @When("User clicks on Privacy settings")
    public void userClicksOnPrivacySettings() {
    }

    @Then("Privacy settings is displayed")
    public void privacySettingsIsDisplayed() {
    }

    @And("Check-boxes Mesurement and Ad selection, delivery, reporting are unchecked")
    public void checkBoxesMesurementAndAdSelectionDeliveryReportingAreUnchecked() {
        webDriverManager.closeDriver();
    }

    @When("User clicks on Albums sidebar")
    public void userClicksOnAlbumsSidebar() {
    }

    @And("User clicks on the search field")
    public void userClicksOnTheSearchField() {
    }

    @And("User fill in Albums name")
    public void userFillInAlbumsName() {
    }

    @And("User clicks on the search button")
    public void userClicksOnTheSearchButton() {
    }

    @Then("Albums name is displayed in Top Result")
    public void albumsNameIsDisplayedInTopResult() {
    }

    @When("User clicks on Albums name albums")
    public void userClicksOnAlbumsNameAlbums() {
    }

    @And("User clicks on Add button")
    public void userClicksOnAddButton() {
    }

    @Then("Added album is displayed on Albums page")
    public void addedAlbumIsDisplayedOnAlbumsPage() {
        webDriverManager.closeDriver();
    }

    @And("User clicks on Album name icon")
    public void userClicksOnAlbumNameIcon() {
    }

    @And("User clicks on Remove button")
    public void userClicksOnRemoveButton() {
    }

    @Then("Albums name is not displayed on Albums page")
    public void albumsNameIsNotDisplayedOnAlbumsPage() {
        webDriverManager.closeDriver();
    }
}
