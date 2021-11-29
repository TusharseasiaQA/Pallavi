package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class OpeningBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver", "D:/Java Practice/geckodriver.exe");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.navigate().to("https://www.google.com/");
       /* System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("q");
        driver.findElement(By.name("btnK")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();*/

        // Absolute x path

      // driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("hello");
       // driver.findElement(By.xpath("//input[@class=\"gNO89b\"]")).click();

       //relative x path
        // driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("hello");
       // driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();

        //Or & and
        //driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\" or name=\"q\"]")).sendKeys("hello");
        //driver.findElement(By.xpath("//input[@class=\"gNO89b\" or type=\"submit\"]")).click();

        //contains with attribute

        //driver.findElement(By.xpath("(//input[contains(@name,\"q\")])[1]")).sendKeys("hello");
        //driver.findElement(By.xpath("(//input[contains(@name,\"btnK\")])[2]")).click();

        //start-with

        //driver.findElement(By.xpath("//input[starts-with(@name,\"q\")]")).sendKeys("red");
        //driver.findElement(By.xpath("//input[starts-with(@type,\"submit\"]")).click();


        //contains with text method
        driver.findElement(By.xpath("//a[contains(text(), 'Gmail')]")).click();

    }
}
