import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class MathMethodsTest {
   MathMethods mathMethods;
   MathMethods mathMethods1;
   MathMethods mathMethods3;
    @BeforeEach
    void setUp(){
        mathMethods = new MathMethods(); // создаем экземпляр тестируемого класса перед каждым тестом
        mathMethods1 = new MathMethods();
        mathMethods3 = new MathMethods();
    }
    @Test
@DisplayName("Тестируем метод isPrime")
void testIsPrime () throws IncorrectNumberImput {
        assertTrue(mathMethods.isPrimeNumber(13));
        assertFalse(mathMethods.isPrimeNumber(121));
    }

   @Test
    @DisplayName("Тестируем метод isEven")
    void testIsEven () {
        assertTrue(mathMethods1.isEven(4));
        assertFalse(mathMethods1.isEven(5));
    }
    @Test
    @DisplayName("Тестируем метод isDivisibility")
    void testIsDivisibility () {
        assertTrue(mathMethods3.isDivisibility(15));
        assertFalse(mathMethods.isDivisibility(25));
    }
}
