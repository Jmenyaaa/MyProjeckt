import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        enum Menu {
            CATALOG,
            ADD,
            RAITING,
            Basket,
            EXIT,

        }
        List<String> todoList = new ArrayList<>();
        while (true){
            for (Menu myMenu : Menu.values()) { // цикл for each - Список по который перебирает параметры цикла, значения
                System.out.print(myMenu + " | "); // оператор с параметром цикла
            }
            System.out.println();
            System.out.println("Выберите, действие: нажмите 1,2,3,4 или 5");
            int choice = readMenueChoice(); // выбор пользователь считаем в методе readMenuChoice
            Menu myMenu = Menu.CATALOG; // начальное значение выбора меню
            switch (choice) {
                case 1: {
                    myMenu = Menu.CATALOG;
                }


            }
        }

        User u1 = new User("Vasya", "34546474");
        User u2 = new User("Petya", "22324252");
        User u3 = new User("Alex", "54647484");

        Product t1 = new Product("Vans forever", "Black", 32.00, 8);
        Product t2 = new Product("Nike Sport", "Blue", 34.56, 9);
        Product t3 = new Product("Calvin Klein", "Brown", 50.00, 7);
        Product t4 = new Product("Adidas Originals", "White", 49.87, 6);
        ArrayList tShirts = new ArrayList<>();
        tShirts.add(t1);
        tShirts.add(t2);
        tShirts.add(t3);
        tShirts.add(t4);

        Product h1 = new Product("Dickies aitkin","White", 60.00, 9);
        Product h2 = new Product("Nike hoodie","Midnight Navy", 64.00, 7);
        Product h3 = new Product("Levi's","Black", 55.00, 10);
        Product h4 = new Product("Carhartt","Green", 95.00, 9);
        ArrayList hoodies = new ArrayList<>();
        hoodies.add(h1);
        hoodies.add(h2);
        hoodies.add(h3);
        hoodies.add(h4);

        Product j1 = new Product("Levi's", "Jeans", 95.00, 7);
        Product j2 = new Product("Bershka", "Jeans", 35.00, 8);
        Product j3 = new Product("Calvin Klein", "Jeans", 90.00, 10);
        Product j4 = new Product("Carhartt", "Jeans", 100.00, 9);
        ArrayList jeans = new ArrayList<>();
        jeans.add(j1);
        jeans.add(j2);
        jeans.add(j3);
        jeans.add(j4);



        Catalog ts = new Catalog("T-Shirts", tShirts);
        Catalog hd = new Catalog("Hoodies", hoodies);
        Catalog jn = new Catalog("Jeans", jeans);
        ArrayList catalog = new ArrayList<>();
        catalog.add(ts);
        catalog.add(hd);
        catalog.add(jn);



        Collections.sort(tShirts, new Raiting());
        for (int i = 0; i < tShirts.size(); i++) {
            System.out.println(tShirts.get(i));
        }
        System.out.println();

        Collections.sort(hoodies, new Raiting());
        for (int i = 0; i < hoodies.size(); i++) {
            System.out.println(hoodies.get(i));
        }
        System.out.println();

        Collections.sort(jeans, new Raiting());
        for (int i = 0; i < jeans.size(); i++) {
            System.out.println(jeans.get(i));
        }





    }

    private static int readMenueChoice() {
        Scanner sc = new Scanner(System.in);
        int menuChoice = 0;
        try {
            menuChoice = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("нужно вводить числа, а не символы.");

        }
        return menuChoice;
    }


}
    }
}