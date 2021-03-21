package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IphoneAmazon {

    WebDriver driver;

    @BeforeClass
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void iphoneSearchTest() throws InterruptedException {
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple iPhone 11 (64GB, Yellow) [Locked] + Carrier Subscription");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div[1]/div[1]/span[1]" +
                "/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]")).click();
        Thread.sleep(3000);
    }

    @Test (priority = 2)
    public void verifyText(){
        driver.get("");

    }

    @AfterClass
    public void afterClass()
    {
        driver.quit();
    }

}


