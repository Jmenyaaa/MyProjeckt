public class Main {
    public static void main(String[] args) {

        int [] Intrandom = new int [10];
        for (int i = 0; i < Intrandom.length; i++ ) {
            Intrandom[i] = (int)(( Math.random()* (10-1+1)+1));
            System.out.println("Задуманный масив :"+ Intrandom[i]);

        }
        int min = min (Intrandom);
        System.out.println("минимальный элемент массива равен " + min);
    }
    public static int min (int array[]) {
        int minimum = 10;
        for (int i = 0; i <array.length; i++)  {
            if (array[i]< minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }
}