package calculator.test.oddorpos;

import calculator.OddOrPosCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CorrectOddOrPosCalculatorTest {

    @Test
    void testNullArrayShouldThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> {
            OddOrPosCalculator.correctOddOrPos(null);
        });
    }

    @Test
    void testEmptyArrayReturnsZero() {
        int[] input = {};
        int result = OddOrPosCalculator.correctOddOrPos(input);
        assertEquals(0, result);
    }

    @Test
    void testOnlyPositiveNumbers() {
        int[] input = {1, 2, 3, 4, 5};
        int result = OddOrPosCalculator.correctOddOrPos(input);
        assertEquals(5, result, "Todos são positivos, devem ser contados.");
    }

    @Test
    void testOnlyNegativeOddNumbers() {
        int[] input = {-1, -3, -5};
        int result = OddOrPosCalculator.correctOddOrPos(input);
        assertEquals(3, result, "Todos são ímpares negativos, devem ser contados.");
    }

    @Test
    void testOnlyNegativeEvenNumbers() {
        int[] input = {-2, -4, -6};
        int result = OddOrPosCalculator.correctOddOrPos(input);
        assertEquals(0, result, "Nenhum é positivo ou ímpar, resultado deve ser 0.");
    }

    @Test
    void testOnlyZeros() {
        int[] input = {0, 0, 0};
        int result = OddOrPosCalculator.correctOddOrPos(input);
        assertEquals(0, result, "Zeros não são positivos nem ímpares.");
    }

    @Test
    void testMixedNumbers() {
        int[] input = {-3, 6, 5, -8, 0, 20, 3}; // esperado: -3, 6, 5, 20, 3 = 5 elementos
        int result = OddOrPosCalculator.correctOddOrPos(input);
        assertEquals(5, result, "Deve contar corretamente ímpares e positivos.");
    }

    @Test
    void testNegativesAndZero() {
        int[] input = {-2, -3, 0}; // só -3 é ímpar
        int result = OddOrPosCalculator.correctOddOrPos(input);
        assertEquals(1, result, "Somente -3 deve ser contado.");
    }

    @Test
    void testPositiveEvenNumbersOnly() {
        int[] input = {2, 4, 6};
        int result = OddOrPosCalculator.correctOddOrPos(input);
        assertEquals(3, result, "Todos são positivos, devem ser contados.");
    }

    @Test
    void testPositiveOddAndNegativeEven() {
        int[] input = {1, 3, -2, -4}; // 1 e 3 são positivos e ímpares
        int result = OddOrPosCalculator.correctOddOrPos(input);
        assertEquals(2, result);
    }
}

