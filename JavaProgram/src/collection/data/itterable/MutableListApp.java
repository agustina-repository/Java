package collection.data.itterable;

import collection.data.Person;

import java.util.List;

/*
Pada dasarnya List memiliki sifat mutable yang artinya dapat dirubah.
Kita dapat membuat list supaya tidak dapat dirubah dengan menjadikannya
immuttable
 */
public class MutableListApp {
    public static void main(String[] args) {

        Person person = new Person("Lanang");
        person.addHobbies("Main");
        person.addHobbies("Game");

        doSomething(person.getHobbies());
//        for (var hobby : person.getHobbies()){
//            System.out.println(hobby);
//        }
        print(person);

        //Immutable
        Person person2 = new Person("Lanang");
        person2.addHobbies("Main2");
        person2.addHobbies("Game2");

        doSomething(person2.getHobbiesImmutable2());
        print(person2);

        Person person1 = new Person("Lanang");
        person1.addHobbies("Main2");
        person1.addHobbies("Game2");

        doSomething(person1.getHobbiesImmutable());
        print(person1);

    }

    public static void doSomething(List<String> param){
        param.add("Adding");
    }

    public static void print(Person person){
        for (var hobby : person.getHobbies()){
            System.out.println(hobby);
        }
    }
}
