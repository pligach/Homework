package ua.ithillel.homework15;

import java.util.Scanner;

public class MenuOfDrinks {


    static void md() {
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        choice = choice.toUpperCase();
        DrinksAssortment drinksAssortment = DrinksAssortment.valueOf(choice);

        System.out.println("Введеть кількість чашок");
        int numberOfCups = sc.nextInt();


        switch (drinksAssortment) {
            case COFFEE:
                MakeDrink.makeDrinks(DrinksAssortment.COFFEE.getNameOfTheDrink());
                TotalSumOfOrder.sumCupCoffee(numberOfCups);
                break;
            case TEA:
                MakeDrink.makeDrinks(DrinksAssortment.TEA.getNameOfTheDrink());
                TotalSumOfOrder.sumCupTea(numberOfCups);
                break;
            case LEMONADE:
                MakeDrink.makeDrinks(DrinksAssortment.LEMONADE.getNameOfTheDrink());
                TotalSumOfOrder.sumCupLemonade(numberOfCups);
                break;
            case MOJITO:
                MakeDrink.makeDrinks(DrinksAssortment.MOJITO.getNameOfTheDrink());
                TotalSumOfOrder.sumCupMojito(numberOfCups);
                break;
            case MINERAL_WATER:
                MakeDrink.makeDrinks(DrinksAssortment.MINERAL_WATER.getNameOfTheDrink());
                TotalSumOfOrder.sumCupMineralWater(numberOfCups);
                break;
            case COCA_COLA:
                MakeDrink.makeDrinks(DrinksAssortment.COCA_COLA.getNameOfTheDrink());
                TotalSumOfOrder.sumCupCocaCola(numberOfCups);
                break;
            default:
                break;
        }
    }

    static boolean questionToContinue() {
        System.out.println();
        System.out.println("Ви бажаєте за мовити ще щось? (Да - 1 / Ні - 0)");
        System.out.println("Зробіть вибір");
        Scanner sc = new Scanner(System.in);
        int question = sc.nextInt();

        return question != 0;
    }

}
