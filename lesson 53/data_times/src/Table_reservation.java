import java.time.LocalDate;
import java.time.LocalDateTime;

public class Table_reservation {
    int tableNum;
    boolean tableStatus;
    LocalDate timeReservation;
    public Table_reservation(int tableNum, boolean tableStatus,  timeReservation) {
        this.tableNum = tableNum;
        this.tableStatus = tableStatus;
        this.timeReservation = timeReservation;
    }

    public int getTableNum() {
        return tableNum;
    }

    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }

    public boolean isTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(boolean tableStatus) {
        this.tableStatus = tableStatus;
    }

    public LocalDate getTimeReservation() {
        return timeReservation;
    }

    public void setTimeReservation(LocalDate timeReservation) {
        this.timeReservation = timeReservation;
    }

    @Override
    public String toString() {
        return this.tableNum + " " + this.tableStatus + " " + this.timeReservation;
    }
}
