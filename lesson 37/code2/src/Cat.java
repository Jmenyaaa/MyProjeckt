public class Cat extends Animal{
    String breed;
// конструктор


    public Cat(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void makeNoise() {
        System.out.println("Мяу Мяу");

    }


    public void eat() {
        System.out.println("Котячий корм Kity cat");
    }


    public void getDescription() {
        System.out.println("Описание отряда котячих");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
