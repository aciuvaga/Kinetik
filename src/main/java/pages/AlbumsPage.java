package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class AlbumsPage extends PageObject {

    public AlbumsPage(final WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@id=\"page_profile\"]")
    private static WebElement buttonViewMenu;

    @FindBy(xpath = "//button[@id=\"context_menu_1261189\"]")
    private static WebElement deleteFromFavourites;

    public static void buttonViewMenu() {
        buttonViewMenu.click();
    }

    public static void deleteFromFavourites() {
        deleteFromFavourites.click();
    }
}
