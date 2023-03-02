import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        System.out.println("Перевод двочного числа в десятеричное");
        Scanner sc = new Scanner(System.in);

        String binary_number = sc.nextLine();

        int l =binary_number.length(); // узнали длину строки

        System.out.println("Количество цифр в двоичном числе: " + l);

        String[] simbols = new String[l]; // заводим  массив под цифры двоичного числа
        ArrayList<String> simbolsArrayList = new ArrayList<>(); // аналогичный масив но его проще печатать

        // заполняем масив
        for (int i = 0 ; i < l; i++) {
            simbols[i] = String.valueOf(binary_number.charAt(i)); // читаем по одному символу
            simbolsArrayList.add(i,simbols[i]); // заносим в масив
        }
        int decimal_number  = 0;

        for (int i = 0; i < l; i++) { // цикл идет по символам в массиве
            // int l = simbols.lenght; // нужен длина массива для вычысления показателя степени

            Character simbol = simbols[i].charAt(0); // взяли текущий символ
            int s = Character.getNumericValue(simbol); // преобразовали его в число типа int
            decimal_number = decimal_number + (int) (s * Math.pow(2, (l - 1 - i)));// вычислили десятичное число
        }

        System.out.println("Десятичное число = " + decimal_number);
*/

        System.out.println("Перевод из 10-й системы счисленния в 2-ю");
        Scanner sc = new Scanner(System.in);

        int num = 0; // переменная для десятичного числа
        boolean wrong_input = false; // переменная для ошибочного ввода
        int division = 1; // результат от целочисленного деления
        int rest = 0; // остаток от целочисленного деления

        ArrayList<String> binary_num = new ArrayList<>(); // массив для накопления цифр двоичного числа

        try {
            num = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Нельзя вводить символы!");
            wrong_input = true;
        }

        System.out.println(num); // вывод введенного числа

        int i = 0; // счетчик количества цифр

        // цикл перевода числа в двоичную систему
        while (num > 0) {
            rest = num % 2; // остаток от деления на 2 - это первая цифра
            // System.out.println(rest);
            binary_num.add(i, String.valueOf(rest)); // записали цифру в масив
            num = num / 2; // получили частное от деления числа на 2
            // System.out.println(num);
            i++; // увеличили счетчик символов цифр на 1
        }
        // вывод полученного двоичного числа
        System.out.println("Двоичное число : ");
        for (int j = binary_num.size() - 1; j >= 0; j--) { // цикл идет от конца массива к его началу
            System.out.print(binary_num.get(j));
        }






    }
}