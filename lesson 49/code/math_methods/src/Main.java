public class Main {
    public static void main(String[] args) throws IncorrectNumberImput {
        System.out.println("Математические методы");
        //проверка что число простое
        //  проверка что число четкое
        // действие n! = 1*2*3*....*n, то есть 5! =1*2*3*4*5
        MathMethods method1 = new MathMethods();
        MathMethods method2 = new MathMethods();
        MathMethods method3 = new MathMethods();
        try {

            System.out.println(method1.isPrimeNumber(121));
            System.out.println(method1.isPrimeNumber(168));
            System.out.println(method1.isPrimeNumber(19));
            System.out.println(method1.isPrimeNumber(11));
            System.out.println(method1.isPrimeNumber(4));
            System.out.println(method1.isPrimeNumber(10));
            System.out.println(method1.isPrimeNumber(29));
            System.out.println(method2.isEven(4));
            System.out.println(method3.isDivisibility(30));
            System.out.println();
            System.out.println(method1.isPrimeNumber(0));
            System.out.println(method1.isPrimeNumber(1));
            System.out.println(method1.isPrimeNumber(-1));
        } catch (IncorrectNumberImput ex) {
            System.out.println(ex);
        }

    }
}