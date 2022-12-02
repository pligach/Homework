package ua.ithillel.homework15;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import static ua.ithillel.homework15.Drinks.*;

public class TotalSumOfOrder {
    static int sumCupCoffee = 0;
    static int sumCupTea = 0;
    static int sumCupLemonade = 0;
    static int sumCupMojito = 0;
    static int sumCupMineralWater = 0;
    static int sumCupCocaCola = 0;


    public static void sumCupCoffee(int cup) {
        sumCupCoffee += cup;
    }

    public static void sumCupTea(int cup) {
        sumCupTea += cup;
    }

    public static void sumCupLemonade(int cup) {
        sumCupLemonade += cup;
    }

    public static void sumCupMojito(int cup) {
        sumCupMojito += cup;
    }

    public static void sumCupMineralWater(int cup) {
        sumCupMineralWater += cup;
    }

    public static void sumCupCocaCola(int cup) {
        sumCupCocaCola += cup;
    }


    public static double getTotalSumOFOrderDouble() {
        return sumCupCoffee * PRICE_COFFEE
                + sumCupTea * PRICE_TEA
                + sumCupLemonade * PRICE_LEMONADE
                + sumCupMojito * PRICE_MOJITO
                + sumCupMineralWater * MINERAL_WATER
                + sumCupCocaCola * COCA_COLA;
    }

   public static String getTotalSumOFOrderBigDecimal() {
       BigDecimal totalOrder = BigDecimal.valueOf(getTotalSumOFOrderDouble());
       DecimalFormat formatSum = new DecimalFormat("#0.00");
        return formatSum.format(totalOrder);
    }

    public static void printOrder() {
        System.out.println("Ваше замовлення:");
        System.out.println();
        if (sumCupCoffee > 0) {
            System.out.println(sumCupCoffee + " чашок " + DrinksAssortment.COFFEE.getNameOfTheDrink());
        }
        if (sumCupTea > 0) {
            System.out.println(sumCupTea + " чашок " + DrinksAssortment.TEA.getNameOfTheDrink());
        }
        if (sumCupLemonade > 0) {
            System.out.println(sumCupLemonade + " чашок " + DrinksAssortment.LEMONADE.getNameOfTheDrink());
        }
        if (sumCupMojito > 0) {
            System.out.println(sumCupMojito + " чашок " + DrinksAssortment.MOJITO.getNameOfTheDrink());
        }
        if (sumCupMineralWater > 0) {
            System.out.println(sumCupMineralWater + " чашок " + DrinksAssortment.MINERAL_WATER.getNameOfTheDrink());
        }
        if (sumCupCocaCola > 0) {
            System.out.println(sumCupCocaCola + " чашок " + DrinksAssortment.COCA_COLA.getNameOfTheDrink());
        }
    }
}
