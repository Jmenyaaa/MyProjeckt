import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String path = "C:\\AIR AIT\\MyProjeckt\\lesson 48\\file io example\\src\\";
        String fileName = "data.txt";
        //CRUD - create,read,update,delete
        crateFile(path, fileName); //создаем файл
        String data = "пью чай с рулетом";
        writeDataInFile(path, fileName, data); // пишем данные в файл
        readDataFromFile(path, fileName, data);
        System.out.println(data);

    }

    private static void crateFile(String path, String fleName) {
        try {
            File myFile = new File(path + fleName); // Укажите имя файла
            if (myFile.createNewFile()) {
                System.out.println("Файл создан : " + myFile.getName());
            } else {
                System.out.println("Файл уже существует.");
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка");
            e.printStackTrace();
        }
    }
    private static void writeDataInFile(String path, String fileName, String data) {
        try {
            FileWriter myWriter = new FileWriter(path + fileName); // используем класс и его метод
            myWriter.write(data); // Пишем то, что записываем в файл
            myWriter.close(); // Закрываем метод
            System.out.println("Успешная запись в файл."); // Сообщение об успехе
        } catch (IOException e) {  // поймали ошибку и положили ее в переменную с именем e
            System.out.println("Произошла ошибка."); // Сообщение об ошибке
            e.printStackTrace(); // печать содержания ошибок
        }
    }
   private static String readDataFromFile(String path, String fileName, String data) {
        try {
            File myFile = new File(path + fileName);
            Scanner myReader = new Scanner(myFile); // готовим сканер для чтения
            while (myReader.hasNextLine()) {
                data = myReader.nextLine(); // считываем строку
                // System.out.println(data); // печатаем считанную строку
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }
        return data;
    }
}