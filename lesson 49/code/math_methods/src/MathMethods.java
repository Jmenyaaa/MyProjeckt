public class MathMethods {
    // переменные поля класса не нужны

    // констурктор не нужен

    // в классе будут только его методы MathMethod.имяМетода()

    //проверка что число простое
    public boolean isPrimeNumber(int number) throws IncorrectNumberImput{
        // перебираем 2,3,4,5,..., - 1b проверяем делится ли number без остатка
        // если хоть раз разделилось без остатка (остаток == 0), но ЭТО НЕ ПРОСТОЕ число
        if (number ==0 || number==1 || number < 0){
            throw new IncorrectNumberImput();
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // нашелся делитель и число не простое
            }
        }
        return true;
    }

    //  проверка что число четкое
    public boolean isEven(int number) {
        if (number % 2 == 0) {return true;} else
            return false;
    }
    public boolean isDivisibility(int number) {
        if (number % 5 == 0) {
            if (number % 3== 0)
            return true;
        }
        return false;
    }

    // действие n! = 1*2*3*....*n, то есть 5! =1*2*3*4*5
}
