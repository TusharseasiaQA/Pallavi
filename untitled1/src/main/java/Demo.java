import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[]args){
        WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver", "D:/Java Practice/geckodriver.exe");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("https://www.google.com/");
    }
}
