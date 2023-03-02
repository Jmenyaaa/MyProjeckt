

import java.util.HashMap;
public class Main {
    public static void main(String[] args) {

        System.out.println("Телефоная книга групи");

        HashMap<String, String> group = new HashMap<>();

        group.put( "Vadim", "0312593145");
        group.put( "Leonid B", "0176912455");
        group.put( "Lilian", "0176952534");
        group.put( "Viacheslav", "076546389");
        group.put( "Dina", "0875643892");
        group.put( "Katerina Z", "0856296749");
        group.put( "Katerina K", "0657483254");
        group.put( "Валентин", "0786573421");
        group.put( "Oleg", "076452842");
        group.put( "Жека", "078563145");
        group.put( "Yehor", "315491253");
        group.put( "Maryna", "5193198612");
        group.put( "Leonid K", "0856432618");

        for (String i : group.keySet()) {
            System.out.println("Имя: " + i + ", номер телефона: " + group.get(i));
        }


    }
}