package org.example;



public class Main {
    public static void main(String[] args) {

        PersonService personService = new PersonService();

        System.out.println("List of all persons' names:");
        System.out.println(personService.allPersonsName());

        System.out.println("\nList of major persons:");
        System.out.println(personService.listMajorPersons());

        System.out.println("\nList of persons from Oradea:");
        System.out.println(personService.listPersonsFromCity("Oradea"));

        System.out.println("\nList of persons from Oradea or Cluj:");
        System.out.println(personService.listPersonsFromCities("Oradea", "Cluj"));

        System.out.println("\nList of capitalized first names:");
        System.out.println(personService.listCapitalizedFirstNames());

        System.out.println("\nList of person names with initials:");
        System.out.println(personService.listPersonNamesWithInitials());

        System.out.println("\nList of persons with age between 18 and 60:");
        System.out.println(personService.listPersonsByAgeRange(18, 60));

        System.out.println("\nList of persons with first name starting with 'A':");
        System.out.println(personService.listPersonsByFirstNameStartingWith('A'));

        System.out.println("\nList of unique first names:");
        System.out.println(personService.listUniqueFirstNames());

        System.out.println("\nSorted list of persons by first name:");
        System.out.println(personService.sortPersonsByFirstName());

        System.out.println("\nSorted list of persons by last name:");
        System.out.println(personService.sortPersonsByLastName());

        System.out.println("\nSorted list of persons by first name, last name, and age:");
        System.out.println(personService.sortPersonsByFirstNameLastNameAge());
    }
}
