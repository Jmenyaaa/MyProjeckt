import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        House h1 = new House(100,150000, "New York" );
        House h2 = new House(85,120000, "London" );
        House h3 = new House(120,180000, "Berlin" );
        House h4 = new House(150,200000, "Moscow" );

        TreeSet ts = new TreeSet<>();
        ts.add(h1);
        ts.add(h2);
        ts.add(h3);
        ts.add(h4);

        System.out.println(ts);
    }
}