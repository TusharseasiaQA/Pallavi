import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

    //ASSERT EQUAL

//    @Test
//   public void testAssertFunctions()
//    {
//        System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//       driver.navigate().to("https://www.browserstack.com/");
//        String ActualTitle= driver.getTitle();
//        String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
//        Assert.assertEquals(ExpectedTitle, ActualTitle);
//    }


    //ASSERT NOT EQUAL

//    @Test
//    public void testAssertFunctions1() {
//        System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("https://www.browserstack.com/");
//        String ActualTitle = driver.getTitle();
//        String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
//        Assert.assertNotEquals(ActualTitle, ExpectedTitle);
//    }

   // ASSERT TRUE

//    @Test
//    public void testAssertFunctions2() {
//        System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("https://www.browserstack.com/");
//
//        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase(" Most Reliable App & Cross Browser Testing Platform | BrowserStack");
//        Assert.assertTrue(verifyTitle);
//        System.out.println(verifyTitle);
//    }

    //ASSERT FALSE
//    @

   // ASSERT NULL

//    @Test
//    public void testAssertFunctions3() {
////        System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
////        WebDriver driver = new ChromeDriver();
////        driver.navigate().to("https://www.browserstack.com/");
//        String verifyAssertNull ="J";
//        Assert.assertNull(verifyAssertNull);
//    }


//     ASSERT NOT NULL

//    @Test
//    public void testAssertFunctions() {
//        System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("https://www.browserstack.com/");
//        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform");
//        Assert.assertNotNull(verifyTitle);
//    }

    //COMPLETE ASSERTION

    @Test
    public void testAssertFunctions() {
        System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.browserstack.com/");
        String ActualTitle = driver.getTitle();
        String verifyAssertNull=null;
        String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
        Boolean verifyTitleIsPresent=driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
        Boolean verifyTitleIsChanged=driver.getTitle().equalsIgnoreCase("Testing Platform | BrowserStack");
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        Assert.assertNotEquals(ExpectedTitle, "BrowserStack");
        Assert.assertTrue(verifyTitleIsPresent);
        Assert.assertFalse(verifyTitleIsChanged);
     Assert.assertNotNull(verifyTitleIsPresent);
    Assert.assertNull(verifyAssertNull);
}
}
