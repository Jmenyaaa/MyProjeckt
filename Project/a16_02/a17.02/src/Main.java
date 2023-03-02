import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
// задача 1. Вывести слово хадом наперед. Пример
        // на входе - Данно слово "Троллейсбус".
        // На выходе - Результат работы программи "Субсйеллорт"
        // Что сделать - переставить буквы в слове.
        // ключевой алгоритм - "разобрать" слово по буквам
        // развернуть массив задом наперед
        // Берем последнюю букву и записываем ее в начало массива (на 0 индекс)
        //Пред последнюю букву надо будет записать на индекс 1
        // Предпред последнюю надл будет записать на индекс 2
        // в новом массиве
        // используем для этого цикл for
        // ArrayList<String> letters = new ArrayList<String>();


        String word ="Троллейбус";
        int length = word.length();
        System.out.println("Длина слова " + length);


        ArrayList<Character> letters = new ArrayList<>();
for ( int i = 0 ; i < length ; i++ ) {
    // присвоить 0 элементу массива первую букву
    // присвоить 1 элементу массива вторую букву
    // и т.д.
    letters.add (i, Character.valueOf(word.charAt(i))); // отрывает от word буквы

}
        System.out.println(letters); // печать листа

        ArrayList<Character> lettersReverce = new ArrayList<>();
        for (int i = 0 ; i < length ; i ++ ) {
            lettersReverce.add(i, letters.get(length - 1 - i));
        }
        System.out.println(lettersReverce);
        for (char ch: lettersReverce ) {
            System.out.print(ch);

        }
        System.out.println();
        // Задача 2.
        // На входе - Предложение
        // На выходе - распечатать ArrayList , в котором содержиться слова из придложенния
        // Интерфейс - вырожденный (минимум)
        // Ключевой алгоритм - идем по строке и ищем пробел
        // когда найден пробел count++ ,

        String setence = "Все счасливые семьи похожи друг на друга, каждая несчастливая семья  счасьлива по-своему";
        String[] s = setence.split(" "); // пробел указан в кавычках!!!!!!
        for ( int i = 0 ; i < s.length; i++) {
            System.out.print(s[i] +" | ");
        }
        System.out.println();
        ArrayList<String> sentenceWords = new ArrayList<>();
        for ( int i = 0; i< s.length; i++ ) {
            sentenceWords.add(i, s[i]);
        }
        System.out.print(sentenceWords);






    }
}