import java.sql.SQLOutput;

public class Constructor {
    String name;
    int age;

    public Constructor() {
        System.out.println("default constructor");
    }

    public Constructor(int i) {
        System.out.println("one parameter constructor");
        System.out.println(i);
    }

    public Constructor(int i, int j) {
        System.out.println("TWO PARAMETR CONSTRUCTOR");
        System.out.println(i + " " + j);
    }

    public Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor();
        Constructor obj1 = new Constructor(10);
        Constructor obj2 = new Constructor(10, 20);
        Constructor obj3 = new Constructor("tom", 20);
        System.out.println(obj3.name);
        System.out.println(obj3.age);
    }
}
