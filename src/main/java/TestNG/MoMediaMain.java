package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class MoMediaMain extends MoMedia {

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void movieDetailTest() throws InterruptedException {
        navigateTo(baseURL + "/movies");
        String movieName = "Spider-man";
        enterText(searchInput, movieName);
        clickElement(firstMovieLocator);
        getText(movieTitleLocator);
        verifyText(movieTitleLocator, movieName);

        getText(release);
        getText(ratingLocator);
        getText(status);
        getText(run);
        getText(revenue);
        getText(budget);

        System.out.println("-----Lead Actor Info-----");
        clickElement(actorModalLocator);
        getText(actorDetailsLocator);
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void contactUsTest() throws InterruptedException {
        navigateTo(baseURL + "/contact");
        enterText(nameLocator, "Tanzin Chowdhury");
        enterText(emailLocator, "Tanzin6782@gmail.com");
        enterText(messageLocator, "Hello World");
        Thread.sleep(3000);
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }

}



