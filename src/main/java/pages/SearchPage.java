package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SearchPage extends PageObjects {

    public SearchPage(final WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@id=\"page_naboo_search\"]" )
    private static WebElement addToFavourites;

    public static void addToFavourites(){
        addToFavourites.click();
    }
}

