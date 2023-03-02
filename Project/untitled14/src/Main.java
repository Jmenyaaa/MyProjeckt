import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] Intrandom = new int [10];
        for (int i = 0; i < Intrandom.length; i++ ) {
            Intrandom[i] = (int)(( Math.random()* (10-1+1)+1));
            System.out.println("Задуманный масив :"+ Intrandom[i]);

        }
        System.out.println("Введите целое число от 1 до 10 ");
        int num = sc.nextInt();


        int c = findNumber (Intrandom, num);
        System.out.println("Число " + num + " встретилось в массиве "+ c + " раз.");





    }
    public static int findNumber(int array[], int find_num){
        int count = 0; // опредилили счетчик
        for (int i = 0; i < array.length; i++) {
            if (array[1] == find_num) { // если в масиве найден искомый элемент
               count ++;
            }
        }
        return  count;
    }
}