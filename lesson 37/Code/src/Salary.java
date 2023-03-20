public class Salary extends Employee { // extens - это расширить, унаследовать
    private double salary;

    public Salary(String name, String email, int ID_num, double salary) {
        super(name, email, ID_num); // вытащил поля из родительского класса Employee
        this.salary = salary; // добавили к ним зарплату
    }
    public void mailPaySlip() {
        System.out.println("Это метод класса Salary");
        System.out.println("Увадаемый " + getName() + ", направляем информацию о зарплате на адрес " + getEmail());
        System.out.println("Ваша годовая зарплата " + getSalary());
        System.out.println("Ваша удемесячная зарплата " + getSalary()/12);
    }
// это геттер по зарплате
    public double getSalary() {
        return salary;
    }
    // сеттер для зарплаты

    public void setSalary(double newSalary) { // передаем в метод значение newSalary

        // this.salary = salary;
        if (newSalary >0 ) { // если зарплата положительная, то ее назначаем
            salary = newSalary;
        }

    }

    @Override
    public String toString() {
        return "Salary{" +
                "salary=" + salary +
                '}';
    }
}
