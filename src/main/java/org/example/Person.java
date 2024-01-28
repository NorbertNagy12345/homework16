package org.example;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Person {
    String firstName;
    String lastName;
    int age;
    String city;

    public Person(String firstName, String lastName, int age, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }
}
