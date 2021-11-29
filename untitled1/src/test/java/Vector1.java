
import java.util.*;
public class Vector1{
    public static void main(String[] args){
        Vector<String> v=new Vector<String>();

       //ADDING ELEMENTS
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");
        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

         // REMOVING ELEMENT
            v.remove(1);
            System.out.println("after removal: " + v);


            //CHANGING ELEMENT USING SET METHOD

            System.out.println("The Object that is replaced is: "+ v.set(0,"RAM"));

            // Displaying the modified vector
            System.out.println("The new Vector is:" + v);
        }
    }
}