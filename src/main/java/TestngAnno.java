import MavenProject.webElement;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestngAnno {

    @Test
    public void testCase1(){

        System.setProperty("webdriver.chrome.driver", "driverslist//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ajio.com/shop/sale");
        webElement loginIcon;
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='login-form login-modal']")).click();
        driver.findElement(By.name("username")).sendKeys("***********ch@gmail.com");
        driver.findElement(By.xpath("//input[@class='login-btn']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("pwdInput")).sendKeys("************3c");
        driver.findElement(By.xpath("//input[@class='login-form-inputs login-btn']")).click();
        driver.close();


    }
    @Test
    public void testCase2(){
        System.setProperty("webdriver.chrome.driver", "driverslist//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ajio.com/shop/sale");
        webElement loginIcon;
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='login-form login-modal']")).click();
        driver.findElement(By.name("username")).sendKeys("***********ch@gmail.com");
        driver.findElement(By.xpath("//input[@class='login-btn']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("pwdInput")).sendKeys("************3c");
        driver.findElement(By.xpath("//input[@class='login-form-inputs login-btn']")).click();
        driver.findElement(By.xpath("//*[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("adidas casual shoes");
        driver.findElement(By.xpath("//span[@class='ic-search']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        driver.close();

    }
    @Test
    public void testCase3(){
        System.setProperty("webdriver.chrome.driver", "driverslist//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ajio.com/shop/sale");
        webElement loginIcon;
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='login-form login-modal']")).click();
        driver.findElement(By.name("username")).sendKeys("***********ch@gmail.com");
        driver.findElement(By.xpath("//input[@class='login-btn']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("pwdInput")).sendKeys("************3c");
        driver.findElement(By.xpath("//input[@class='login-form-inputs login-btn']")).click();
        driver.findElement(By.xpath("//*[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("Mid-Rise Flat-Front Walk Shorts");
        driver.findElement(By.xpath("//span[@class='ic-search']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@class='popUp']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@class='btn-product-details']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"modalId\"]/div/div/div[2]/div[3]/div/div[6]/div[1]/div/div/div/span[2]")).click();
        driver.quit();

    }
    @Test
    public void testCase4(){
        System.setProperty("webdriver.chrome.driver", "driverslist//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ajio.com/shop/sale");
        webElement loginIcon;
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='login-form login-modal']")).click();
        driver.findElement(By.name("username")).sendKeys("***********ch@gmail.com");
        driver.findElement(By.xpath("//input[@class='login-btn']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("pwdInput")).sendKeys("************3c");
        driver.findElement(By.xpath("//input[@class='login-form-inputs login-btn']")).click();
        driver.findElement(By.name("searchVal")).sendKeys("Jordan Westbook One Take PF Lace-Up Shoes");
        driver.findElement(By.xpath("//span[@class='ic-search']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@class='name']")).click();
        driver.findElement(By.xpath("(//div[@class='circle size-variant-item size-instock '])[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[8]/div[1]/div[1]/div/span[2]")).click();
        driver.close();


    }
    @Test
    public void testCase5(){
        System.setProperty("webdriver.chrome.driver", "driverslist//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ajio.com/shop/sale");
        webElement loginIcon;
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='login-form login-modal']")).click();
        driver.findElement(By.name("username")).sendKeys("***********ch@gmail.com");
        driver.findElement(By.xpath("//input[@class='login-btn']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("pwdInput")).sendKeys("************3c");
        driver.findElement(By.xpath("//input[@class='login-form-inputs login-btn']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("searchVal")).sendKeys("Jackets");
        driver.findElement(By.xpath("//span[@class='ic-search']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@class='name']")).click();
        driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[5]/div[4]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[8]/div[1]/div[1]/div/span[2]")).click();
        driver.navigate().to("https://www.ajio.com/shop/sale");



        driver.quit();

    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("in BeforeMethod");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("in AfterMethod");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("in BeforeClass");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("in AfterClass");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("in BeforeTest");
    }
    @AfterTest
    public void afterClass(){
        System.out.println("in AfterClass");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("in BeforeSuite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("in AfterSuite");
    }


}