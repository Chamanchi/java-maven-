package MavenProject;

import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class CrossBrowserScript {
    WebDriver driver;

    @BeforeTest
    @Parameterized.Parameters("browser")
    public void setUp(String browser) throws Exception{
        if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.chrome.driver", "driverslist//gekco.//");
            driver=new FirefoxDriver();
        }
          else if ("chrome".equalsIgnoreCase(browser){
            System.setProperty("webdriver.chrome.driver", "driverslist//chromedriver.exe");
            driver=new ChromeDriver();
        }
         else if (browser.equalsIgnoreCase("Edge"){
            System.setProperty("webdriver.chrome.driver", "driverslist//edge./");
            driver=new EdgeDriver();
        }
        else{
            throw new Exception("Browser is not correct");
        }
    }

    @Test
    public void testParameter() throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "driverslist//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ajio.com/shop/sale");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // type the name of item in search bar and click search button
        driver.findElement(By.name("searchVal")).sendKeys("Jackets");
        driver.findElement(By.xpath("//span[@class='ic-search']")).click();
        Thread.sleep(4000);
//select the specifications of the item
        driver.findElement(By.xpath("//div[@class='name']")).click();
     // selecting size
        driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[5]/div[4]/div")).click();
// add to cart
        driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[8]/div[1]/div[1]/div/span[2]")).click();
//if the product is added to the Cart, Click on view Cart
        driver.navigate().to("https://www.ajio.com/shop/sale");


    }
    @AfterTest
    public void terminatingBrowser(){
        driver.quit();
    }

}
