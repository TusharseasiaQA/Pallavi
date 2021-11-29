import static org.testng.Assert.assertEquals;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copy {

    public WebDriver driver;
    public String url="https://www.lambdatest.com/";

    @BeforeSuite
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
        driver=new ChromeDriver();
        System.out.println("The setup process is completed");
    }

    @BeforeTest
    public void profileSetup()
    {
        driver.manage().window().maximize();
        System.out.println("The profile setup process is completed");

    }

    @BeforeClass
    public void appSetup()
    {
        driver.get(url);
        System.out.println("The app setup process is completed");
    }


    @Test(priority=2)
    public void checkLogin()
    {
        driver.get("https://accounts.lambdatest.com/login");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sadhvisingh24@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("xxxxx");
        driver.findElement(By.xpath("//*[@id='app']/section/form/div/div/button")).click();
        System.out.println("The login process on lamdatest is completed");
    }

    @Test(priority=0 ,description= "this test validates the sign-up test")
    public void signUp() throws InterruptedException
    {
        WebElement link= driver.findElement(By.xpath("//a[text()='Register Now']"));
        link.click();
        WebElement organization=driver.findElement(By.xpath("//input[@name='organization_name']"));
        organization.sendKeys("LambdaTest");
        WebElement firstName=driver.findElement(By.xpath("//input[@name='name']"));
        firstName.sendKeys("Test");
        WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("User622@gmail.com");
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("TestUser123");
        WebElement phoneNumber=driver.findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys("9412262090");
        WebElement termsOfService=driver.findElement(By.xpath("//input[@name='terms_of_service']"));
        termsOfService.click();
        WebElement button=driver.findElement(By.xpath("//button[text()='Signup']"));
        button.click();




    }

    @Test(priority=3, alwaysRun= true, description="this test validates the URL post logging in" , groups="url_validation")
    public void testCurrentUrl() throws InterruptedException
    {
        driver.findElement(By.xpath("//*[@id='app']/header/aside/ul/li[4]/a")).click();
        String currentUrl= driver.getCurrentUrl();
        assertEquals(currentUrl, "https://automation.lambdatest.com/timeline/?viewType=build&page=1", "url did not matched");
        System.out.println("The url validation test is completed");
    }

    @Test(priority=1, description = "this test validates the logout functionality" ,timeOut= 25000)
    public void logout() throws InterruptedException
    {
        Thread.sleep(6500);
        driver.findElement(By.xpath("//*[@id='userName']")).click();
        driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul[2]/li/div/a[5]")).click();
    }

    @Test(enabled=false)
    public void skipMethod()
    {
        System.out.println("this method will be skipped from the test run using the attribute enabled=false");
    }

    @Test(priority=6,invocationCount =5,invocationTimeOut = 20)
    public void invocationcountShowCaseMethod()
    {
        System.out.println("this method will be executed by 5 times");
    }



    @AfterMethod()
    public void screenshot() throws IOException
    {
        TakesScreenshot scr= ((TakesScreenshot)driver);
        File file1= scr.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(file1, new File("C:\\Users\\navyug\\workspace\\QAPractise\\test-output\\test1.PNG"));
        System.out.println("Screenshot of the test is taken");
    }

    @AfterClass
    public void closeUp()
    {
        driver.close();
        System.out.println("The close_up process is completed");
    }

    @AfterTest
    public void reportReady()
    {
        System.out.println("Report is ready to be shared, with screenshots of tests");
    }

    @AfterSuite
    public void cleanUp()
    {

        System.out.println("All close up activities completed");
    }

    @BeforeGroups("urlValidation")
    public void setUpSecurity() {
        System.out.println("url validation test starting");
    }

    @AfterGroups("urlValidation")
    public void tearDownSecurity() {
        System.out.println("url validation test finished");
    }



}