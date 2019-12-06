package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Getter;

@Getter
public class PlaylistsPage extends PageObject {

    @FindBy(xpath = "//div[@class='thumbnail-wrapper']")
    private WebElement createNewPlaylistButton;

    PlaylistsPage(final WebDriver driver) {
        super(driver);
    }
}
