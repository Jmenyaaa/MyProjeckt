public class Main {
    public static void main(String[] args) {
        System.out.println("Мои винные погреба:");
        System.out.println();

        System.out.println("Погреб N1");
        Wine myWine;
        myWine = new Wine();
        myWine.name = "Martini";
        myWine.color = "White";
        myWine.year = 2017;
        myWine.onStock = 167;

        System.out.println(myWine.toString());
        System.out.println("Количество бутылок в погребе N1: " + myWine.onStock);
        System.out.println();

        System.out.println("Погреб N2");
        Wine1 myWine1;
        myWine1 = new Wine1();
        myWine1.name = "Crianza Rioja";
        myWine1.color = "Red";
        myWine1.year = 2015;
        myWine1.onStock = 243;
        System.out.println(myWine1.toString());
        System.out.println("Количество бутылок в погребе N2: "+ myWine1.onStock);
        System.out.println();

        System.out.println("Погреб N3");
        Wine2 myWine2;
        myWine2 = new Wine2();
        myWine2.name = "Taka Sauvigno";
        myWine2.color = "White";
        myWine2.year = 2018;
        myWine2.onStock = 67;
        System.out.println(myWine2.toString());
        System.out.println("Количество бутылок в погребе N3: " + myWine2.onStock);




    }
}