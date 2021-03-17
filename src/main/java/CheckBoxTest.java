import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com//");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();

        Thread.sleep(2000);

        driver.quit();


    }
}
