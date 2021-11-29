import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.Locale;

public class SauceDemo
{
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");

        //WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "D:/Java Practice/geckodriver.exe");
       WebDriver driver = new FirefoxDriver();
        Thread.sleep(5000);
        driver.get(" https://www.saucedemo.com/");
        String text = driver.findElement(By.id("login_credentials")).getAttribute("innerText");
        System.out.print(text);
        String text1 = driver.findElement(By.className("login_password")).getAttribute("innerText");
        String array[] = text.split("\\r?\\n");
        String array1[] = text1.split("\\r?\\n");

        driver.findElement(By.id("user-name")).sendKeys(array[1]);
        driver.findElement(By.id("password")).sendKeys(array1[1]);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("logout_sidebar_link")).click();
        driver.findElement(By.id("user-name")).sendKeys(array[1].toUpperCase(Locale.ROOT));
        driver.findElement(By.id("password")).sendKeys(array1[1].toUpperCase(Locale.ROOT));
        driver.findElement(By.id("login-button")).click();
        boolean actualmessage=driver.findElement(By.xpath("//*[text()='Epic sadface: Username and password do not match any user in this service']")).isDisplayed();
        Assert.assertTrue(actualmessage);



        //driver.quit();
    }
}