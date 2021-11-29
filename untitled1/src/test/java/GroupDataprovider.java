import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupDataprovider
{


   /*@Test(groups= {"software company"})
    public void infosys()
    {
        System.out.println("Infosys");
    }
    @Test
    public void technip()
    {
        System.out.println("Technip India Ltd");
    }
    @Test(groups= {"software company"})
    public void wipro()
    {
        System.out.println("Wipro");
    }*/

   @Test(groups = {"FRUITS"})
    public void fruit1()

    {
        System.out.println("apple");
    }

    @Test(groups = {"FRUITS"})
    public void fruit2(){
        System.out.println("MANGO");
    }
    @Test
    public void fruit3(){
       System.out.println("banana");
    }
    @BeforeGroups("FRUITS")
    public void before(){
        System.out.println("THIS WILL PRINT BEFORE GROUP");
    }

    @AfterGroups("FRUITS")
    public void after(){
        System.out.println("THIS WILL PRINT AFTER GROUP");
    }
    /*@BeforeGroups("IT Department")
    public void before_it()
    {
        System.out.println("This method will be executed before the execution of IT Department group");
    }
    @Test
    public void testcase1()
    {
        System.out.println("HR");
    }
    @Test(groups= {"IT Department"})
    public void testcase2()
    {
        System.out.println("Software Developer");
    }
    @Test(groups= {"IT Department"})
    public void testcase3()
    {
        System.out.println("QA Analyst");
    }*/
}
