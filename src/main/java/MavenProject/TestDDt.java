package MavenProject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDDt {

    @Test(dataProvider="testdata")
    public void testChrome(String username, String password){

        System.setProperty("webdriver.chrome.driver", "driverslist//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ajio.com/shop/sale");
//       class="login-form login-modal"
        webElement loginIcon;
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='login-form login-modal']")).click();

//name="username"
        driver.findElement(By.name("username")).sendKeys("c**********h@gmail.com");
        // loginIcon.click();
        driver.findElement(By.xpath("//input[@class='login-btn']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("pwdInput")).sendKeys("9*******3c");
        // class="login-form-inputs login-btn"
        driver.findElement(By.xpath("//input[@class='login-form-inputs login-btn']")).click();
    }
    @DataProvider(name="testdata")
    public object[][] TestDataFeed(){
        object[][] a=new  object[1][0];
        a[0][0]="***********@gmail.com":
        a[0][1]="************d":
        return a;
    }
}
