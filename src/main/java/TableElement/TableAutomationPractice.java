package TableElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;

public class TableAutomationPractice {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseURL = "http://demo.guru99.com/test/web-table-element.php";

        driver.get(baseURL);

        List cols = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/thread/tr/th"));

        System.out.println("no of cols are:" + cols.size());

        WebElement firstCol = driver.findElement(By.xpath("//table[@class=\"dataTable\"thread/tr/th[1]"));

        for (int i = 1; i <= cols.size(); i++) {
            WebElement col = driver.findElement(By.xpath("//table[@class=\"dataTable\"thread/tr/th[" + i + "]"));
            System.out.print(" | " + col.getText() + " | ");

        }

        //WebElement firstRowSecondColValue = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr/td[2]"));

        List rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));


        for (int i = 1; i <= rows.size(); i++) {
            WebElement firstRowValue = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + i + "]/td[1]"));

        }

        List columnSize = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[1]/td"));

        for (int i = 1; i <= columnSize.size(); i++) {
            WebElement columnsOfFirstRow = driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[1]/td[" + i + "]"));

        }

        System.out.println("");

        for (int i = 1; i <= rows.size(); i++) {
            System.out.println(" | ");
            for (int j = 1; i <= columnSize.size(); j++) {
                WebElement columnOfRows = driver.findElement(By.xpath("//table[@class='dataTable']/*/tr[" + i + "]/td[" + j + "]"));
                System.out.println(" " + columnOfRows.getText() + " ");

            }

            System.out.println(" | ");
            System.out.println(" ");

        }

        driver.quit();

    }

}