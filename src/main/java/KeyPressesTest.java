import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyPressesTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com//");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[31]/a")).click();

        driver.findElement(By.id("target")).sendKeys("MzTech weekend class");

        Thread.sleep(2000);

        driver.quit();


    }
}
