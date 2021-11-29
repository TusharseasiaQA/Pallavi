package DailyTasks;

    import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
    import org.openqa.selenium.support.ui.ExpectedConditions;
    import org.openqa.selenium.support.ui.WebDriverWait;

    import java.util.List;
import java.util.concurrent.TimeUnit;

    public class EmailVerify {

        public static void main(String[] args) throws InterruptedException {

            //create a Selenium WebDriver instance
            System.setProperty("webdriver.gecko.driver", "D:/Java Practice/geckodriver.exe");

            WebDriver driver = new FirefoxDriver();

            //launch the Firefox browser and navigate to the website
            driver.get("https://www.google.com/gmail/");

            //puts an implicit wait for 10 seconds before throwing exceptions
           // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //locate the email field
            WebElement username = driver
                    .findElement(By.name("identifier"));
            username.sendKeys("palvimonga884@gmail.com");
            WebElement next = driver
                    .findElement(By.className("VfPpkd-LgbsSe"));
            next.click();
            //identify password
            new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.name("password"))).sendKeys("12qwerty34");

            //locate and click the submit butt//
            WebElement cont=driver.findElement(By.className("VfPpkd-vQzf8d"));
            cont.click();
            new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//table/tbody/tr[contains(@id,\":\")])[1]"))).click();

//
//            //locate Demo Inbox and click it
//            driver.findElement(By.xpath("//a[@title='Demo inbox']")).click();
//
//            //look for the given text in the list of web elements
//            List<WebElement> allMessages = driver.findElements(By.xpath("//*[contains(text(), 'Here comes an attachment')]"));
//
//            //check if text has been found or not
//            if(allMessages.isEmpty()) {
//                System.out.println("Test not passed");
//            }else {
//                System.out.println("Test passed");
//            }
//
//            //close the Firefox browser.
//            driver.close();


        }

    }


