package ua.ithillel.homework13;

public class BurgerMain {
    public static void main(String[] args) {

        Burger classicBurger = new Burger("bun", "meat", "cheese", "greens", "mayonnaise");
        Burger dietaryBurger = new Burger("bun", "meat", "cheese", "greens");
        Burger doubleBurger = new Burger("bun", 2, "meat", "cheese", "greens", "mayonnaise");

        System.out.println(classicBurger);
        System.out.println(dietaryBurger);
        System.out.println(doubleBurger);
    }

}
