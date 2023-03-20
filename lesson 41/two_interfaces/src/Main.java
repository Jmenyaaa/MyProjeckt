public class Main {
    public static void main(String[] args) {
        System.out.println("Пример класса с 2 интерфейсами");
        System.out.println();
        BankCard card = new BankCard();
        card.debitMethod();
        card.creditMethod();
    }
}