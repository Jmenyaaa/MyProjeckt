public class Phone {
    String phoneNumber;
    String brand;
    String model;


    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
/*
    public void receiveCall (String name) { // сигнатура метода
        System.out.println("Звонит " + name);
    }

    public String getPhoneNumber() { // гетер для телефоного номера
        return phoneNumber;
    }
    */

// конструктор класса
    public Phone(String phoneNumber, String brand, String model) {
        this.phoneNumber = phoneNumber;
        this.brand = brand;
        this.model = model;
    }


}
