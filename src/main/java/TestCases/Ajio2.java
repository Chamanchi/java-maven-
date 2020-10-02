package TestCases;

import MavenProject.webElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio2 {
    public static void main(String[] args) {
//        1.Navigate to url   "https://www.ajio.com/shop/sale"
//    2.enter valid username and password
//    3.click login button
//    4.type the name of item in search bar and click search button


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
//type the name of item in search bar and click search button
        driver.findElement(By.xpath("//*[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("adidas casual shoes");
    driver.findElement(By.xpath("//span[@class='ic-search']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
driver.close();
    }
}
