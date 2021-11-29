import java.util.ArrayDeque;

public class Dequeee {
    public static void main(String[]args)
    {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);
        System.out.println(dq);
        dq.remove(30);
        System.out.println(dq);
        //dq.clear();
        //System.out.println(dq);

        dq.addFirst(100);
        dq.addFirst(200);

        dq.addLast(800);
        dq.addLast(900);
        System.out.println(dq);
    }
}
