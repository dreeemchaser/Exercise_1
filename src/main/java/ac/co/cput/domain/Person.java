package ac.co.cput.domain;

import java.io.Serializable;

public class Person implements Comparable<Person> {


    private String firstName;
    private String lastName;
    private String gender;
    private int height;
    private float weight;

    public Person(String firstName, String lastName, String gender, int height, float weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person < " +
                "First Name: " + firstName + ' ' +
                "Last Name: " + lastName  + ' ' +
                "Gender: " + gender  + ' ' +
                "Height: " + height + ' ' +
                "Weight: " + weight + ' ' +
                " >" + " " ;
    }

    @Override
    public int compareTo(Person other) {
        String thisWeight = (String.valueOf(this.weight));
        String otherWeight = (String.valueOf(other.weight));
        return thisWeight.compareTo(otherWeight);
    }
}
