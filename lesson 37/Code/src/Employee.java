public abstract class Employee {
    private String name;
    private  String email;
    private int ID_num;

    public Employee(String name, String email, int ID_num) {
        this.name = name;
        this.email = email;
        this.ID_num = ID_num;
    }
    // метод для отправки информации
    public void mailPaySlip() {
        System.out.println("Это метод класса Employee");
        System.out.println("Увадаемый " + this.name + ", направляем информацию о зарплате на адрес " + this.email);

    }
    // этот метод переопределяет стандартный toString

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", ID_num=" + ID_num +
                '}';
    }
// это геттер
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getID_num() {
        return ID_num;
    }
}
