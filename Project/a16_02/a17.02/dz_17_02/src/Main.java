import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 String setence = sc.nextLine();
        int length = word.length();
        ArrayList<Character> letters = new ArrayList<>();
        for ( int i = 0 ; i < length ; i++ ) {
            letters.add (i, Character.valueOf(word.charAt(i))); // отрывает от word буквы

        }
        System.out.println(letters);



        String[] s = setence.split(" ");
        ArrayList<String> sentenceWords = new ArrayList<>();
        for ( int i = 0; i< s.length; i++ ) {
            sentenceWords.add(i, s[i]);
        }
        System.out.print(sentenceWords);



    }
}
