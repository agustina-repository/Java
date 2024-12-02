package generic.application;

import generic.comparable.Person;

import java.util.Arrays;

public class ComparableApp {

    public static void main(String[] args) {

        Person[] people = {
                new Person("Eko", "Jakarta"),
                new Person("Ari", "Jakarta"),
                new Person("Zany", "Jakarta")
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
