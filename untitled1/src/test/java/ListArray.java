import java.util.*;

public class ListArray {


        public static void main(String[] args){
            ArrayList<String> list=new ArrayList<String>();
            list.add("Ravi");

            list.add("Vijay");
            list.add("Ravi");
            list.add("Ajay");

            list.remove("Ajay");

            Iterator itr=list.iterator();
            while(itr.hasNext()){
               System.out.println(itr.next());
                //System.out.println(list.size());
            }
        }
    }

