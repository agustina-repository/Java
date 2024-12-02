package generic.application;


import generic.comparable.Person;

import java.util.Arrays;
import java.util.Comparator;

/*
Mengurutkan data dengan tidak dapat merubah value class
 */
public class ComparatorApp {
    public static void main(String[] args) {


        Person[] people = {
                new Person("Eko", "Medan"),
                new Person("Ari", "Bandung"),
                new Person("Zany", "Jakarta")
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAddres().compareTo(o2.getAddres());
            }
        };

        Arrays.sort(people, comparator);
        System.out.println(Arrays.toString(people));
    }
}
