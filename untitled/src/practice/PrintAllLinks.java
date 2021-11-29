package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintAllLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.pseb.ac.in/en");
        driver.manage().window().maximize();
        List<WebElement> alltags = driver.findElements(By.tagName("a"));
        System.out.println(alltags.size());

        for (WebElement a : alltags)
        {
            System.out.println(a.getAttribute("href"));
            //System.out.println(a.getAttribute("class"));
            System.out.println(a.getText());
        }
    }
   }
