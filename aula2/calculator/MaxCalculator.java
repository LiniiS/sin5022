package calculator;

/**
 * Classe que representa a calculadora do máximo valor
 * em um array de números positivos e negativos
 * <ul>
 *     <li>Entrada de dados: array de números positivos, negativos, vazio</li>
 *     <li>Saída: maior valor dentre os elementos do array</li>
 * </ul>
 *
 * @author LiniiS
 *
 */
public class MaxCalculator {

    public static int defectiveMax(int[] v){

        int i=0;
        int max= i++; //incremento indevido

        while(i < v.length){
            if(v[i] > max)
                max=v[i];
            i++;
        }
        return max;
    }


    public static int correctMax(int[] v){
        int i = 0;
        int max = v[0];

        while(i < v.length){
            if(v[i] > max) max = v[i];
            i++;
        }
        return max;
    }
}
