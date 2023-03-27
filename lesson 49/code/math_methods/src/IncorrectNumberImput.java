public class IncorrectNumberImput extends Exception{
    @Override
    public String getMessage() {
        String s = "1, 0 ,-1 are not a prime number";
        return s;
    }
}
