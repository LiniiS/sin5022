    package calculator.test.lastzero;

    import org.junit.jupiter.api.Test;
    import static org.junit.jupiter.api.Assertions.*;
    import calculator.LastZeroCalculator;

class DefectiveLastZeroCalculatorTest {

    @Test
    void testNullArrayThrowsException() {
        assertThrows(NullPointerException.class, () -> {
            LastZeroCalculator.defectiveLastZero(null);
        }, "Deveria lançar NullPointerException para array nulo.");
    }

    @Test
    void testEmptyArrayReturnsMinusOne() {
        int[] input = {};
        int result = LastZeroCalculator.defectiveLastZero(input);
        assertEquals(-1, result, "Array vazio deve retornar -1.");
    }

    @Test
    void testArrayWithoutZeroReturnsMinusOne() {
        int[] input = {1, 2, 3, 4};
        int result = LastZeroCalculator.defectiveLastZero(input);
        assertEquals(-1, result, "Array sem zeros deve retornar -1.");
    }

    @Test
    void testSingleZeroReturnsItsIndex() {
        int[] input = {5, 0, 7};
        int result = LastZeroCalculator.defectiveLastZero(input);
        assertEquals(1, result, "Deve retornar o índice do único zero.");
    }

    @Test
    void testMultipleZerosReturnsLastIndex() {
        int[] input = {0, 1, 0, 2, 0};
        int result = LastZeroCalculator.defectiveLastZero(input);
        assertEquals(4, result, "Deve retornar o índice do último zero.");
    }

    @Test
    void testZeroAtFirstIndexOnly() {
        int[] input = {0, 5, 9, 10};
        int result = LastZeroCalculator.defectiveLastZero(input);
        assertEquals(0, result, "Deve retornar 0 pois o único zero está na posição 0.");
    }

    @Test
    void testZeroAtLastIndexOnly() {
        int[] input = {4, 3, 2, 0};
        int result = LastZeroCalculator.defectiveLastZero(input);
        assertEquals(3, result, "Deve retornar 3 pois o zero está na última posição.");
    }

    @Test
    void testAllZeros() {
        int[] input = {0, 0, 0, 0};
        int result = LastZeroCalculator.defectiveLastZero(input);
        assertEquals(3, result, "Se todos os elementos são zero, deve retornar o último índice.");
    }

    @Test
    void testZeroWithNegatives() {
        int[] input = {-1, -2, 0, -3};
        int result = LastZeroCalculator.defectiveLastZero(input);
        assertEquals(2, result, "Deve retornar o índice do zero, mesmo com negativos.");
    }
}

