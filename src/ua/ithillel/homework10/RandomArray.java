package ua.ithillel.homework10;

import ua.ithillel.homework9.RandomDg;

public class RandomArray {
    public int[] getRandomArray(int sizeArray, int minNumeric, int maxNumeric) {
        RandomDg randomDg = new RandomDg();
        int[] randomArray = new int[sizeArray];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomDg.getRandomDg(minNumeric, maxNumeric);
        }
        return randomArray;
    }
}