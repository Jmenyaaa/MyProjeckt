import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        task1();

    }
    // прочитать высоту треугольника и нарисовать треугольник звездочками
    //*
    //**
    //***
    //****
    public static void task1() throws IOException {
        System.out.println("начался метод");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // метод parseInt(срока) берет строку и  пытается распознать (распечатать) (parce) в ней числа
        // ессли строку не получилось превратить в число выкинет
        int height = Integer.parseInt(br.readLine());
        printTraingle(height);


    }
    public static void printTraingle (int height) {
        System.out.println("начался метод");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // метод parseInt(срока) берет строку и  пытается распознать (распечатать) (parce) в ней числа
        // ессли строку не получилось превратить в число выкинет
        for (int lenght = 1; lenght <= height; ++lenght){
            for (int i = 0; i<lenght; ++i ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}