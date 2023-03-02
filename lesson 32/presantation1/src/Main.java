import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Запись в файл");
        String path = "C:\\AIR AIT\\lesson 32\\presantation\\";


        try { FileWriter myWriter = new FileWriter(path + "test.txt");
            myWriter.write("Hello, im Eugen"); // пишем то что записываем в файл
            myWriter.close(); // закрываем метод
            System.out.println("успешная запись в файл "); // сообщение о успехе
        } catch (IOException e) {  // поймали ошибку и положили ее в перемную с именем e
            System.out.println("Произошла ошибка."); // сообщение о ошибке
            e.printStackTrace();
        }

        ArrayList<String> colorsList = new ArrayList<>();
        colorsList.add("White");
        colorsList.add("Black");
        colorsList.add("Blue");
        colorsList.add("Red");

        for (int i = 0; i < colorsList.size(); i++) {
            myWriter.write(colorsList)
        }

    }
}