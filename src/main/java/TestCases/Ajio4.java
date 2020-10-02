package TestCases;

import MavenProject.webElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio4 {
    public static void main(String[] args) throws InterruptedException {
 //    "1. Navigate to url   ""https://www.ajio.com/shop/sale""            " +
//        2.enter valid username and password
//    3.click login button
//    4.type the name of item in search bar and click search button
//        5.select the specifications of the item
//        6.click add to cart
//        7.Repeat step 4 - 6 for other items
//        8.Again Repeat step 4 - 6 for other items"

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
       // type the name of item in search bar and click search button
        driver.findElement(By.name("searchVal")).sendKeys("Jordan Westbook One Take PF Lace-Up Shoes");
        driver.findElement(By.xpath("//span[@class='ic-search']")).click();
        Thread.sleep(4000);
      //  select the specifications of the item
        driver.findElement(By.xpath("//div[@class='name']")).click();
        //select size of item
        driver.findElement(By.xpath("(//div[@class='circle size-variant-item size-instock '])[3]")).click();
       // click add to cart
        driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[8]/div[1]/div[1]/div/span[2]")).click();
        driver.close();


    }
}
