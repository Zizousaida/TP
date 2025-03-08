package classes;

public class Person {
    public String name;
    public String surname;
    public String age;
    public String gender;

    public Person() {
        // Default constructor
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, String age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public int setName(String name) {
        this.name = name;
        return 1;
    }

    public int setSurname(String surname) {
        this.surname = surname;
        return 1;
    }

    public int setAge(String age) {
        this.age = age;
        return 1;
    }

    public int setGender(String gender) {
        this.gender = gender;
        return 1;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }
}
