package ActionFunctionTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

    public class DragDrop2 {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://demoqa.com/droppable");
            driver.manage().window().maximize();

            WebElement sourceElement= driver.findElement(By.id("draggable"));
            WebElement targetElement= driver.findElement(By.id("droppable"));

            Actions action = new Actions(driver);
            Thread.sleep(3000);
            action.dragAndDrop(sourceElement, targetElement).build().perform();
            //action.clickAndHold(SourceElement).moveToElement(TargetElement).release().build().perform();
            Thread.sleep(3000);
            driver.quit();

        }
}
