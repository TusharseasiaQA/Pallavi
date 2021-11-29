
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
public class Parameter
{
    /*@Test
    @Parameters({"a","b"})
    public void add(int c, int d)
    {
        int sum=c+d;
        System.out.println("Sum of two numbers : "+sum);
    }*/
    @Test
    @Parameters("mango")
    public void mango(String m)
    {
        System.out.println("Fruits names are:  ");
        System.out.println(m);
    }
    @Test
    @Parameters("orange")
    public void orange(String o)
    {
        System.out.println(o);
    }
}


