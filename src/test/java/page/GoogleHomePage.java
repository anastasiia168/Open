package page;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage extends AbstractPage {

    private static final String HOMEPAGE_URL = "http://google.com";


    @FindBy (name ="q")
    private  WebElement searchInput;

   public GoogleHomePage(WebDriver driver){super (driver);
   }

    public GoogleHomePage openPage (){
       driver.get(HOMEPAGE_URL);
       new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
               .until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        return this;
    }

    public GoogleSearchResultsPage searchForTerm (String term) {
        searchInput.sendKeys(term);
        searchInput.sendKeys(Keys.ENTER);
        return new GoogleSearchResultsPage(driver, term);
    }

}
