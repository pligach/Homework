package ua.ithillel.homework12;

public class PhoneBook {
    public static void main(String[] args) {

        Person person1 = new Person("Will", "Smith", "New York", "2936729462846");
        System.out.println(person1.personInfo());

        Person person2 = new Person ("Jackie", "Chan", "Shanghai", "12312412412");
        System.out.println(person2.personInfo());

        Person person3 = new Person ("Sherlock", "Holmes", "London", "37742123513");
        System.out.println(person3.personInfo());

/*
Другий варіант
        Person person1 = new Person();
        person1.firstName = "Will";
        person1.lastName = "Smith";
        person1.city = "New York";
        person1.phone = "2936729462846";

        System.out.println(person1.personInfo(person1.firstName, person1.lastName, person1.city, person1.phone));

        Person person2 = new Person();
        person2.firstName = "Jackie";
        person2.lastName = "Chan";
        person2.city = "Shanghai";
        person2.phone = "12312412412";

        System.out.println(person2.personInfo(person2.firstName, person2.lastName, person2.city, person2.phone));

        Person person3 = new Person();
        person2.firstName = "Sherlock";
        person2.lastName = "Holmes";
        person2.city = "London";
        person2.phone = "37742123513";

        System.out.println(person2.personInfo(person2.firstName, person2.lastName, person2.city, person2.phone));*/

    }
}
