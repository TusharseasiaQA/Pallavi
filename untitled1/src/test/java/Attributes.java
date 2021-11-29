import org.testng.annotations.Test;

public class Attributes {

    /*@Test(description="This is testcase1")
    public void testcase1()
    {
        System.out.println("HR");
    }
    @Test(description="This is testcase2")
    public void testcase2()
    {
        System.out.println("Software Developer");
    }*/

// Depends on method
        @Test
        public void WebStudentLogin()
        {
            System.out.println("Student login through web");
        }
        @Test
        public void MobileStudentLogin()
        {
            System.out.println("Student login through mobile");
        }
        @Test(dependsOnMethods= {"WebStudentLogin"})
        public void APIStudentLogin()
        {
            System.out.println("Student login through API");
        }
// Depends On Method with multiple attriutes

    @Test(dependsOnMethods= {"testcase3","testcase2"})
    public void testcase1()
    {
        System.out.println("This is test case1");
    }
    @Test
    public void testcase2()
    {
        System.out.println("This is test case2");
    }
    @Test
    public void testcase3()
    {
        System.out.println("This is test case3");
    }
}

