package DailyTasks;

import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenShot1 {
    WebDriver driver;
    @Test
    public void Titletest() {
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Assert.assertEquals(driver.getTitle(), "Rediffmailmail");
    }
    @Test
    public void remembermetest(){
        boolean actualstatus=driver.findElement(By.id("remember")).isSelected();
        Assert.assertEquals(actualstatus,true);

    }
    @BeforeTest
    public void beforetest(){
        System.setProperty("webdriver.gecko.driver", "D:/Java Practice/geckodriver.exe");
        driver = new FirefoxDriver();
//       System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
//         driver = new ChromeDriver();
    }
    @AfterTest
    public void aftertest(){
        driver.quit();
    }
    @AfterMethod
    public void aftermethod(ITestResult result) throws IOException {
        if(result.getStatus()==ITestResult.FAILURE){
            TakesScreenshot tc=(TakesScreenshot) driver;
            File src=tc.getScreenshotAs(OutputType.FILE);
            FileHandler.copy(src,new File(result.getName()+".png"));
        }
    }
}
