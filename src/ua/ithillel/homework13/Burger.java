package ua.ithillel.homework13;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    int doubleMeat;


    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;

    }

    public Burger(String bun, int doubleMeat, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.doubleMeat = doubleMeat;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
    }

    @Override
    public String toString() {
        if (this.mayonnaise == null) {
            return "Дієтичний Бургер: " + this.bun + ", " + this.meat + ", " + this.cheese + ", " + this.greens;
        } else if (this.doubleMeat == 2) {
            return "Подвійний Burger: " + this.bun + ", " + this.doubleMeat + " x " + this.meat + ", " + this.cheese + ", "
                    + this.greens + ", " + this.mayonnaise;
        }
        return "Класичний Бургер: " + this.bun + ", " + this.meat + ", " + this.cheese + ", " + this.greens + ", "
                + this.mayonnaise;
    }
}
