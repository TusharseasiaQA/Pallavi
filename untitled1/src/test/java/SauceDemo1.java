import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SauceDemo1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(" https://www.saucedemo.com/");
        List<WebElement> text = driver.findElements(By.xpath("//div[@id='login_credentials']/child::node()"));
        for(WebElement ac : text)
       {System.out.print(ac.getText());}

        }
    }
