import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 int nod = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = min (a, b);
        int max = max (a, b);


         for (int i = 1; i<= min; i++) {
            if (min % i == 0) {
                if (max % 1 == 0) {
                    nod = 1;
                }
            }
        }
        System.out.println(nod);
    }
    public static int min (int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else return num2;
    }



    public static int max (int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else return num2;
    }
}