package com.ps;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Person> people = new ArrayList<>();

        Person spongeBob = new Person(" ", "", 1);
        spongeBob.displayWithLabel("", "");

        people.add(new Person("SpongeBob", "SquarePants", 20));
        people.add(new Person("Patrick", "Star", 21));
        people.add(new Person("Sandy", "Cheeks", 22));
        people.add(new Person("Squidward", "Tentacles", 24));
        people.add(new Person("Mr.", "Krabs", 55));
        people.add(new Person("Plankton", "Sheldon", 35));
        people.add(new Person("Gary", "Snail", 5));
        people.add(new Person("Pearl", "Krabs", 16));
        people.add(new Person("Mrs.", "Puff", 45));
        people.add(new Person("Larry", "Lobster", 30));

        // Sort the list using Collection
        Collections.sort(people);

        for (Person person : people){
            System.out.println(person);
        }

    }
}