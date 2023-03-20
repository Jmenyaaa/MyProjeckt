public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person person = new Person("Kate", 32,"Baker Street, 26", "+1764572312");
        person.displayName();
        person.displayAge();
        person.displayPhone();
    }
}