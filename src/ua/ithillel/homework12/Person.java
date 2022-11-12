package ua.ithillel.homework12;

public class Person {
    String firstName;
    String lastName;
    String city;
    String phone;

    public Person(String firstName, String lastName, String city, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phone = phone;
    }

    public String personInfo() {
        return "Позвонить гражданину " + firstName + " " + lastName +
                " из города " + city +
                " можно по номеру: " + phone;


        /*

    String firstName;
    String lastName;
    String city;
    String phone;

    public String personInfo(String firstName, String lastName, String city, String phone) {
        return (String) ("Позвонить гражданину " + firstName + " " + lastName +
                " из города " + city + " можно по номеру: " + phone);
    }

    */

    }
}