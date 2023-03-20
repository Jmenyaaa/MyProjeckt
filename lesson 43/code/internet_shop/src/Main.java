import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Интернет - магазин v 0.1");
     /*   **Интернет магазин, часть 1**
        Создать класс Товар, имеющий переменные имя, цена, рейтинг.
        Создать класс Категория, имеющий переменные имя и массив товаров.
                Создать несколько объектов класса Категория.
        Создать класс Basket, содержащий массив купленных товаров.
                Создать класс User, содержащий логин, пароль и объект класса Basket.
        Создать несколько объектов класса User.
                Вывести на консоль каталог продуктов.
     Вывести на консоль покупки посетителей магазина.
      */

// продукты класса Products
        Product p1 = new Product("утюг", 80, 5);
        Product p2 = new Product("кофемашина", 300, 4);
        Product p3 = new Product("холодильник", 600, 7);
        Product p4 = new Product("компьютер", 600, 7);
        Product p5 = new Product("ноутбук", 1000, 7);
        ArrayList products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);

        Catalog catalog1 = new Catalog("Битовая техника", products);
        Catalog catalog2 = new Catalog("компютеры", products);
        Catalog catalog3 = new Catalog("Мебель",products);

    }
}