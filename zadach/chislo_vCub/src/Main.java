public class Main {
    public static void main(String[] args) {
        //метод в кубе
        int a3 = 2;
        int b3 = 3;
        double cub =  Math.pow(a3, b3); // Метод Math.pow() – возводит значение первого аргумента в степень второго аргумента, тем самым позволяет осуществить быстрое возведение в степень любых значений.
        System.out.printf("Число 2 в кубе равно %.0f ", cub); //  для вывода на экран целого значения используется "%.0f"
    }
}