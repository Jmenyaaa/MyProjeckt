

import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Список группы 23-2");

        HashMap<String, Integer> group2 = new HashMap<>(); // инициализация HashMap

        group23.put( "Vadim", 25);
        group23.put( "Leonid B", 25);
        group23.put( "Lilian", 40);
        group23.put( "Viacheslav", 25);
        group23.put( "Dina", 36);
        group23.put( "Katerina Z", 44);
        group23.put( "Katerina K", 33);
        group23.put( "Валентин", 40);
        group23.put( "Oleg", 38);
        group23.put( "Жека", 19);
        group23.put( "Yehor", 32);
        group23.put( "Maryna", 33);
        group23.put( "Leonid K", 59);

        for (String i : group23.keySet()) {
            System.out.println("key: " + i + " value: " + group23.get(i));
        }

        System.out.println(group23.get("Leonid K"));


*/
        /*
     for (String i : group23.keySet()) {
            System.out.println("Name: " + i + " | " + " Age: " + group23.get(i));

 */





        System.out.println("Список группы с указанием пола");

        HashMap<String, String> group23 = new HashMap<String, String>();

        int man = 0; // кол-во мужчин
        int woman = 0; // кол-во женщин

        group23.put( "Vadim", "Man");
        group23.put( "Leonid", "Man");
        group23.put( "Lilian", "Man");
        group23.put( "Viacheslav", "Man");
        group23.put( "Katerina", "Women");
        group23.put( "Dina", "Women");
        group23.put( "Natalia", "Women");
        group23.put( "Elisabeth", "Women");
        group23.put( "Ekaterina", "Women");

        for (String i : group23.keySet()) {
            // System.out.println(group23.get(i));
            if (group23.get(i).equals("Man")) { // берем значение для ключа i
                man++; // увеличили кол-во мужчин на 1
            }
        }

        for (String i : group23.keySet()) {
            // System.out.println(group23.get(i));
            if (group23.get(i).equals("Women")) { // берем значение для ключа i
                woman++; // увеличили кол-во мужчин на 1
            }
        }

        System.out.println("Мужчин в группе: " + man);
        // int woman = group23.size() - man;
        System.out.println("Женщин в группе: " + woman);




        System.out.println("Частота слов в предложении.");

        //String sentence = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.";

        String sentence = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.\";";
        System.out.println("Дано предложение: " + sentence);

        // Алгоритм действий:
        // Нам нужно плучить ответ в виде пары: Слово(word - String) + " встретилось  в тексте" + количество(frequencies - Integer)
        // В HashMap будем класть слово и его частоту появления
        // Предложение можно разсделиь на слова методом split по раздедителю - " "
        // Частота появления слова подсчитаем в цикле for по количеству слов
        // В цикле проверяем встретилось ли такое слово и если да, то частоту ++
        // частота нужна для кадого слова, поэтому частоты занесем в массив frequency[i]
        // В итоге в HashMap положим word[i], frequency[i]

        String[] s = sentence.toLowerCase().split(" ");  // массив для слов
        int w = s.length;
        System.out.println("Количество слов в предложении: " + w);

        int [] frequency = new int[w];

        for ( int i = 0 ; i < s.length ; i++ ) { // берем каждое слово из предложения
            for ( int j=0 ; j < s.length ; j++  ) { // перебираем каждое слово в предложении для сравнения
                if (s[i].equals(s[j]) ) { // если слово из предложения нашлось среди всех других слов в этом предложении
                    frequency[i]++;
                }
            }
        }
        HashMap<String, Integer>  wordFrequency =  new HashMap<>(); // инициализация HastMap
        // заполнение HashMap в цикле
        for ( int i=0 ; i < s.length  ; i++) {
            wordFrequency.put(s[i], frequency[i]);
        }

        // Выводим на печать
        for (String i : wordFrequency.keySet()) {
            System.out.println("Слово: " + i + " Количество повторений: " + wordFrequency.get(i));
        }
    }
}



/*
// int k = sentence.length(); // количество букв в предложении
        // System.out.println("Количество букв в предложении: " + k);

        String[] s = sentence.split(" "); // массив со словами, разделенными " " (пробел)
        int w = s.length;
        System.out.println("Количество слов в предложении: " + w);
        System.out.println();

        int[] frequency = new int[w];

        HashMap<String, Integer> wordsFrequency = new HashMap<String, Integer>();
        // int frequency = 0;

        for ( int i = 0; i < s.length; i++) {  // цикл по словам в предложении
         for ( int j = 0; j < s.length; j++ ) { // цикл по словам предложения
             if ((s[i]).equals(s[j])) { // сравнение двух Strig
                 frequency[i]++;
                 // s[j] = "none"; // когда нашелся дубликат его надо обнулить
             }
             wordsFrequency.put(s[i], frequency[i]); // если опять нашлось слово, то в HashMap запишется последнее значение
         }
        }
        // печать результатов
        for (String i : wordsFrequency.keySet()) {
            System.out.println("Слово: " + i + " | Количество повторов: " + wordsFrequency.get(i));
        }
 */













