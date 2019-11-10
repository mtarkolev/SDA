package oop2;

/**
 * Person class means all people in different fields.
 *
 * @version
 * @author mladen
 */

public class Person {
    /**
     * First name of person
     * it should be private because of encapsulation rule in OOP.
     */
    private String firstName;
    private String lastName;
    /**
     * Last name of person
     * * it should be private because of encapsulation rule in OOP.
     */
    private int age;

    /**
     * Person constructor.
     * @param firstName First Name
     * @param lastName Last Name
     * @param age Age
     */

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, String age, String skills) {

    }

    /**
     * Age of person
     * * it should be private because of encapsulation rule in OOP
     *
     * @return
     */

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
