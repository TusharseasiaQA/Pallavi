package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
public class BrokenLinks {
    public static void main(String[] args) {

        try {
            System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://www.pseb.ac.in/en");
            driver.manage().window().maximize();

            List<WebElement> alltags = driver.findElements(By.tagName("a"));
            alltags.addAll(driver.findElements(By.tagName("img")));
            System.out.println("Size of full links and images is:" + alltags.size());
            List<WebElement> activelinks = new ArrayList<WebElement>();


            for (int i = 0; i < alltags.size(); i++) {
                System.out.println(alltags.get(i).getAttribute("href"));

                if (alltags.get(i).getAttribute("href") != null && (!alltags.get(i).getAttribute("href").contains("javascript"))) {
                    activelinks.add(alltags.get(i));
                }


                System.out.println("size of active links and images" + activelinks.size());


                for (int j = 0; j < activelinks.size(); j++) {
                    HttpURLConnection connection;
                    connection = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
                    connection.connect();


                    String response = connection.getResponseMessage();
                    connection.disconnect();
                    System.out.println(activelinks.get(j).getAttribute("href") + "...." + response);
                }
            }
        } catch (MalformedURLException e) {
           System.out.println("ABHHHH");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }}