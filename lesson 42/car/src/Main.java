public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car car1 = new Car(0, "red");

        car1.paint();
        System.out.println(car1);

        Auto auto = new Auto(0,"white", 5);
        auto.paint();
        System.out.println(auto);
    }
}