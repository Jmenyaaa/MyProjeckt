import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Автомат с шоколадками");
        // меню
        // BAUNTY - 1 EURO
        // SNICKERS - 1,4 EURo
        // TWIX - 1,6 EURO
        // MILKY WAY - 1,5 EURO
        // LION - 1,2 EURO

        enum ChocoType {
            BAUNTY,
            SNICKERS,
            TWIX,
            MILKY_WAY,
            LION,
        }
        for (ChocoType myChoco: ChocoType.values()) {
            System.out.println(myChoco);
        }
        System.out.println("Выберете свой любимый. Нажмите 1,2,3,4 или 5");
        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();
        ChocoType myChoco = ChocoType.BAUNTY;
        double ChocoPrise = 0;

        switch (choise) {
            case 1: {
                myChoco = ChocoType.BAUNTY;
                break;
            }
            case 2: {
                myChoco = ChocoType.SNICKERS;
                break;
            }
            case 3: {
                myChoco = ChocoType.TWIX;
                break;
            }
            case 4: {
                myChoco = ChocoType.MILKY_WAY;
                break;
            }
            case 5: {
                myChoco = ChocoType.LION;
                break;
            }
        }
        // Назначаем цену

        switch (myChoco) {
            case BAUNTY -> {
                ChocoPrise = 1.5;
                System.out.println("Baunty: Цена " + ChocoPrise + " Euro");
                break;
            }
            case SNICKERS -> {
                ChocoPrise = 1.4;
                System.out.println("Snickers: Цена " + ChocoPrise + " Euro");
            }
            case TWIX -> {
                ChocoPrise = 1.6;
                System.out.println("Twix: Цена " + ChocoPrise + " Euro");
            }
            case MILKY_WAY -> {
                ChocoPrise = 1.3;
                System.out.println("Milky way: Цена " + ChocoPrise + " Euro");
            }
            case LION -> {
                ChocoPrise = 1;
                System.out.println("Lion: Цена " + ChocoPrise + " Euro");
            }

        }
        System.out.println("С вас " + ChocoPrise);





    }
}