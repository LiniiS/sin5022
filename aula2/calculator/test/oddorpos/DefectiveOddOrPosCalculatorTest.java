package calculator.test.oddorpos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import calculator.OddOrPosCalculator;

public class DefectiveOddOrPosCalculatorTest {

    @Test
    void testNullArrayShouldThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> {
            OddOrPosCalculator.defectiveOddOrPos(null);
        });
    }

    @Test
    void testEmptyArrayReturnsZero() {
        int[] input = {};
        int result = OddOrPosCalculator.defectiveOddOrPos(input);
        assertEquals(0, result);
    }

    @Test
    void testOnlyPositiveNumbers() {
        int[] input = {1, 2, 3, 4};
        int result = OddOrPosCalculator.defectiveOddOrPos(input);
        assertEquals(4, result, "Todos são positivos, deve retornar 4.");
    }

    @Test
    void testOnlyNegativeOddNumbers() {
        int[] input = {-1, -3, -5}; // todos ímpares negativos
        int result = OddOrPosCalculator.defectiveOddOrPos(input);
        assertEquals(3, result, "Todos são ímpares, deve retornar 3.");
    }

    @Test
    void testOnlyNegativeEvenNumbers() {
        int[] input = {-2, -4, -6};
        int result = OddOrPosCalculator.defectiveOddOrPos(input);
        assertEquals(0, result, "Nenhum número ímpar ou positivo.");
    }

    @Test
    void testMixedPositiveNegativeOddEven() {
        int[] input = {-3, -2, 0, 1, 4}; // -3 (ímpar), -2 (ignorado), 0 (ignorado), 1 e 4 (positivos)
        int result = OddOrPosCalculator.defectiveOddOrPos(input);
        assertEquals(3, result, "Deve contar -3, 1 e 4.");
    }

    @Test
    void testIncludesZeroOnly() {
        int[] input = {0};
        int result = OddOrPosCalculator.defectiveOddOrPos(input);
        assertEquals(0, result, "Zero não deve ser contado.");
    }

    @Test
    void testDefectRevealingCase() {
        int[] input = {-3, 1}; // -3 deveria contar como ímpar, mas com o defeito não será contado
        int result = OddOrPosCalculator.defectiveOddOrPos(input);
        assertEquals(2, result, "Comportamento correto: contar -3 e 1");
    }

}
