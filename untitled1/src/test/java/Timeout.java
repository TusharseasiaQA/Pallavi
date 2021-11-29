import org.testng.annotations.Test;

public class Timeout {
    @Test(timeOut=500)
    public void testcase1() throws InterruptedException
    {
        Thread.sleep(200);
        System.out.println("This is testcase1");
    }
    @Test
    public void testcaes2()
    {
        System.out.println("This is testcase2");
    }
    @Test
    public void testcase3()
    {
        System.out.println("This is testcase3");
    }
}
