package ua.ithillel.homework10;

import static ua.ithillel.homework10.BubbleSortArray.bubbleSortArray;


public class Lottery {
    public static void main(String[] args) {

        int sizeArray = 7;
        int numberOfCoincidences = 0;

        RandomArray numberDeterminedCompany = new RandomArray();
        int[] arrayDeterminedCompany = numberDeterminedCompany.getRandomArray(sizeArray, 0, 9); //створюємо масив заданого розміру і заповнюємо його

        RandomArray numberDeterminedMan = new RandomArray();
        int[] arrayDeterminedMan = numberDeterminedMan.getRandomArray(sizeArray, 0, 9);


        bubbleSortArray(arrayDeterminedCompany); //сортування масивів (метод бульбашки)
        bubbleSortArray(arrayDeterminedMan);


        String listOfCompanyNumbers = String.valueOf(arrayDeterminedCompany[0]); //задаємо перше значення виводу циклу масиву, щоб не було null
        String listOfManNumbers = String.valueOf(arrayDeterminedMan[0]);

        for (int i = 0; i < sizeArray; i++) {
            if (i > 0) {
                listOfCompanyNumbers = listOfCompanyNumbers + ", " + arrayDeterminedCompany[i]; //складаємо масив в строчку
                listOfManNumbers = listOfManNumbers + ", " + arrayDeterminedMan[i];
            }
            if (arrayDeterminedCompany[i] == arrayDeterminedMan[i]) {
                numberOfCoincidences++; //рахуємо кількість співпадінь
            }
        }
        System.out.println(listOfCompanyNumbers);
        System.out.println(listOfManNumbers);
        System.out.println();
        System.out.println("Кількість співпадінь: " + numberOfCoincidences);
    }
}
