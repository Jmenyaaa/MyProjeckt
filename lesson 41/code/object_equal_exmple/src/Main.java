import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сравнение обьектов");
        Human h1 = new Human(40, true);
        Human h2 = new Human(40, true);
        Programmer p1 = new Programmer(29, true, 11);
        Programmer p2 = new Programmer(29, true, 12);
        Human h3 = null;
        Scanner sc = new Scanner(System.in);

        System.out.println(h1.equals(p1));
        System.out.println(p1.equals(h1));
        System.out.println(p1.equals(p2));



    }
}