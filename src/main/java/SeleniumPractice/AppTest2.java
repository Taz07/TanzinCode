package SeleniumPractice;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//The Explicit Wait in Selenium is used to tell the Web Driver to wait for certain conditions (Expected Conditions)
// or maximum time exceeded before throwing "ElementNotVisibleException" exception. It is an intelligent kind of wait,
// but it can be applied only for specified elements. It gives better options than implicit wait as it waits for
// dynamically loaded Ajax elements.

public class AppTest2 {
    protected WebDriver driver;
    @Test
    public void guru99tutorials() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        driver = new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, 20);
        String eTitle = "Demo Guru99 Page";
        String aTitle = "" ;
        // launch Chrome and redirect it to the Base URL
        driver.get("http://demo.guru99.com/test/guru99home/" );
        //Maximizes the browser window
        driver.manage().window().maximize() ;
        //get the actual value of the title
        aTitle = driver.getTitle();
        //compare the actual title with the expected title
        if (aTitle.contentEquals(eTitle))
        {
            System.out.println( "Test Passed") ;
        }
        else {
            System.out.println( "Test Failed" );
        }
        WebElement guru99seleniumlink;
        guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
        guru99seleniumlink.click();
    }

}
