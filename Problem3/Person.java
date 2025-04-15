package Problem3;

public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    // make new person
    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    // return
    public String toString() {
        return firstName + " " + lastName + ", " + home.toString();
    }
}
