package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class WebElement1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {

            driver.get("https://example.com");



           WebElement element = driver.findElement(By.tagName("div"));


            List<WebElement> elements = element.findElements(By.tagName("p"));
            for (WebElement e : elements) {
                System.out.println(e.getText());
            }
        }
         finally {
System.out.println("jkl");


        }
    }}

