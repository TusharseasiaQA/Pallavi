
    import java.util.Collections;
    import java.util.Iterator;
    import java.util.LinkedList;
import java.util.ListIterator;

    public class ListLinked {

        public static void main(String[] args) {
            //Create linked list
            LinkedList<String> linkedList = new LinkedList<>();

            //Add elements
            /*linkedList.add("A");
            linkedList.add("B");
            linkedList.add("C");
            linkedList.add("D");

            System.out.println(linkedList);

            //Add elements at specified position
            linkedList.add(4, "A");
            linkedList.add(5, "A");

                    System.out.println(linkedList);

            //Remove element
                  linkedList.remove("A");     //removes A
                linkedList.remove(0);       //removes B

              System.out.println(linkedList);*/

           linkedList.add("A");
            linkedList.add("C");
            linkedList.add("B");
            linkedList.add("D");

//Unsorted
            System.out.println(linkedList);

//1. Sort the list
            Collections.sort(linkedList);

//Sorted
            System.out.println(linkedList);

//2. Custom sorting
            Collections.sort(linkedList, Collections.reverseOrder());

//Custom sorted
            System.out.println(linkedList);



            //Iterate
            Iterator<String> itrator = linkedList.iterator();

            while (itrator.hasNext()) {
                System.out.println(itrator.next());
            }
        }
    }

