package ua.ithillel.homework14;

public class FitnessTracker {
    public static void main(String[] args) {

        UsersAccount fitnessTrackerUser1 = new UsersAccount("Niko", "Ivanov", 1, 10, 1979,
                "niko@gmail.com", "556497896",  "68.5", "125/85", 12500);

        UsersAccount fitnessTrackerUser2 = new UsersAccount("Kate", "Winston", 15, 6, 1985,
                "kate@gmail.com", "776497888",  "58.0", "120/75", 15571);

        UsersAccount fitnessTrackerUser3 = new UsersAccount("Angelina", "Jonson", 22, 4, 1992,
                "angelina@gmail.com", "777488896",  "56.2", "120/80", 11558);

        System.out.println(fitnessTrackerUser1.printAccountInfo());
        System.out.println(fitnessTrackerUser2.printAccountInfo());


        fitnessTrackerUser2.setUsersBloodPressure("130/85");
        fitnessTrackerUser2.setUsersLastName("Stone");
        fitnessTrackerUser2.setUsersWeight("57.5");

        System.out.println(fitnessTrackerUser2.printAccountInfo());
        System.out.println(fitnessTrackerUser3.printAccountInfo());


        fitnessTrackerUser3.setUsersBloodPressure("132/82");
        fitnessTrackerUser3.setUsersLastName("Taylor");
        fitnessTrackerUser3.setUsersWeight("54.1");

        System.out.println(fitnessTrackerUser3.printAccountInfo());
    }


}
