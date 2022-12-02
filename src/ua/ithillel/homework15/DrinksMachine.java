package ua.ithillel.homework15;

import java.util.Arrays;

public class DrinksMachine {

    public static void main(String[] args) {

        do {
            System.out.println("Виберіть напій:");
            System.out.println(Arrays.toString(DrinksAssortment.values()));

            MenuOfDrinks.md();

        } while (MenuOfDrinks.questionToContinue());

        System.out.println();

        TotalSumOfOrder.printOrder();
        System.out.print("Разом: " + TotalSumOfOrder.getTotalSumOFOrderBigDecimal() + " грн.");
    }
}