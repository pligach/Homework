package ua.ithillel.homework4;

public class HomeWork4 {
    public static void main(String[] args) {

        int a, b, c, perimeter, volume;

        a = 10;
        b = 20;
        c = 15;

        volume = a * b *c;
        perimeter = (a + b + c) *4;

        System.out.println("Об'єм параллелепіпеда = " + volume + " см куб.");
        System.out.println();
        System.out.println("Периметр параллелепіпеда = " + perimeter + " см");
    }
}