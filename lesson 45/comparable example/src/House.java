public class House implements Comparable<House>{
    int area;
    int price;
    String city;

    public House(int area, int price, String city) {
        this.area = area;
        this.price = price;
        this.city = city;
    }

    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", price=" + price +
                ", city='" + city + '\'' +
                '}' + '\n';
    }
    @Override
    public int compareTo(House anotherHouse) { // сигнатура метода тип возвращаемого значения наименование метожа и параметры
        if (this.price == anotherHouse.price) { // условие сравнения по площи дома
            return 0; // возвращает 0 если площи равны
        } else if (this.price < anotherHouse.price) {
            return -1; // возвращает -1 если одна площадь менше другой
        } else {
            return 1; // возвращает -1 если площадь меньше другой

        }
    }
}
