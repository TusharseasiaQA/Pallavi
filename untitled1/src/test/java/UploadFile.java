


        import org.openqa.selenium.*;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://demo.guru99.com/test/upload/");



        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\Users\\Dell\\Desktop\\login.txt");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
    }
}