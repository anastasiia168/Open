package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;


    public class GoogleSearchResultsPage extends AbstractPage {

        private String searchTerm;

        @FindBy (css = "div.logo.doodle")
         private WebElement GoogleLogo;

        @FindBy (xpath = "//*[@class='g']/div[contains(.,'open.ru')]")
        private List<WebElement> SearchResult;

        public GoogleSearchResultsPage(WebDriver driver, String searchTerm) {
            super(driver);
            this.searchTerm=searchTerm;
        }

        public int countSearchResult () {
             System.out.println("Search results number for request term: " + SearchResult.size());
             return SearchResult.size();
         }

      @Override
      protected AbstractPage openPage() {
          throw new RuntimeException( "don't use");
             }

}
