public class Fruits implements Comparable<Fruits>{
    String name;
    String color;
    int cal;

    public Fruits(String name, String color, int cal) {
        this.name = name;
        this.color = color;
        this.cal = cal;
    }

    @Override
    public String toString() {
        return "Fruits " +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", cal=" + cal + '\n';
    }

    @Override
    public int compareTo(Fruits anotherFrame) { // сигнатура метода тип возвращаемого значения наименование метожа и параметры
        if (this.cal == anotherFrame.cal) { // условие сравнения по площи дома
            return 0; // возвращает 0 если площи равны
        } else if (anotherFrame.cal > this.cal) {
            return -1; // возвращает -1 если одна площадь менше другой
        } else {
            return 1; // возвращает -1 если площадь меньше другой

        }
    }

}
