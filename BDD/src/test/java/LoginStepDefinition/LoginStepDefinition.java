package LoginStepDefinition;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;







class LoginStepDefination {
    WebDriver driver;
    @Given("^user is already on Login Page$") /*to make cucumber understand we write special
												character at starting of line we put ^(apostrophe)
												and at the end of line we put $(dollar)*/
    public void user_is_already_on_Login_Page() {
        System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe" );
        driver=new ChromeDriver();
        driver.get("https://ui.cogmento.com/");
    }

    @When("^title of login page is Free CRM$")
    public void title_of_login_page_is_Free_CRM() {
        String title=driver.getTitle(); // Storing in a string variable
        System.out.println(title);
        Assert.assertEquals("Cogmento CRM", title);
    }

    @Then("^user enters username and password$")
    public void user_enters_username_and_password() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='email' and @placeholder='E-mail address']")).sendKeys("sharma1998lavkush@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
    }

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() {
        WebElement loginBtn =
                driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;  /*we use JavascriptExecutor so that login button work
	 														because some time locators does not work
	 														 so that we use JavascriptExecutor*/
        js.executeScript("arguments[0].click();", loginBtn);
    }

    @Then("^user is on home page$")
    public void user_is_on_home_page() {
        String title = driver.getTitle();
        System.out.println("Home Page title ::"+ title);
        Assert.assertEquals("Cogmento CRM", title);
    }

}




