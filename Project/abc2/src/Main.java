import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>0 && num<=11 ) {
            System.out.println("Child");
        } else if (num>=12 && num<=17) {
            System.out.println("Teen");
        } else if (num>=18 && num<=64) {
            System.out.println("Abult");
        }



    }
}