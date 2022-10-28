package ua.ithillel.homework9;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int manNumber, i = 4;

        RandomDg randomDg = new RandomDg();
        int computerNumber = randomDg.getRandomDg(0, 10);

        System.out.println(computerNumber); //Підказка для перевірки роботи програми.

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Введіть число від 0 до 10");
            manNumber = in.nextInt();

            if (manNumber == computerNumber) {
                System.out.println("Ви вгадали число. Вітаю!");
            }
            if (manNumber != computerNumber) {
                System.out.println("Нажаль ви не вгадали число. У вас залишилось " + i + " спроби");
                i--;

                if (i < 0) {
                    break;
                }
                System.out.println();
            }
        }
        while (manNumber != computerNumber);
    }
}
