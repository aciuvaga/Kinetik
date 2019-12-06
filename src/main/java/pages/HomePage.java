package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Getter;

@Getter
public class HomePage extends PageObject {

    @FindBy(xpath = "//button[@class='topbar-profile']")
    private WebElement profileButton;

    @FindBy(xpath = "//span[contains(text(),'Account Settings')]")
    private WebElement accountLink;

    @FindBy(xpath = "//span[contains(text(),'Playlists')]")
    private WebElement playlistLink;

    @FindBy(xpath = "//span[contains(text(),'Artists')]")
    private WebElement artistsLink;

    @FindBy(xpath = "//span[contains(text(),'Albums')]")
    private WebElement albumsLink;

    HomePage(final WebDriver driver) {
        super(driver);
    }
}
