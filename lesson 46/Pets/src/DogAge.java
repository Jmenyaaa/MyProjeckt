import java.util.Comparator;

public class DogAge implements Comparator<Dog> {
    @Override
    public int compare(Dog d, Dog d1) {
        return d.age - d1.age;
    }
}
