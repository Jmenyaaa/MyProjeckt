import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро аожаловать в нашу кофейню!");
        //какое кофе будет пробовать
        // ESPRESSO - 2.30 euro | 3euro
        // AMERICANO - 2.10 euro | 2 euro
        // CAPUCCINO - 3.50 euro | 4 euro
        // LATTE - 4.20           | 5 euro


        enum CoffeeType {
            ESPRESSO,
            AMERICANO,
            CAPUCCINO,
            LATTE,
        }
        for (CoffeeType myCoffee: CoffeeType.values()) {
            System.out.println(myCoffee);
        }
        System.out.println("Выбирете свой кофе. Нажмите 1, 2, 3 или 4");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        CoffeeType myCoffee = CoffeeType.ESPRESSO;
        int CoffePrice = 0;

        switch (choice) {
            case 1: {
                myCoffee = CoffeeType.ESPRESSO;
                break;
            }
           case 2: {
                myCoffee = CoffeeType.AMERICANO;
                break;
            }
            case  3: {
                myCoffee = CoffeeType.CAPUCCINO;
                break;
            }
            case 4: {
                myCoffee = CoffeeType.LATTE;
                break;
            }
        }

        // назчаем цену
        switch (myCoffee) {
            case AMERICANO -> {
                CoffePrice = 2;
                System.out.println("Стоимость " + 2 + " euro");
                break;
            }
            case ESPRESSO -> {
                CoffePrice = 3;
                System.out.println("Стоимость " + 3 + "euro");

                break;
            }
            case CAPUCCINO -> {
                CoffePrice = 4;
                System.out.println("Стоимость " + 4 + "euro");
                break;
            }
            case LATTE -> {
                CoffePrice = 5;
                System.out.println("Стоимость " + 5 + "euro");
                break;
            }
        }
        System.out.println("С вас "+ CoffePrice);



    }
}