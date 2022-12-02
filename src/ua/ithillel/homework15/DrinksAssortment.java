package ua.ithillel.homework15;

public enum DrinksAssortment {
    COFFEE  ("Кава"),
    TEA ("Чай"),
    LEMONADE ("Лимонад"),
    MOJITO ("Мохіто"),
    MINERAL_WATER ("Мінеральна вода"),
    COCA_COLA ("Кока-Кола");

    private final String nameOfTheDrink;

    DrinksAssortment(String nameOfTheDrink) {
        this.nameOfTheDrink = nameOfTheDrink;
    }

    public String getNameOfTheDrink() {
        return nameOfTheDrink;
    }
}