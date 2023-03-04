import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Список дел");
        // todo list список дел
        // Меню
        // добавить запись
        // посмотреть записи
        // удалить запись (по номеру)
        // выйти

        enum Menu {
            ADD,
            PRINT,
            DELETE,
            EXIT,
        }

        List<String> todoList = new ArrayList<>(); // иницилизация листа по списом задач

        // начало работы с пользоваьелем
        while (true) {


            for (Menu myMenu : Menu.values()) { // цикл for each - Список по который перебирает параметры цикла, значения
                System.out.print(myMenu + " | "); // оператор с параметром цикла
            }
            System.out.println();

            System.out.println("Выберите, действие: нажмите 1,2,3 или 4");
            int choice = readMenueChoice(); // выбор пользователь считаем в методе readMenuChoice
            Menu myMenu = Menu.ADD; // начальное значение выбора меню

            switch (choice) {
                case 1: {
                    myMenu = Menu.ADD;
                    add_task(todoList); // вызов метода который добавляет задачу в список
                    print_tasks(todoList); // вызов метода который печатает список задач
                    break;
                }
                case 2: {
                    myMenu = Menu.PRINT;
                    print_tasks(todoList);
                    break;
                }
                case 3: {
                    myMenu = Menu.DELETE;
                    remove_task (todoList);
                    print_tasks(todoList);
                    break;
                }
                case 4: {
                    myMenu = Menu.EXIT;
                    System.out.println("Спасибо, до свидания!");
                    return;
                }
                default:{
                    System.out.println("Введите число 1, 2, 3 или 4");
                }
            }
        }



    }
    //метод который считывает выбор пользователя из меню
    public static int readMenueChoice() {
        Scanner sc = new Scanner(System.in);
        int menuChoice = 0;
        try {
            menuChoice = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("нужно вводить числа, а не символы.");

        }
        return menuChoice;
    }
    // метод для добавления задач в список задач
    public static void add_task (List<String> tasks) {
        System.out.println("Введите задачу :");
        Scanner sc = new Scanner(System.in);
        String task = sc.nextLine(); // считали строку с задачи
        tasks.add(task); // в список tasks вносим методом add новое значение
    }
    // этот метод печатает список задач
    public static  void print_tasks (List<String> tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            int n = i + 1; // задаем номер задачи в списке
            System.out.println(n + ". " + tasks.get(i)); // печатаем задачу
            if (tasks.size() == 0) {
                System.out.println("Задач еще нет, начните их добавлять ");
            }

        }
    }
    // этот метод удаляет выбранную пользователем задачу по ее номеру
    public static void remove_task(List<String> tasks) {
        System.out.println("Выбере номер задачи для удаления: ");
        Scanner sc = new Scanner(System.in);
        int task_num = sc.nextInt();
        if (task_num >= 1 && task_num <= tasks.size()) {
            int n = task_num - 1; // индекс задачт на 1 меньше чем ее номер на экране
            tasks.remove(n);// удаляем задачу из списка с индексом n
        } else {
            System.out.println("Выбран неверный номер задачи.");
            return;
        }

    }


}