package Inheritance;

public class Basic {
    float salarY;
}
 class employee extends Basic{
    int Bonus;
    public static void main(String[]args){
        employee e= new employee();
        System.out.println("Employee salary is"  + 100);
        System.out.println("Employee bonus is"  + 50);
    }
}
