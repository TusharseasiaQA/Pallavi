package demo;

public class NestedIfElse {
    public static void main(String[]args)
    {
        double x=-1.0 ,y=4.5,z=-5.3,largest;
        if (x >= y) {
            if (x >= z) {
                largest = x;
            } else {
                largest = z;
            }
        }
        else{
            if (y >= z) {
                largest=y;
            }
            else{
                largest=z;
            }
            }
        System.out.println("largest number is:" +largest);
        }
}
