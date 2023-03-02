public class Main {
    public static void main(String[] args) {
        // вывести выходные дни из масива
        System.out.println("Все дни недели");
       String [] days = new String[7];
       days [0] = "Monday";
       days [1] = "Tuesday";
        days [2] = "Wednesday";
        days [3] = "Thursday";
        days [4] = "Friday";
        days [5] = "Saturday";
        days [6] = "Sunday";
        for (int i = 0; i < days.length; i++){
            System.out.println(days[i]);
        }
        System.out.println();

        System.out.println("Выходные дни: "+ days[5]+ ", " +days[6]);
    }
}