public class Car {
    static final String platform = "Number One";
   int age;
    static String color;

    public Car(int age, String color) {
        this.age = age;
        this.color = color;
    }
    public static void paint() {
        System.out.println("Aвтомобиль покрашен в " + color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ",Platform= " + platform + '}';
    }
}
