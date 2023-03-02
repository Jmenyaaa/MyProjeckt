public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");

        int year;
        year = 2024;
        boolean a1 = (year%4)==0;
        boolean b1 = (year%100) != 0;
        boolean c1 = (year%100==0)&& (year%400 == 0);
        System.out.println(a1 && (b1 || c1));

      int a,b;
      a = 10;
      b = 20;
      boolean q = (a == b);

      System.out.println(q);

     boolean g1 = true;
     boolean g2 = false;
     System.out.println(g1|g2);





     int vasya = 1;
     int petya = 2;
     boolean smile = (1==2);
     boolean smile1 = (2==1);


     System.out.println(smile==smile1);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Name: ");
        String str = scanner1.nextLIne();
        System.out.println(str);













    }











}