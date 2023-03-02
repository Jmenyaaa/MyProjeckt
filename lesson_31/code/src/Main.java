import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Перевод строки, содержащей число, в число ");
        String strNum = "155";
        System.out.println("Строки с цифрами " + strNum);
        int num1 = Integer.parseInt(strNum);
        System.out.println("Получилось число " + num1);
        System.out.println();

        String st = "5";
        int table_num = Integer.parseInt(st);
        System.out.println("Номер строки " + table_num);
        System.out.println();

        System.out.println("Пример работы с файлом - СОЗДАНИЕ НОВОГО ФАЙЛА ");

        String path = "C:\\AIR AIT\\lesson_31\\code\\src\\";
 /*
        try {
            File myFile = new File(path + "test.txt"); // Укажите имя файла
            if (myFile .createNewFile()) {
                System.out.println("Файл создан : " + myFile.getName());
            } else {
                System.out.println("Файл уже существует.");
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка");
            e.printStackTrace();
        }
        */
        // запись в файл текста
        System.out.println("Пример работы с файлом - ЗАПИСЬ В ФАЙЛ ");

        try {
            FileWriter myWriter = new FileWriter(path + "test.txt");
            myWriter.write("Это пробная запись текста в файл."); // пишем то что записываем в файл
            myWriter.close(); // закрываем метод
            System.out.println("успешная запись в файл "); // сообщение о успехе
        } catch (IOException e) {  // поймали ошибку и положили ее в перемную с именем e
            System.out.println("Произошла ошибка."); // сообщение о ошибке
            e.printStackTrace();
        }

        // Чтение текста из файла
        System.out.println("Пример работы с файлом - ЧТЕНИЕ из ФАЙЛА ");

        try {
            File myFile = new File(path + "test.txt");
            Scanner myReader = new Scanner(myFile); // готовим сканер дл чтения
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine(); // считываем строку
                System.out.println(data); // печатаем считанную строку
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("ПРоизошла ошибка.");
            e.printStackTrace();
        }


    }
}

