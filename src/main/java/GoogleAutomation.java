import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutomation {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

       // driver.navigate().to("https://www.google.com"); //waits for the page to load
        driver.get("https://google.com"); //Doesn't wait for the page to load

        driver.findElement(By.name("q")).sendKeys("selenium");

        Thread.sleep(5000);

        driver.quit();

    }
}
