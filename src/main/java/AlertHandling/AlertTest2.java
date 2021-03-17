package AlertHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).sendKeys("ok");

        Thread.sleep(2000);

        driver.quit();
    }
}