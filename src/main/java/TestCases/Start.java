package TestCases;

import MavenProject.webElement;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 class Start
{
    public static void main(String[] args) throws InterruptedException {
//        @Test(Priority= 1)
//        1.Navigate to url   "https://www.ajio.com/shop/sale"
//    2.enter valid username and password
//        3.click login button

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
            driver.close();
    }

}
