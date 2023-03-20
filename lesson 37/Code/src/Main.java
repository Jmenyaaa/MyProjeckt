import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Работник и зарплата.");
        // Нужно иметь систему, в которой есть Сотрудники, их Зарплаты и надо
        // уметь отправлять им письмо по эмайлу с информацией

     //   Employee empl1 = new Employee("Иванов Петр", "ivanov_p@mail.com", 101);
        // empl1.mailPaySlip();

        // Создаем работника с зарплатой

        Address s1 = new Address("Иванов Петр", "ivanov_p@mail.com", 101,  "Waldemar str");
//      System.out.println(s1);
  //        System.out.println(s2);
        System.out.println(s1.toString());
        System.out.println(s1.getName() + s1.Address);

    }



}