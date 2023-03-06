public class Pet {
    String type;
    String bread;
    String name;
    double weight;

    @Override // переопределить метод
    public String toString() {
        return "Pet " +
                "type='" + type + " | " +
                ",  bread='" + bread + " | " +
                ", name='" + name + " | " +
                ", weight=" + weight +
        ".";
    }
}
