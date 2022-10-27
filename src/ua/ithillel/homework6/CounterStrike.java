package ua.ithillel.homework6;

public class CounterStrike {
    public static void main(String[] args) {

        double result, resultPolice, resultTerrorist;
        String teamName;

        String teamNamePolice = "Police";
        int policePlayer1 = 5;
        int policePlayer2 = 8;
        int policePlayer3 = 3;
        int policePlayer4 = 7;
        int policePlayer5 = 3;

        String teamNameTerrorist = "Terrorist";
        int terroristPlayer1 = 5;
        int terroristPlayer2 = 1;
        int terroristPlayer3 = 10;
        int terroristPlayer4 = 2;
        int terroristPlayer5 = 2;

        resultPolice = (policePlayer1 + policePlayer2 + policePlayer3 + policePlayer4 + policePlayer5) / 5.0;
        resultTerrorist = (terroristPlayer1 + terroristPlayer2 + terroristPlayer3 + terroristPlayer4 + terroristPlayer5) / 5.0;

        if (resultPolice == resultTerrorist) {
            System.out.println("Ничья...");
        } else {
            if (resultPolice > resultTerrorist) {
                result = resultPolice;
                teamName = teamNamePolice;
            } else {
                result = resultTerrorist;
                teamName = teamNameTerrorist;
            }
            System.out.println("Победила команда " + teamName + " набравшая " + result + " очков");
        }
    }
}