package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

@Getter
public class HomePage extends PageObject {

   public HomePage (final WebDriver driver){
       super(driver);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[3]/button")
    private static WebElement profileButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")
    private static WebElement accountSettingsLink;

    @FindBy(xpath = "//a[@id=\"page_sidebar\"]")
    private static WebElement albumstLink;

    @FindBy(xpath = "//input[@id=\"topbar-search\"]")
    private static WebElement inputSearch;

    @FindBy(xpath = "//button[@id=\"page_topbar\"]")
    private static WebElement submitSearch;

    @FindBy(xpath = "//span[@class='account-name']")
    private static WebElement checkUpdatedUsername;


    public static void profileButtonClick(){
        profileButton.click();
    }

    public static void accountSettingsLink(){
        accountSettingsLink.click();
    }

    public static void albumstLink(){
        albumstLink.click();
    }

    public static void inputSearch(String albumName){
        inputSearch.sendKeys(albumName);
    }

    public static void submitSearch(){
        submitSearch.click();
    }

    public static void checkUpdatedUsername(){
        assertTrue(checkUpdatedUsername.getText() == "andrew");
    }
}
