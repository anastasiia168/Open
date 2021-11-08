import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.GoogleHomePage;

    public class OpenGoogleTest {
        private WebDriver driver;

        @BeforeMethod(alwaysRun = true)
        public void browserSetup() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
    }

         @Test (description = "Test of google searching")
        public void openSearchResultIsNotEmpty() {
            int expectedSearchResultsNumber = new GoogleHomePage(driver)
                    .openPage()
                    .searchForTerm ("open.ru")
                    .countSearchResult();

            Assert.assertTrue(expectedSearchResultsNumber > 0, "Search result is empty");
        }

        @AfterMethod (alwaysRun = true)
        public void browserTearDown (){
            driver.quit();
            driver = null;
        }
    }



