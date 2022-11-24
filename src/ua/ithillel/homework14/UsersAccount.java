package ua.ithillel.homework14;

public class UsersAccount {
    final int THIS_YEAR = 2022;
    private final String userName;
    private final int usersDayOfBirth;
    private final int usersMonthOfBirth;
    private final int usersYearOfBirth;
    private final String userEmail;
    private final String usersPhone;
    private String usersLastName;
    private String usersWeight;
    private String usersBloodPressure;
    private int numberOfStepsPerDay;


    public UsersAccount(String userName, String usersLastName, int usersDayOfBirth, int usersMonthOfBirth,
                        int usersYearOfBirth, String userEmail,
                        String usersPhone, String usersWeight,
                        String usersBloodPressure, int numberOfStepsPerDay) {

        this.userName = userName;
        this.usersDayOfBirth = usersDayOfBirth;
        this.usersMonthOfBirth = usersMonthOfBirth;
        this.usersYearOfBirth = usersYearOfBirth;
        this.userEmail = userEmail;
        this.usersPhone = usersPhone;
        this.usersLastName = usersLastName;
        this.usersWeight = usersWeight;
        this.usersBloodPressure = usersBloodPressure;
        this.numberOfStepsPerDay = numberOfStepsPerDay;
    }

 /*   public String getUserName() {
        return userName;public int getAge ()
    }

    public int getUsersDayOfBirth() {
        return usersDayOfBirth;
    }

    public int getUsersMonthOfBirth() {
        return usersMonthOfBirth;
    }

    public int getUsersYearOfBirth() {
        return usersYearOfBirth;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUsersPhone() {
        return usersPhone;
    }*/

    public String getUsersLastName() {
        return usersLastName;
    }

    public void setUsersLastName(String usersLastName) {
        this.usersLastName = usersLastName;
    }

    public String getUsersWeight() {
        return usersWeight;
    }

    public void setUsersWeight(String usersWeight) {
        this.usersWeight = usersWeight;
    }

    public String getUsersBloodPressure() {
        return usersBloodPressure;
    }

    public void setUsersBloodPressure(String usersBloodPressure) {
        this.usersBloodPressure = usersBloodPressure;
    }

    public int getNumberOfStepsPerDay() {
        return numberOfStepsPerDay;
    }

    public void setNumberOfStepsPerDay(int numberOfStepsPerDay) {
        this.numberOfStepsPerDay = numberOfStepsPerDay;
    }

    public int getAge() {
        return THIS_YEAR - this.usersYearOfBirth;
    }

    public String printAccountInfo() {
        return "UsersAccount{" +
                "Name='" + this.userName + '\'' +
                ", LastName='" + this.usersLastName + '\'' +
                ", Day =" + this.usersDayOfBirth +
                ", Month =" + this.usersMonthOfBirth +
                ", Year Of Birth=" + this.usersYearOfBirth +
                ", Email='" + this.userEmail + '\'' +
                ", Phone='" + this.usersPhone + '\'' +
                ", Weight='" + this.usersWeight + '\'' +
                ", Blood Pressure='" + this.usersBloodPressure + '\'' +
                ", Steps Per Day=" + this.numberOfStepsPerDay +
                ", Age=" + getAge() +
                '}';
    }


}
