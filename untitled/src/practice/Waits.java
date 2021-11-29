package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Waits {

    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver", "D:/Java Practice/geckodriver.exe");

        //IMPLICIT WAITS

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("hello");
         driver.findElement(By.xpath("//input[@class=\"gNO89b\"]")).click();
        //Thread.sleep(1000);

        //EXPLICIT WAITS

    }
}
