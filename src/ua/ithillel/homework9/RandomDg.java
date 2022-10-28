package ua.ithillel.homework9;

public class RandomDg {
    public int getRandomDg(int minNumeric, int maxNumeric) {

        int range = maxNumeric - minNumeric + 1;
        return (int) ((Math.random() * range) + minNumeric);
    }
}
