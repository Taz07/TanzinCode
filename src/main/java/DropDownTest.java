import javafx.scene.control.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/dropdown");

        Thread.sleep(2000);

        Select dropdown = new Select (driver.findElement(By.id("dropdown")));

        dropdown.selectByVisibleText("Option 2");

        Thread.sleep(2000);

        driver.quit();
    }

}