package TestCases;

import MavenProject.webElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Ajio5
{
    public static void main(String[] args) throws InterruptedException {
//        "1. Navigate to url   ""https://www.ajio.com/shop/sale""                                           " +
//            "  2.enter valid username and password                                             " +
//            " 3.click login button                          " +
//            " 4.type the name of item in search bar and click search button                                                      " +
//            "  5.select the specifications of the item                                                 " +
//            " 6.click add to cart
//        7. if the product is added to the Cart, Click on view Cart
//        8.Verify the listed items vs my bag count
//        "

        System.setProperty("webdriver.chrome.driver", "driverslist//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ajio.com/shop/sale");
        //       class="login-form login-modal"
        webElement loginIcon;
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='login-form login-modal']")).click();

//name="username"
        driver.findElement(By.name("username")).sendKeys("***********ch@gmail.com");
        // loginIcon.click();
        driver.findElement(By.xpath("//input[@class='login-btn']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("pwdInput")).sendKeys("************3c");
        // class="login-form-inputs login-btn"
        driver.findElement(By.xpath("//input[@class='login-form-inputs login-btn']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // type the name of item in search bar and click search button
        driver.findElement(By.name("searchVal")).sendKeys("Jackets");
        driver.findElement(By.xpath("//span[@class='ic-search']")).click();
        Thread.sleep(4000);
//select the specifications of the item
        driver.findElement(By.xpath("//div[@class='name']")).click();
//     // selecting size
//        driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[5]/div[4]/div")).click();
//// add to cart
//        driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[8]/div[1]/div[1]/div/span[2]")).click();
////if the product is added to the Cart, Click on view Cart
        driver.navigate().to("https://www.ajio.com/shop/sale");



        driver.quit();
    }


}
