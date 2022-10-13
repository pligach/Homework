package ua.ithillel.homework5;

public class Battle {
    public static void main(String[] args) {

        double battle, powerArmyLi, powerArmyMin, armySize;

        armySize = 860;

        powerArmyLi = (13 + 24 + 46) * armySize;
        powerArmyMin = (9 + 35 + 12) * armySize * 1.5;

        battle = powerArmyLi - powerArmyMin;

        System.out.println("Мій імператоре, Ви збираєтеся на війну... \n" +
                "військо динасції Мінь набагато чисельніше за наше. \n" +
                "Але наші воїни сильніші та досвідчені за їхніх. \n" +
                "Імператоре я підготував для Вас коротку доповідь з можливом результатом майбутнього бою, ось погляньте");
        System.out.println();

        if (battle > 0) {
            System.out.println("Ми виграємо битву!\n" +
                    "Наша сила армії " + powerArmyLi + " більша за силу армії Мінь " + powerArmyMin);
        }
        System.out.println("Ми програємо битву...\n" +
                "Наша сила армії " + powerArmyLi + " менша за силу армії Мінь " + powerArmyMin);
    }
}



