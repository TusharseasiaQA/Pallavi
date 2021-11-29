package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class JavaAlert {
    public static void main(String[] args) throws InterruptedException{

        //System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "D:/Java Practice/geckodriver.exe");
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

       // driver.findElement(By.xpath("//body[@id=\"page-top\"]")).click();

        //driver.switchTo().alert().accept();

        //driver.findElement(By.name("alert")).click();
        //driver.switchTo().alert().accept();

        //driver.findElement(By.name("confirmation")).click();
        //driver.switchTo().alert().dismiss();
        driver.findElement(By.name("prompt")).click();
        Thread.sleep(4000);
        driver.switchTo().alert().sendKeys("hi");
        driver.switchTo().alert().accept();




    }
}