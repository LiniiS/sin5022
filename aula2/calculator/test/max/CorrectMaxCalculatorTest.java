package calculator.test.max;

import calculator.MaxCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CorrectMaxCalculatorTest {

    @Test
    void testSingleElementArray() {
        int[] input = {37};
        int result = MaxCalculator.correctMax(input);
        assertEquals(37, result, "O maior valor deveria ser o único valor do array.");
    }

    @Test
    void testOrderedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int result = MaxCalculator.correctMax(input);
        assertEquals(5, result, "O maior valor deveria ser o último elemento.");
    }

    @Test
    void testUnorderedArray() {
        int[] input = {4, 10, 2, 8, 1};
        int result = MaxCalculator.correctMax(input);
        assertEquals(10, result, "O maior valor deveria ser o segundo elemento.");
    }

    @Test
    void testNegativeValues() {
        int[] input = {-10, -5, -3, -1};
        int result = MaxCalculator.correctMax(input);
        assertEquals(-1, result, "O maior valor deveria ser o menos negativo.");
    }

    @Test
    void testMaxAtFirstPosition() {
        int[] input = {100, 20, 30, 40};
        int result = MaxCalculator.correctMax(input);
        assertEquals(100, result, "O maior valor deveria ser o primeiro elemento.");
    }

    @Test
    void testAllEqualValues() {
        int[] input = {7, 7, 7, 7};
        int result = MaxCalculator.correctMax(input);
        assertEquals(7, result, "Todos os elementos são iguais, então o maior deve ser 7.");
    }

    @Test
    void testEmptyArrayShouldThrowException() {
        int[] input = {};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> MaxCalculator.correctMax(input),
                "Array vazio deve lançar exceção.");
    }
}
