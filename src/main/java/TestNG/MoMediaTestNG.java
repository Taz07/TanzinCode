package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class MoMediaTestNG {

    WebDriver driver;

    @BeforeClass
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test (priority = 1)
    public void movieSearchTest() throws InterruptedException {
        driver.get("https://momedia.netlify.app/movies");
        driver.findElement(By.id("search-input")).sendKeys("the little things");
        driver.findElement(By.xpath("//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[12]/div[1]/a[1]/div[1]/div[1]")).click();
        System.out.println("Deputy Sheriff Joe \"Deke\" Deacon joins forces with Sgt. Jim Baxter to search for a serial");
        System.out.println("killer who's terrorizing Los Angeles. As they track the culprit, Baxter is unaware that the investigation");
        System.out.println("is dredging up echoes of Deke's past, uncovering disturbing secrets that could threaten more than his case.");
        Thread.sleep(3000);

    }

    @Test (priority = 2)
    public void contactUsTest() throws InterruptedException {
        driver.get("https://momedia.netlify.app/contact");
        driver.findElement(By.id("validationCustom01")).sendKeys("Tanzin Chowdhury");
        driver.findElement(By.id("validationCustom02")).sendKeys("Tanzin@gmail.com");
        driver.findElement(By.id("validationCustom03")).sendKeys("Hope this automation test passes");
        Thread.sleep(3000);

    }

    @AfterClass
    public void afterClass()
    {
        driver.quit();
    }

}
