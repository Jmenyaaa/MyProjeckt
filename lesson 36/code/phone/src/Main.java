public class Main {
    public static void main(String[] args){
        System.out.println("Класс телефон практикум");
        Phone phone1 = new Phone("+491766544336", "Samsung", "A5");
        Phone phone2 = new Phone("+491766334554", "Apple", "Iphone 13");
        Phone phone3 = new Phone("+491746547836", "Apple", "iphone 12");
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
/*
        Phone myPhone1 = new Phone();
        myPhone1.phoneNumber = "+491766544336";
        myPhone1.brand = "Samsung";
        myPhone1.model = "A5";

        Phone myPhone2 = new Phone(); // пораждаем новый экхемпляр класса
        myPhone2.phoneNumber = "+4917662724690";
        myPhone2.brand = "Apple";
        myPhone2.model = "Iphone 13";

        Phone myPHone3 = new Phone();
        myPHone3.phoneNumber = "+4917676439842";
        myPHone3.brand = "Apple";
        myPHone3.model = "Iphone 12";



        System.out.println(myPhone1.toString());
        System.out.println(myPhone2.toString());
        System.out.println(myPHone3.toString());

        myPhone1.receiveCall("Друг");

        System.out.println("Номер первого телефона: " +myPhone1.getPhoneNumber());
        System.out.println("Номер второго телефона: " +myPhone2.getPhoneNumber());
        System.out.println("Номер третего телефона: " + myPHone3.getPhoneNumber());


*/


    }
}