package session_6;

import Gender.Gender;

import java.math.BigDecimal;
import java.time.Year;

public class Student {
    private String firstName;
    private String lastname;
    private Year age;
    private BigDecimal money;
    private Gender gender;

    public Student(String firstName, String lastname, Year age, BigDecimal money,Gender gender) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
        this.money = money;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Year getAge() {
        return age;
    }

    public void setAge(Year age) {
        this.age = age;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", gender=" + gender +
                '}';
    }
}
