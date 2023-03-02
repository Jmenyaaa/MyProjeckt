import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {



        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            myNumbers.add((int) ((Math.random()* (10)+ 1)));


        }
        System.out.println(myNumbers);
        System.out.println(myNumbers.size());
        System.out.println();
        Collections.sort(myNumbers);
        System.out.println(myNumbers);

        // cтандартный цикл for для вивода печать AraryList
        for (int i : myNumbers) {
            System.out.print(i + " ");
        }

    }
}