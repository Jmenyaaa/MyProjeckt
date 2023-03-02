import java.sql.SQLOutput;

public class Main {

int year;
year = 1999;
boolean a1 = (year%4)==0;
boolean b1 = (year%100) != 0;
boolean c1 = (year%100)&& (year%400 == 0);

System.out.println(a1 && (b1 || c1));




    public static void main(String[] args) {
        System.out.println("Hello world!");
    }






}