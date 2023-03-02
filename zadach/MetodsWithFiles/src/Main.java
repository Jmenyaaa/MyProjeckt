import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Создание нового файла");

        String path = "C:\\AIR AIT\\zadach\\MetodsWithFiles\\";

        try {
            File myFile = new File(path + "HomeWork.txt"); // Укажите имя файла
            if (myFile.createNewFile()) {
                System.out.println("Файл создан : " + myFile.getName());
            } else {
                System.out.println("Файл уже существует.");
            }

        } catch (IOException e) { // поймали ошибку и положили ее в перемную с именем e
            System.out.println("Произошла ошибка"); // сообщение о ошибке
            e.printStackTrace();


        }
        System.out.println();


        System.out.println("Запись в файл");


        try { FileWriter myWriter = new FileWriter(path + "test.txt");
            myWriter.write("Hello, im Eugen"); // пишем то что записываем в файл
            myWriter.close(); // закрываем метод
            System.out.println("успешная запись в файл "); // сообщение о успехе
        } catch (IOException e) {  // поймали ошибку и положили ее в перемную с именем e
            System.out.println("Произошла ошибка."); // сообщение о ошибке
            e.printStackTrace();
        }
        System.out.println();

        System.out.println("Чтение файла");

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