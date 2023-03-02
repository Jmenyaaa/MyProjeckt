public class Main {
    public static void main(String[] args) {
        int [][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] =  (int) ((Math.random()* (1 - 0 +1)+0));
                System.out.print(array[i][j] + " | ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
              //  array[i][j] =  (int) ((Math.random()* (1 - 0 +1)+0));
                System.out.print(array[i][j] + " | ");
                 sum  = sum + array[i][j];

            }

            System.out.print("сумма = " + sum );
            System.out.println();
            sum = 0;
        }
    }
}