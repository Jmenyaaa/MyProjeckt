import java.util.Comparator;

public class SortbyID implements Comparator <Employee> {
    // нужно имплементировать создать сотед  campare
    @Override
    public int compare(Employee a, Employee b) {
        return a.empID - b.empID; // сравниваем номера в математическом порядке
    }
}
