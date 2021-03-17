package TryCatchBlock;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandling {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        Thread.sleep(2000);

        try {
            driver.findElement(By.name("fake")).click();


        } catch (NoSuchElementException e) {

            System.out.println("element is not found");

        }
        System.out.println("Hello");
    }
}
