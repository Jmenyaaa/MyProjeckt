public class Main {
    public static void main(String[] args) {
        System.out.println("Пример создания класса ");

        class Car {
            String brand;
            String color;
            int year;
            String type;
        }
        Car myCar = new Car();
          myCar.brand = "WG";
          myCar.color = "silver";
          myCar.type = "universal";
          myCar.year = 2018;
        System.out.println("Марка автомобиля " + myCar.brand + " цвет" + myCar.color + " год выпуска" + myCar.year);

        Pet myPet = new Pet();
        myPet.type = "dog";
        myPet.bread = "dachshund";
        myPet.name = "Adel";
        myPet.weight = 5.5;

        System.out.println("Тип " + myPet.type + " Порода " + myPet.bread + " Имя " + myPet.name + " Вес " + myPet.weight);
        System.out.println();

        System.out.println(myPet.toString());

    }
}