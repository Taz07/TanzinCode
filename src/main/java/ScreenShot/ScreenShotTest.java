package ScreenShot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;


public class ScreenShotTest {

    static WebDriver driver;

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        driver = new ChromeDriver();

        driver.get("http://www.facebook.com");
        takeScreenshot("facebook_loginPage");

    }

        public static void takeScreenshot(String fileName) throws IOException {

           File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

           FileUtils.copyFile(file, new File("/Users/tanzin/IdeaProjects/Automation/src/main/java/ScreenShot/" + fileName + ".jpg"));

           driver.quit();
        }
}