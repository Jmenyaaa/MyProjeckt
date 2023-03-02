import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Программа выводит сумму чисел до числа N
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int num = 0;
        while (sum > 0) {
            num += sum;
            sum--;


        }
        System.out.println(num);
    }
}