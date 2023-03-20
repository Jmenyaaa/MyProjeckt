import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Федеративные земли Германии");
        System.out.println();
        TreeSet ts = new TreeSet<>();
        ts.add("Land Sachsen-Anhalt");
        ts.add("Land Schleswig-Holstein");
        ts.add("Freistaat Thüringen");
        ts.add("Bundesrepublik Deutschland");
        ts.add("Land Baden-Württemberg");
        ts.add("Land Berlin");
        ts.add("Land Brandenburg");
        ts.add("Freie Hansestadt Bremen");
        ts.add("Freie und Hansestadt Hamburg");
        ts.add("Land Hessen");
        ts.add("Land Mecklenburg-Vorpommern");
        ts.add("Land Niedersachsen");
        ts.add("Land Nordrhein-Westfalen");
        ts.add("Land Rheinland-Pfalz");
        ts.add("Saarland");
        ts.add("Freistaat Sachsen");

        for (int i = 0; i < ts.toArray().length; i++) {
            System.out.println(ts.toArray()[i]);
        }





    }
}