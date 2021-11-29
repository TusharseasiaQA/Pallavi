package FILES;

public class First {
    public static  void main(String[] args) throws Exception {


        System.setProperty("webdriver.chrome.driver","D:/Java Practice/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

// Load the website
        driver.get("http://www.naukri.com/");
    }
}
