package AlertHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

        public class AlertTest3 {

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");

            WebDriver driver = new ChromeDriver();

            // Launch Website
            driver.navigate().to("https://demoqa.com/alerts");

            //Handling alert boxes
            //Click on generate alert button
            driver.findElement(By.id("confirmButton")).click();

            //Using Alert class to first switch to or focus to the alert box
            Alert alert = (Alert) driver.switchTo().alert();

            Thread.sleep(3000);

            //Using accept() method to accept the alert box
            alert.accept();


            Alert confirmBox = (Alert) driver.switchTo().alert();

            //Using dismiss() command to dismiss the confirm box
            //Similarly accept can be used to accept the confirm box
            ((Alert) confirmBox).dismiss();


            driver.quit();



        }
    }
