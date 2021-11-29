
import java.util.*;
public class Queueee {

    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add("D");
        q.add("B");
        q.add("C");
        q.add("A");
        //q.add("E");
        //q.add("F");
        System.out.println(q);
        System.out.println(q.element());//if queue is empty : NOSuchElementExceptiom
        System.out.println(q.peek());//if queue is empty : null

        q.remove();
        System.out.println(q);

        // System.out.println("After remove head element: "+q);
        //System.out.println("It removes head element which is: "+q.remove());

        //System.out.println("After remove head element by using poll() method: "+q);
        //System.out.println("It removes head element which is: "+q.poll());

        Iterator itr = q.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}