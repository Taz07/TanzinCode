package ActionFunctionTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.browserstack.com/");

        Actions a = new Actions(driver);

        WebElement trialaction = driver.findElement(By.xpath("//a[@id='free-trial-link-anchor']"));

        a.doubleClick(trialaction).perform();

    }
}
