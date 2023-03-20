public class Main {
    public static void main(String[] args) {
        System.out.println("Сравнение класса");
        Money m1 = new Money(100, "EUR");
        Money m2  = new Money(100,"USD");
        Money m3 = new Money(1000, "eur");
        Money m4 = new Money(100, "eur");
        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(m3));
        System.out.println(m1.equals(m4));

    }
}