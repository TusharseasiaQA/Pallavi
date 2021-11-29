package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Action {
    public static void main(String[]args)
    {
        System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

        Actions at = new Actions(driver);

        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();

        WebElement a=driver.findElement(By.xpath("//a[@id=\"menu_leave_viewLeaveModule\"]"));
        WebElement b=driver.findElement(By.xpath("//a[@id=\"menu_leave_Entitlements\"]"));
        WebElement c=driver.findElement(By.xpath("//a[@id=\"menu_leave_addLeaveEntitlement\"]"));
        at.moveToElement(a).moveToElement(b).click(c).build().perform();
    }

}
