package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver", "D:/Java Practice/geckodriver.exe");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions ac = new Actions(driver);

//        driver.switchTo().frame(driver.findElement(By.id("dropContent")));

        WebElement source = driver.findElement(By.id("box4"));
        WebElement destination = driver.findElement(By.id("box107"));
        Thread.sleep(4000);
        ac.dragAndDrop(source, destination).build().perform();
    }
}