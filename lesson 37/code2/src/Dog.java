public class Dog extends Animal {
    String breed;
// конструктор




    }


    public void makeNoise() {
        System.out.println("Гав гав");

    }


    public void eat() {
        System.out.println("Котячий корм Kity dog");
    }


    public void getDescription() {
        System.out.println("Описание отряда собачьих");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}


