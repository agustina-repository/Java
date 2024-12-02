package collection.data.itterable;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
part of collection interface with unique value.
-Hashset and LinkedHashset par of Hashset.
HashSet : the order of input data is not taken into consideration.
LinkedHasset : antonym Hashset
*/
public class SetApp {
    public static void main(String[] args) {

//        Set<String> setCollection = new HashSet<>();
        Set<String> setCollection = new LinkedHashSet<>();
        Set<String> setCollection2 = new LinkedHashSet<>();
        Set<String> setCollection3 = new LinkedHashSet<>();

        setCollection.add("Lanang");
        setCollection.add("Nandur");
        setCollection.addAll(List.of("Islam", "dan", "Agustina"));

        setCollection2.addAll(List.of("Lanang", "Nandur", "Islam", "Keponakanku"));

        setCollection3.addAll(setCollection);
        setCollection3.addAll(setCollection2);

        print(setCollection);

        setCollection.remove("dan");
        setCollection.removeAll(List.of("Agustina", "Islam"));

        printSpace();
        print(setCollection);

        setCollection.addAll(List.of("Islam", "Anak", "Ganteng"));
        printSpace();print(setCollection);

        //implementation anonymusclass
//        setCollection.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String value) {
//                return value.equals("Anak");
//            }
//        });

        setCollection.removeIf(value -> value.equals("Anak"));      //implementation lambda

        printSpace();print(setCollection);
        System.out.println(setCollection.isEmpty());
        System.out.println(setCollection.size());
        printSpace();print(setCollection3);

        setCollection.retainAll(setCollection2); //
        printSpace();print(setCollection);printSpace();

        setCollection.forEach(s -> System.out.println(s));

        //ImmutableSet
       Set<String> strings = Collections.unmodifiableSet(setCollection);

       Set<String> immutableset = Set.of("dicobs");
       immutableset.add("hahahahha");


        printSpace();print(setCollection);

    }

    public static void print(Set<String> listParam){
        for(var valueCollection : listParam){
            System.out.println(valueCollection);
        }
    }
    public static void printSpace(){
        System.out.println("==============================================");
    }
}
