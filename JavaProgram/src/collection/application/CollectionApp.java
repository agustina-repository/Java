package collection.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class CollectionApp {
    public static void main(String[] args) {
        String[] strings = new String[2];
        strings[0] = "String1";
        strings[1] = "String2";
        Collection<String> collection = new ArrayList<>();

        //add
        collection.add("Lanang");
        collection.add("Nandur");
        collection.add("Islam");

        collection.addAll(List.of("Dan", "Agustina"));
        collection.addAll(Arrays.asList(strings));

        System.out.println("ADDING");
        for(var i : collection){
            System.out.println(i);
        }

        //remove
        collection.remove("Dan");
        collection.removeAll(List.of("String2","String1"));

        System.out.println("REMOVE");
        for(var i : collection){
            System.out.println(i);
        }

        //equal
        System.out.println(collection.contains("Nandur"));
        System.out.println(collection.containsAll(List.of("Lanang", "Nandur", "Islam")));
        System.out.println(collection.containsAll(List.of("Lanang", "Nandur", "islam")));

        Predicate<String> predicate = s -> {
            if(collection.contains("Islam")){
                return true;
            }
            return false;
        };
        //remove if condition if have any contain
        System.out.println("value: " + collection.removeIf(predicate));

        //isempty
        System.out.println(collection.size() + " | " + collection.isEmpty());
        collection.clear();
        System.out.println(collection.size() + " | " + collection.isEmpty());


    }
}
