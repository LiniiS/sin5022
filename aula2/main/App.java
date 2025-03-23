package main;
import calculator.*;

public class App {

    public static void main(String[] args) {
        int[] x = {9, 5, 0};
        int[] y = {0, 9, 5};
        int[] z = {};
        //int[] v = {0,0,0,0,0,0,0,0,0};
        //int[] v = {8,2,3,5,0,6,85,32,0,74};
        int[] v = {-3,6,5,-8,0,20,3};
//        int maxX = MaxCalculator.defectiveMax(x);
//        System.out.println(maxX);
//
//        int maxY = MaxCalculator.defectiveMax(y);
//        System.out.println(maxY);
//
//        int maxZ = MaxCalculator.defectiveMax(z);
//        System.out.println(maxZ);



        //LastZeroCalculator.correctLastZero(v);
        //OddOrPosCalculator.defectiveOddOrPos(v);
        OddOrPosCalculator.correctOddOrPos(v);
    }


}
