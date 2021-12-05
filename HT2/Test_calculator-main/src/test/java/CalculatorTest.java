import com.it_academy.practice.junit_basics.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculatorTest {
    @ParameterizedTest
    @MethodSource("source")
    public void testComparingAnswers(int a, char operation, int b, int requiredResult){
        float result = new Calculator(a,b).calculate(operation);
        assertEquals(requiredResult, result);
    }
    private static Stream<Arguments> source() {
        return Stream.of(
                arguments(2, '+', 2, 4),
                arguments(2, '+', -2, 0),
                arguments(-2, '+', -2, -4),
                arguments(6, '*', 3, 18),
                arguments(6, '*', -3, -18),
                arguments(-6, '*', -3, 18),
                arguments(6, '/', 3, 2),
                arguments(3, '/', 6, 0),
                arguments(6, '/', -3, -2),
                arguments(-6, '/', -3, 2),
                arguments(5, '-', 4, 1),
                arguments(5, '-', -4, 9),
                arguments(-5, '-', -4, -1),
                arguments(-5, '?', -4, 0),
                arguments(-5, ' ', -4, 0)
        );
    }
    @Test
    public void testDivisionByZero(){
        assertThrows(ArithmeticException.class, ()->new Calculator(1,0).calculate('/'));
    }

}
