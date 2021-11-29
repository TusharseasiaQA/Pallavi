package Sorting;



import java.util.ArrayList;
        import java.util.Collections;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.Select;


    public class SortDropDown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:/Java Practice/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("products"));

        Select se = new Select(element);

        ArrayList originalList = new ArrayList();
        ArrayList tempList = new ArrayList();

        for (WebElement e : se.getOptions()) {
            originalList.add(e.getText());
            tempList.add(e.getText());
        }

        System.out.println("this is originalList before Sorting" + originalList);
        System.out.println("this is tempList before Sorting" + tempList);

        Collections.sort(tempList);

        System.out.println("this is originalList after Sorting" + originalList);
        System.out.println("this is tempList after Sorting" + tempList);

        if (originalList == tempList) {
            System.out.println("Dropdown sorted");
        } else {
            System.out.println("Dropdown Not sorted");

        }
        driver.close();
    }

}




