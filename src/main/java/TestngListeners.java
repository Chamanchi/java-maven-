import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Listeners(ListenerTest.Class)
 class TestngListeners {
    public WebDriver driver;
    @Test
    public void Login() throws Exception{
        System.setProperty("webdriver.chrome.driver", "driverslist//chromedriver.exe");
        driver = new ChromeDriver();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        System.setProperty("webdriver.chrome.driver", "driverslist//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ajio.com/shop/sale");
        driver.manage().window().maximize();
//        type the name of item in search bar and click search button
        driver.findElement(By.xpath("//*[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("Mid-Rise Flat-Front Walk Shorts");
        driver.findElement(By.xpath("//span[@class='ic-search']")).click();
        Thread.sleep(4000);
        //  select the specifications of the item
        driver.findElement(By.xpath("//div[@class='popUp']")).click();
        Thread.sleep(4000);
        //.select the specifications of the item
        driver.findElement(By.xpath("//*[@class='btn-product-details']")).click();
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(700);

    }
    @Test
    public void TestToFail(){
        System.out.println("This method to test fail");
        Assert.assertTrue(false);
    }

}
