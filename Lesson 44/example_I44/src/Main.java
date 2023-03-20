import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Пример наполнения TreeSet");
        TreeSet ts = new TreeSet<>();
        ts.add("A");
        ts.add("C");
        ts.add("J");
        ts.add("B");
        ts.add("F");
        ts.add("T");
        ts.add("G");
        ts.add("Ekaterina");
        ts.add("10");
        ts.add("a");

        System.out.println(ts);
    }
}