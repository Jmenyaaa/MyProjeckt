import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Fruits f1 = new Fruits("Apple", "Red", 52);
        Fruits f2 = new Fruits("Orange", "Orange", 47);

        TreeSet fruitsList = new TreeSet<>();
        fruitsList.add(f1);
        fruitsList.add(f2);

        System.out.println(fruitsList);

    }
}