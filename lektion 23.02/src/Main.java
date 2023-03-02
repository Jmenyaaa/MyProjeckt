import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {





        HashMap < String,Double> curValue=new HashMap<>();
        curValue.put( "EUR", 1.0);
        curValue.put( "USD" ,1.06);
        curValue.put( "CHF",0.99);
        curValue.put( "UAH",38.86);
        curValue.put( "GBP",0.88);
        curValue.put( "ILS",3.84);
        curValue.put( "PLN",4.74 );
        curValue.put( "CAD",1.44);
        curValue.put( "CNY",7.32);
        curValue.put( "JPY",143.19);


        HashMap < String,String> currency=new HashMap<>();
        currency.put("EUR","Евро");
        currency.put("CHF","Франк Швейцария");
        currency.put("USD","Доллар CША");
        currency.put("UAH","Гривна");
        currency.put("GBP","Фунт стерлингов");
        currency.put("ILS","Шекель ");
        currency.put("PLN","Злотый Польша");
        currency.put("CNY","Юань");
        currency.put("CAD","Доллар Канада");
        currency.put("JPY","Иена");
        




        System.out.println("Введите валюту, которую хотите конвентировать ");
        for (String i : curValue.keySet()) {
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        key = key.toUpperCase();


        scanner = new Scanner(System.in);

        int sum = scanner.nextInt();

        if (key.equals("eur")) {
            for (String i : curValue.keySet()) {
                System.out.println("В валюте " + i + " сумма" + curValue.get(i)*sum);
            }
        } else if (curValue.get(key) != null) {
            double indexVal = curValue.get(key);
            indexVal = 1 / indexVal;
            for (String i : curValue.keySet()) {
                System.out.println("В валюте " + i + " сумма" + curValue.get(i)* indexVal);
            }
        } else System.out.println("Некоректный ввод.");


    }

    public static void kursVal(HashMap<String, Double> curValue, HashMap <String, String> currency) {

    }
}
