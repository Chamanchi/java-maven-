import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class MethodScreen {



    public class Screen {

        public static <WebDriver> void main(String[] args) throws Exception {
            System.setProperty("webdriver.chrome.driver", "driverslist//chromedriver.exe");
            WebDriver driver;
            driver = (WebDriver) new ChromeDriver();
            driver.get("https://www.ajio.com/shop/sale");
            TakesScreenshot ts = (TakesScreenshot)driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
            System.out.println("the Screenshot is taken");
            driver.quit();
        }

    }
}
