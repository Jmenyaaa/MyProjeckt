public class Main {
    public static void main(String[] args) {
        // таблица квадтратов  от 0 до 10
        for (int i = 0; i <= 10; i++) {
            int square = (int) Math.pow(i, 2); // метод который приводит в квадрат i

            System.out.println(i+ "   " + square);

        }
    }
}