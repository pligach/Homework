package ua.ithillel.homework7;

public class SpaceShuttle {
    public static void main(String[] args) {

        int m = 0; //лічильник кількості шатлів
        int k = -1; //змінна для виводу номеру шатла

        for (int i = 0; i < 10; i++) {
            for (int d = 0; d < 10; d++) {
                for (int g = 0; g < 10; g++) {
                    k++;
                    if (m == 100)
                        break;
                    if (!(i == 4 || i == 9 || d == 4 || d == 9 || g == 4 || g == 9 || (i == 0 && d == 0 && g == 0))) {
                        m++;
                        System.out.println(m + ". Космічний шатл  №: " + k);
                    }
                }
            }
        }

        System.out.println();
        System.out.println("II Варіант");
        System.out.println();

        m = 0;

        for (int i = 0; i < 10; i++) {
            for (int d = 0; d < 10; d++) {
                for (int g = 0; g < 10; g++) {
                    if (m == 100)
                        break;
                    if (!(i == 4 || i == 9 || d == 4 || d == 9 || g == 4 || g == 9 || (i == 0 && d == 0 && g == 0))) {
                        m++;
                        System.out.println(m + ". Космічний шатл  №: " + i + "" + d + "" + g);
                    }
                }
            }
        }
    }
}

