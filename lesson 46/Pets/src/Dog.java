

public class Dog {
     String name;
    int age;

    // конструктор
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return this.name + " " + this.age;
    }

}

