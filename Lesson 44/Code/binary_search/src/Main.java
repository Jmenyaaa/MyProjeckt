import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // На входе массив из 10 целых чисел от 0 до 100, числа заданы произвольно,
// массив отсортирован от меньшего к большему элементу
// пользователь вводит интересующее его число - есть оно в массиве или нет?
// на выходе ответ - есть или нет искомый элемент. Если есть, то выводится индекс найденного элемента массива
// ключевой алгоритм - поделить массив пополам и понять, в какой половинке искомый элемент
// продолжать,пока не будет найден искомый элемент массива или не закончится массив
        int[] array ={2,5,7,10,12,14,16,18,19,22,25,27,29,32,35,37,39,42,45,50};
        int lenght = array.length;
        System.out.println("Длина массива " + lenght);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите интересуещее число в массиве");
        int element = sc.nextInt();
        System.out.println("ищем элемент в массиве " + element + " в массиве");

        //задаем условие
        boolean hasElement = false;

        int left =0;// левый конец
        int right = lenght -1; // правый конец массива
        int middle = left + (right - left)/2; // индекс середины массива


        while (left <= right) {
            if (element < array[middle]) { // если искомый элемент в левой половине
                right = middle -1;

            }else if (element > array[middle])  { // если искомый элемент в правой половине
                left = middle +1;
            } else  {
                hasElement = true;
                break;
            }
            middle = left + (right - left)/2; // вычесляем новую середину

        }
        if (hasElement == true) {
            System.out.println("число " + element + " есть в масиве");
            System.out.println("Его индекс "+ (element-1));
        } else {
            System.out.println("Такого числа нету в масиве :(");
        }






    }
}