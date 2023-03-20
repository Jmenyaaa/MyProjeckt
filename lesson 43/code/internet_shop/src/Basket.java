import java.util.ArrayList;

public class Basket  {
   ArrayList products;

    public Basket(ArrayList products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + products +
                '}';
    }
}
