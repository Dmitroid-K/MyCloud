import com.it_academy.practice.junit_basics.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.lang.Float.NaN;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculatorAdvancedTest {
    @ParameterizedTest
    @MethodSource("source")
    public void testComparingAnswers(int a, char operation, int b, float requiredResult) {
        float result = new Calculator(a, b).calculateAdvanced(operation);
        assertEquals(requiredResult, result);
    }

    private static Stream<Arguments> source() {
        return Stream.of(
                arguments(2, '^', 2, 4),
                arguments(1, '^', -2, 1),
                arguments(-2, '^', 3, -8),
                arguments(4, 'r', 2, 2),
                arguments(4, 'r', -2, 0.5f),
                arguments(-4, 'r', 0, 1),
                arguments(-4, 'r', 2, NaN)
        );
    }
    @Test
    public void testMultiple(){
        assertEquals(2, Calculator.calculateMultipleArguments("1","+","1","/","2","+","1"));
    }
    @Test
    public void testDivisionByZero(){
        assertThrows(ArithmeticException.class, ()->Calculator.calculateMultipleArguments("1","+","1","/","0","+","1"));
    }
    @Test
    public void testTypes(){
        assertThrows(NumberFormatException.class,()->Calculator.calculateMultipleArguments("-","+","1","/","0","+","1"));
    }
}

