package calculator;

/**
 * Classe que representa a calculadora do índice
 * da última ocorrência do elemento ZERO em um array
 * <ul>
 *     <li>Entrada de dados: array de números positivos, negativos, vazio</li>
 *     <li>Saída: índice com a posição da última ocorrência de Zero no array</li>
 * </ul>
 *
 *@author LiniiS
 */
public class LastZeroCalculator {

    public static int defectiveLastZero(int[] x) {
        // Funcao: se x==null lanca NullPointerException
        // senao returna o indice do ultimo 0 em x
        // Returna-1 se 0 nao ocorre em x

        for (int i = 0; i < x.length; i++) {
            if (x[i] == 0) {
                return i; // aqui o retorno é sempre o indice do primeiro zero e não do último
            }
        }
        return-1;
    }

    public static int correctLastZero(int[] x) {
        if(x == null){
            throw new NullPointerException("Não há elementos no array");
        }

        int lastIndex = -1;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 0) {
                lastIndex = i;
                System.out.println("Zero encontrado no índice: " + lastIndex);
            }

        }
        System.out.println("Último índice: " + lastIndex);
        return lastIndex;
    }
}
