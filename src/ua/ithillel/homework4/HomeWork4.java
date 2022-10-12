package ua.ithillel.homework4;
import java.util.Scanner;
public class HomeWork4 {
    public static void main(String[] args) {

        int a, b, c, perimeter, volume;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть значення сторони а - паралелепіпеда");
        a = scan.nextInt();

        System.out.println("Введіть значення сторони b - паралелепіпеда");
        b = scan.nextInt();

        System.out.println("Введіть значення сторони c - паралелепіпеда");
        c = scan.nextInt();

        volume = a * b *c;
        perimeter = (a + b + c) *4;

        System.out.println("Об'єм параллелепіпеда = " + volume + " см куб.");
        System.out.println();
        System.out.println("Периметр параллелепіпеда = " + perimeter + " см");
    }
}