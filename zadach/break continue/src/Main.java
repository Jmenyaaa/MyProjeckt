public class Main {
    public static void main(String[] args) {

        // применение break, continue
        int [] numbers = {10,20,30,40,50};


        for ( int x :numbers) {
            if (x == 20) { // пропустить число 20 в масиве
                continue;
            }
            System.out.println(x);

        }
        System.out.println();
        for (int y: numbers) {
            if (y == 30){ // цыкл остановиться если число достигнет 30
                break;
            }
            System.out.println(y);
        }








    }
}