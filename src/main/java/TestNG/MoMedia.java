package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class MoMedia {

    public WebDriver driver;

    String baseURL = "https://momedia.netlify.app";

    By searchInput = By.id("search-input");
    By firstMovieLocator = By.xpath("//ul[@class=\"search-suggest list-group list-group-flush\"]/li[1]//a");

    By movieTitleLocator = By.xpath("//header/section//h1");
    By actorModalLocator = By.xpath("(//button[@class=\"ButtonLink open-model-link\"])[1]");
    By actorDetailsLocator = By.xpath("//div[@class=\"model-actor-info-container\"]");

    String movieStatus = "//*[@id=\"root\"]/main/div/header/section/div[1]/div/div";
    By release = By.xpath(movieStatus +"[1]");
    By ratingLocator = By.xpath(movieStatus +"[2]");
    By status = By.xpath(movieStatus +"[3]");
    By run = By.xpath(movieStatus +"[4]");
    By revenue = By.xpath(movieStatus +"[5]");
    By budget = By.xpath(movieStatus +"[6]");

    By nameLocator = By.name("name");
    By emailLocator = By.name("email");
    By messageLocator = By.name("message");
    By sendButtonLocator = By.name("//form//button");

    public void navigateTo(String URL){
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void clickElement(By element){
        WebElement localElement = waitForElement(element);
        localElement.click();
    }

    public WebElement waitForElement(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void enterText(By element, String text){
        WebElement localElement = waitForElement(element);
        localElement.sendKeys(text);
    }

    public void getText(By element){
        WebElement localElement = waitForElement(element);
        System.out.println(localElement.getText());
    }

    public void verifyText(By locator, String expectedText) {
        WebElement localElement = waitForElement(locator);
        String actualText = localElement.getText();
        Assert.assertEquals(expectedText.toLowerCase(), actualText.toLowerCase());
    }

}
