package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.text.html.Option;
import java.time.Duration;

public class MouseKeyboard {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //driver.navigate().to("https://demo.guru99.com/test/radio.html");

        //RADIO BUTTON

      //WebElement R1 = driver.findElement(By.name("webform"));
       //R1.click();

       Thread.sleep(1000);

       //CHECKBOX

      //WebElement CB1= driver.findElement(By.id("vfb-6-0"));
       //CB1.click();

       //DROP DOWN
        driver.navigate().to("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
       Select title =new Select(driver.findElement(By.id("RESULT_RadioButton-9")));
       title.selectByVisibleText("Morning");
    }
}