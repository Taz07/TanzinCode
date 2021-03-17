package SeleniumPractice;

import org.testng.annotations.Test;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//The Fluent Wait in Selenium is used to define maximum time for the web driver to wait for a condition,
// as well as the frequency with which we want to check the condition before throwing an "ElementNotVisibleException"
// exception. It checks for the web element at regular intervals until the object is found or timeout happens.

public class AppTest3 {
    protected WebDriver driver;
    @Test
    public void guru99tutorials() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        String eTitle = "Demo Guru99 Page";
        String aTitle = "" ;
        driver = new ChromeDriver();
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

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){

            public WebElement apply(WebDriver driver ) {
                return driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/" +
                        "div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"));
            }
        });
        //click on the selenium link
        clickseleniumlink.click();
        //close~ browser
        driver.quit();
    }
}
