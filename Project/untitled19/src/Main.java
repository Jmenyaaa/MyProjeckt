import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Cоздане списка
        ArrayList<String> brandList = new ArrayList<String>();
     brandList.add("BMW");
     brandList.add("Mercedes");
     brandList.add("VW");
     brandList.add("Ford");
     brandList.add("Fiat");
     brandList.add("Opel");
        System.out.println(brandList);
        int size = brandList.size(); // размер списка
        System.out.println(size);
        int index = brandList.indexOf("Fiat");
        System.out.println(index);
        brandList.remove(4); // удаляем 4 номер из листа
        System.out.println(brandList);
        boolean BrandPresents = brandList.contains("Opel");
        System.out.println(BrandPresents);
        if (brandList.contains("Opel") == false) {
            brandList.add("Opel");

        }
        System.out.println(brandList);
        if (brandList.contains("Audi") == false) {
            brandList.add("Audi");
        }
        System.out.println(brandList);
        // распечатка листа с идексом
        for (int i=0; i < brandList.size(); i++) {
            System.out.println(i + " " + brandList.get(i));
        }
        System.out.println();

            Collections.sort(brandList);
            System.out.println(brandList);
            for (int i=0; i < brandList.size(); i++){
                System.out.println(i + " " + brandList.get(i));

        }
    }
}