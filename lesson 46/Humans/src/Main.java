import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static <T extends Comparable<T>> void sort(T[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


        public static void main(String[] args) {
            System.out.println("Сравнение объектов класса Human");

            Human peter = new Human("Петр", 200, 78, 27);
            Human daniil = new Human("Даниил", 178, 83, 22);
            Human viktor = new Human("Виктор", 182, 90, 24);
            Human andrei = new Human("Андрей", 165, 45, 18);
            Human yakov = new Human("Яков", 185, 65, 23);
            Human alex = new Human("Алексей", 185, 65, 23);

            String[] names = {"Петр", "Даниил", "Виктор", "Андрей", "Яков", "Алексей"}; // массив строк с именами

            Human[] humans = {peter, daniil, viktor, andrei, yakov, alex}; // массив объектов типа Human
            ArrayList list = new ArrayList<>();
            list.add(peter);
            list.add(daniil);
            list.add(viktor);
            list.add(andrei);
            list.add(yakov);
            list.add(alex);


            Collections.sort(list, new HumanByWeightComparator());
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            System.out.println();
            Collections.sort(list, new HumanByAgeComparator());

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));

            }
            System.out.println();
            Collections.sort(list, new HumanByNameComparator());
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));

            }
            System.out.println();
            Collections.sort(list, new HumanByHeightComparator());
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }


        }
    }

    