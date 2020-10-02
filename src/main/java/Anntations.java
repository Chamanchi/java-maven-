import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Anntations {
    public String baseUrl= "https://www.ajio.com/shop/sale";
    String driverPath="driverslist//chromedriver.exe";
    public WebDriver driver;
    @BeforeTest
    public void launchBrowser(){
        System.out.println("launching chrome browser");
        System.setProperty("webdriver.chrome.driver", "driverslist//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }
    @Test
    public void verifyLoginPageUrl(){
        String expectedTitle="";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }
    @AfterTest
    public void terminateBrowser(){
        driver.close();
    }
}
