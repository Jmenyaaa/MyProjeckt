import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // int [] ages = new int [5]; задать масив
/*
        String[] menu = {"Teaa", "Espresso", "Americano", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0 || num > 4){ // только число от 0 до 4
            System.out.println("Invalid");
        } else {

            System.out.println(menu[num]);
        }
        // Перебор элементов в массивах
        // int[] ages = {18, 11, 11, 22 ,44 };
       // System.out.println(ages.lenght);
/*
        int [] ages = {18, 12 , 44 , 55, 66};
        for (int x = 0; x< ages.length; x++) {
            System.out.println(ages[x]); // вывод всех элементов масива
        }
        int sum = 0;
        for (int x = 0 ; x< ages.length; x++) {
            sum += ages[x]; // сума всех элементов масива
        }
        System.out.println(sum);

        // Перебор масива for each
        int[] nums = {3, 8 ,5 , 2 };
        for (int x: nums) { // :- для каждого х в nums
            System.out.println(x);
        }

/*
        // Сумма for each
        int sum1 = 0;
        for (int x: nums) {
            if (x > sum1) {
                sum1 = x;
            }
        }
        System.out.println(sum1);



*/



        // Сумма компании за месяц
        double [] revenue = {88750, 125430, 99700, 14500, 158000, 6500, 99000,189000,210000,42000, 165800,258900};
        double sum = 0;
        for (double x: revenue) {
            sum += x;
        }
        System.out.println(sum/12);
// Кинотеатр
        int[][] seats = {
                {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
                {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ряд");
        int reels = sc.nextInt();
        System.out.println("Введите место");
        int video = sc.nextInt();

        if (seats[reels][video] == 0) {
            System.out.println("Free");
        } else {
            System.out.println("Sold");
        }


    }
}