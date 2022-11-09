package ua.ithillel.homework11;

import ua.ithillel.homework9.RandomDg;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {

        int firstSizeArray, secondSizeArray; //розміри М та N
        int minNumeric = 0; // числа, які рандомно заповнюють масив
        int maxNumeric = 20;

        RandomDg randomDg = new RandomDg();
        Scanner in = new Scanner(System.in);

        System.out.println("Задайте строну матриці M (число від 1 і більше):");
        firstSizeArray = in.nextInt();

        System.out.println("Задайте строну матриці N (число від 1 і більше):");
        secondSizeArray = in.nextInt();

        int[][] firstArray = new int[firstSizeArray][secondSizeArray];
        int[][] transposeMatrix = new int[secondSizeArray][firstSizeArray];

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                firstArray[i][j] = randomDg.getRandomDg(minNumeric, maxNumeric);
                transposeMatrix[j][i] = firstArray[i][j];
            }
        }
        System.out.println();

        for (int[] ints : firstArray) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println();

        for (int[] ints : transposeMatrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}