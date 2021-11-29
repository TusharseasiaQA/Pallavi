package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CssLocator
{

    public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("https://www.google.com/");

        driver.findElement(By.cssSelector("input[name=\"q\"]")).sendKeys("java");
        driver.findElement(By.cssSelector("input[class=\"gNO89b\"]")).click();
        driver.findElement(By.cssSelector("div[class=\"hdtb-mitem\"]")).click();

       /* driver.findElement(By.cssSelector("a[class^='gb']")).click();
        driver.findElement(By.cssSelector("span[class=\"laptop-desktop-only\"]")).click();*/





}
}

