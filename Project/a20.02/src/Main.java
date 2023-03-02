import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Set - множество каких-то элементов
        // Особенность этого множества в том, что оно может хранить только уникальные значения
        /* примеры
        -индексы для почтовых адресов
        - VIN автомобилей
        - серийные номера
        - буквенный алфавит
        - штрих-код
        - ссылки в Интернете
         */
        System.out.println("Латинский алфавит");

        HashSet<String> latAlphabet = new HashSet<>(); //иницилизация HashSet
        System.out.println();
        // зваполняем HashSet в цикле
        for (int i = 0; i < 26; i++) {
            latAlphabet.add(String.valueOf((char) (i + 65)));
        }
        System.out.println(latAlphabet);




/*
        System.out.println("Ввод индексов с приходящих на почту писем");
        Scanner userImput = new Scanner(System.in);
        String p_code = ""; // пременнная для почтового индекса
        char userChoice; // переменная для выбора пользователя
        int hash = 0;
        HashSet<String> postCode = new HashSet<String>(); // иницилизация HashSet
        do {
            System.out.println("Введите индекс письма: ");
            p_code = userImput.next();// считываем от пользователя индекс
            postCode.add(p_code); // добавили индекс в HashSet

            System.out.println("Для остановки нажмите S, чтобы продолжить - любую другую букву.");
            userChoice = userImput.next().toLowerCase().charAt(0);
            if (userChoice == 's') {
                break;
            }
        } while (true);

        System.out.println(postCode);
        System.out.println();
        for (String st : postCode) {
            System.out.println(st);
        }

        System.out.println();


        do {
            System.out.println("Проверка, есть ли такой почтовый индекс?");
            System.out.println("Введите индекс письма");
            p_code = userImput.next(); // считывает от пользователя индекс
            if (postCode.contains(p_code)) { // метод который проверяет наличие, возвращает true или folse
                System.out.println("есть такой индекс");
            } else {
                System.out.println("Нет такого индекса еще нет.");
            }

            System.out.println("Для остановки нажмите S, чтобы продолжить - любую другую букву.");
            userChoice = userImput.next().toLowerCase().charAt(0);
            if (userChoice == 's') {break;}
        } while (true);
  */


        System.out.println("Задача на количество уникальных слов в предложении");
        String sentence = "В 1800-х годах, в те времена, когда не було еще не железных, ни шоссейных дорог";
        System.out.println(sentence);

        int k = sentence.length();
        System.out.println(k);

        String[] s = sentence.split(" "); // массив со словами, разделенными " " (пробел)
        int w = s.length;
        System.out.println("Количество слов в предложении" + w);

        HashSet<String> wordOfSentence = new HashSet<>();

        for (int i = 0 ; i< s.length; i++) {
            wordOfSentence.add(s[i]); // HashSet будет принимать только уникальные слова
        }
        int t = wordOfSentence.size();
        System.out.println("Колтчество уникальных слов в придложении" + t);




    }
}