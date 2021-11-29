package Facebook;


    import io.cucumber.java.en.And;
    import io.cucumber.java.en.Given;
    import io.cucumber.java.en.Then;
    import io.cucumber.java.en.When;
    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.firefox.FirefoxDriver;
    import  io.cucumber.java.PendingException;

public class LoginStepDefinition {

    WebDriver driver;

    @Given("^user is already on Login Page$")
    public void user_is_already_on_login_page() throws PendingException{

            System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://demo.guru99.com/v4");
        }

    @When("^user enters username and password$")
    public void user_enters_username_and_password() {
        {
            driver.findElement(By.name("uid")).sendKeys("username12");
            driver.findElement(By.name("password")).sendKeys("password12");
        }

       @When("^user click on login button$")
        public void user_click_on_login_button() {

            driver.findElement(By.name("btnReset")).click();
        }
        @Then("^user is on home page$")
        public void user_is_on_home_page() {
            System.out.println("exit");
        }

        }}


