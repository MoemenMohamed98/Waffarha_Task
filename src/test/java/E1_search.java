
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.shaft.driver.SHAFT;
import org.testng.annotations.Test;


public class E1_search {

    private SHAFT.GUI.WebDriver driver;
    private By searchBar = By.id("searchbox_input");
    private By searchButton = By.cssSelector(".searchbox_searchButton__F5Bwq");
    private By forthResult = By.xpath("(//span[contains(@class,'EKtkFWMYpwzMKOYr0GYm')])[3]");

    @BeforeClass
    public void setUp() {
        driver = new SHAFT.GUI.WebDriver();
    }


    @Test
    public void valid_Search_With_TestNG(){
        driver.browser().navigateToURL("https://duckduckgo.com/");
        driver.element().type(searchBar,"TestNG");
        driver.element().click(searchButton);

        // Assert that the Test
        driver.element()
                .assertThat(forthResult).text()
                .isEqualTo("TestNG Tutorial - Javatpoint")
                .perform();

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }






}