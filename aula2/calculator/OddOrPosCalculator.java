package calculator;

/**
 * Classe que representa a calculadora de números
 * ímpares ou positivos
 * <ul>
 *     <li>Entrada de dados: array de números positivos, negativos, vazio</li>
 *     <li>Saída: contagem do total de números ímpares ou positivos</li>
 * </ul>
 *
 * @author LiniiS
 */
public class OddOrPosCalculator {

    public static int defectiveOddOrPos(int[] x) {
        // Funcao: se x==null lanca NullPointerException
        // senao returna o numero de elementos em x que
        // sao impar ou positivo (ou ambos)
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i]%2 == 1 || x[i] > 0) { // a divisão não considera quando são negativos
                System.out.println("Elemento encontrado:" + x[i]);
                count++;
            }
        }
        System.out.println("Total de ímpares ou positivos: " + count);
        return count;
    }

    public static int correctOddOrPos(int[] x) {

        if(x == null){
            throw new NullPointerException("Array nulo");
        }

        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (Math.abs(x[i])%2 == 1 || x[i] > 0) { //usar Math.abs ou verificar que a divisão é !=0
                System.out.println("Elemento encontrado: " + x[i]);
                count++;
            }
        }
        System.out.println("Total de ímpares ou positivos: " + count);
        return count;
    }
}
