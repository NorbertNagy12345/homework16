package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonService {
    private List<Person> persons;

    public PersonService() {
        this.persons = Arrays.asList(
                Person.builder()
                        .lastName("Nichita")
                        .firstName("Mihai")
                        .age(22)
                        .city("Brasov")
                        .build(),
                Person.builder()
                        .lastName("Popescu")
                        .firstName("Ana")
                        .age(44)
                        .city("Bucurest")
                        .build(),
                Person.builder()
                        .lastName("Marintas")
                        .firstName("Ioana")
                        .age(25)
                        .city("Zalau")
                        .build(),
                Person.builder()
                        .lastName("John")
                        .firstName("Doe")
                        .age(25)
                        .city("Oradea")
                        .build(),
                Person.builder()
                        .lastName("Alice")
                        .firstName("Smith")
                        .age(30)
                        .city("CLuj")
                        .build(),
                Person.builder()
                        .lastName("Bob")
                        .firstName("Johnson")
                        .age(22)
                        .city("Oradea")
                        .build(),
                Person.builder()
                        .lastName("Anna")
                        .firstName("Adams")
                        .age(40)
                        .city("Cluj")
                        .build(),
                Person.builder()
                        .lastName("Stefan")
                        .firstName("Baker")
                        .age(35)
                        .city("Oradea")
                        .build()
        );
    }

    public List<String> allPersonsName() {
        return persons.stream()
                .map(person -> person.firstName + " " + person.lastName)
                .collect(Collectors.toList());
    }

    ;

    public List<Person> listMajorPersons() {
        return persons.stream()
                .filter(person -> person.age >= 18)
                .collect(Collectors.toList());
    }

    public List<Person> listPersonsFromCity(String city) {
        return persons.stream()
                .filter(person -> person.city.equals(city))
                .collect(Collectors.toList());
    }

    public List<Person> listPersonsFromCities(String... cities) {
        return persons.stream()
                .filter(person -> List.of(cities).contains(person.city))
                .collect(Collectors.toList());
    }

    public List<String> listCapitalizedFirstNames() {
        return persons.stream()
                .map(person -> person.firstName.toUpperCase())
                .collect(Collectors.toList());
    }

    public List<String> listPersonNamesWithInitials() {
        return persons.stream()
                .map(person -> person.firstName + " " + person.lastName.charAt(0) + ".")
                .collect(Collectors.toList());
    }

    public List<Person> listPersonsByAgeRange(int minAge, int maxAge) {
        return persons.stream()
                .filter(person -> person.age > minAge && person.age < maxAge)
                .collect(Collectors.toList());
    }

    public List<Person> listPersonsByFirstNameStartingWith(char startsWith) {
        return persons.stream()
                .filter(person -> person.firstName.charAt(0) == startsWith)
                .collect(Collectors.toList());
    }

    public List<String> listUniqueFirstNames() {
        return persons.stream()
                .map(person -> person.firstName)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Person> sortPersonsByFirstName() {
        return persons.stream()
                .sorted(Comparator.comparing(person -> person.firstName))
                .collect(Collectors.toList());
    }

    public List<Person> sortPersonsByLastName() {
        return persons.stream()
                .sorted(Comparator.comparing(person -> person.lastName))
                .collect(Collectors.toList());
    }

    public List<Person> sortPersonsByFirstNameLastNameAge() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getFirstName)
                        .thenComparing(Person::getLastName)
                        .thenComparingInt(Person::getAge))
                .collect(Collectors.toList());
    }

}
