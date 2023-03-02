import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Число букв в предложении");

        String sentence = "Повседневная практика показывает, что высококачественный прототип будущего проекта в значительной степени обусловливает важность новых предложений.";

        int a = sentence.length();
        System.out.println(a);
        System.out.println("Число повторяющихся букв");


        HashMap<Character, Integer> wordFrequency =  new HashMap<>();

        for (int i = 0 ; i < a ; i++) {
            char b = sentence.charAt(i);
            int num = 0;
            for ( int j = 0 ; j < a ; j++) {
                char b1 = sentence.charAt(j);
                if (b==b1) {
                    num++;
                }
            }
            wordFrequency.put(b,num);
        }
        System.out.println(wordFrequency);






    }
}