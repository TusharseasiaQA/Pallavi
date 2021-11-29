import org.testng.annotations.Test;

public class PriorityEnabled {

    @Test(priority = -5000)
    public void mango()
    {
        System.out.println("I am Mango");
    }
    @Test(priority=0)
    public void apple()
    {
        System.out.println("I am Apple");
    }
    @Test(priority=50)
    public void watermelon()
    {
        System.out.println("I am Watermelon");
    }

//Enabled Attribute

    @Test
    public void c_language()
    {
        System.out.println("C language");
    }
    @Test(enabled=false)
    public void jira()
    {
        System.out.println("JIRA is a testing tool");
    }
    @Test(enabled = false)
    public void java()
    {
        System.out.println("JAVA language");
    }
}