import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
    @Test
    public void softAssert() {
        System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        SoftAssert softAssert = new SoftAssert();
        driver.navigate().to("https://www.browserstack.com/");
        String getActualTitle = driver.getTitle();
        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
        softAssert.assertAll();
        softAssert.assertEquals(getActualTitle, " Reliable App & Cross Browser Testing Platform | BrowserStack");
        System.out.println("ALWAYS1 EXECUTE");
        //        softAssert.assertNotEquals(getActualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
//        softAssert.assertNull(verifyTitle);
//        softAssert.assertNotNull(verifyTitle);
//        softAssert.assertTrue("BrowserStack".equals("Browserstack"), "First soft assert failed");
//        softAssert.assertFalse("BrowserStack".equals("BrowserStack"), "Second soft assert failed");
     //  softAssert.assertAll();
        System.out.println("ALWAYS EXECUTE");
    }
}