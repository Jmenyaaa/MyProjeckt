
    public class Money {

        private long amount; // переменная типа long
        private String currency; // название валюты USd EUR

// констурктор модифицированный
        public Money(double amount, String currency) { // переопределили тип переменной
            this.amount = Math.round(amount * 100); // round это округление и умножение на 100 т.е считаем сотнями
            this.currency = currency;
        }
// переопределение метода toString
        @Override
        public String toString() { // это сигнатура метода доступный, возвращает строку
            return String.format("%.2f %s", amount / 100.0, currency.toUpperCase()); // вывод количество денег и название валюты
        }
// переопределение методы equals
        @Override
        public boolean equals(Object other) {
            if (this == other) { // если этот обьект класса равен другому обьекту класса
                return true;
            }
            if (!(other instanceof Money money)) { // такая валюта есть в обьектах этого класса
                return false; // возвращает false если такой валюты нет
            }
            return amount == money.amount && currency.equalsIgnoreCase(money.currency); // если количество денег совпадает и название валют то true

       }
    }
