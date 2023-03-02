public class Main {
    public static void main(String[] args) {


        int number = 10;
        if (number>=0 && number<10){
            System.out.println("a");
        }
        else if (number>=10 && number<100){
            System.out.println("b");
        }
        else if (number>=100 && number<1000){
            System.out.println("c");
        }
        else if (number>1000 && number<10000){
            System.out.println("d");

        }

       int a =10;
        int b =7;
        int c = 5;
        if (c>=b && c>=a){
            System.out.println("самое большое число" +c);
        }
       else if (b>=a && b<=c){
            System.out.println("среднее число"+b);
        }
        else {
            System.out.println("меньшее число"+a);
        }




        if (a>=b){
            if(a>=c){
                System.out.println(a+"самое большое число");
            }
            else{
                System.out.println(c+"самое большое число");
            }, 
            }
            else{
                if (b>=c){
                    System.out.println(b+ "самое большое число");
                }
                else {
                    System.out.println(c+ "самое большое число");
                }
        }
        }










    }
}