import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>(
                Arrays.asList(60, 65, 54, 14, 24)
        );
        System.out.println("Элементы: " + myNumbers);
        int sum = 0;

        for (int i = 0 ; i < myNumbers.size(); i++ ) {
            sum = sum + myNumbers.get(i);

        }
        System.out.println("суммa всех элементов = " + sum);

    }
}