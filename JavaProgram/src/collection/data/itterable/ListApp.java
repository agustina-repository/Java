package collection.data.itterable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/*
List merupakan turunan dari collection, dimana apa yang ada
pada interface collection (methode) maka akan ada juga di methode list ini.
List dibagi menjadi 2 yaitu Array List dan LinkedList.
Kedua list tersebut memiliki methode yang sama.
Kapan kita memutuskan untuk menggunakan List atau linkedList, itu tergantung kebutuhan
jika kita hanya ingin melakukan menambah data dan iterasi data maka gunakan linkedList.
Namun jika membutuhkan untuk set data, add data dll maka gunakan list
 */
public class ListApp {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
//        List<String> stringList2 = new LinkedList<>();

        //List
        //add
        stringList.add("Lanang");
        stringList.add("Nanduy");
        stringList.add("Ilsam");
        stringList.add("Sayang");
        stringList.add("Lanang");
        stringList.add("Ilsam");
        stringList.add("Sayang");
        stringList.add("Ilsam");
        stringList.add("Sayang");

        stringList.add(4, "Empat");

        System.out.println(stringList.get(1));

        //update
        stringList.set(1, "Nandur");

        //Searching for elements
        var o = stringList.indexOf("Ilsam"); //2
        var o1 = stringList.lastIndexOf("Ilsam"); //8

        System.out.println("indexOf: " + o + " | " + o1);

        print(stringList,"1");//Lanang, Nandur, Ilsam, Sayang, Empat, Lanang, Ilsam, Sayang, Ilsam, Sayang

        //remove
        stringList.remove(4); //Lanang, Nandur, Ilsam, Sayang, Lanang, Ilsam, Sayang, Ilsam, Sayang
        stringList.remove("Ilsam"); //Lanang, Nandur, Sayang, Lanang, Ilsam, Sayang, Ilsam, Sayang
        stringList.removeIf(s -> s.equals("Sayang")); //Lanang, Nandur, Lanang, Ilsam, Ilsam

        print(stringList, "2"); //

        Collection<String> collection = new ArrayList<>();
        for(var value : stringList){
            if(value.equals("Ilsam")){
                collection.add(value);
            }
        }
        stringList.removeAll(collection); //Lanang, Nandur, Lanang

        print(stringList, "3");

        //Accessing Elements
        System.out.println("Get: " + stringList.get(1));

        //Checking if an element is present in the List
        System.out.println(stringList.contains("Lanang"));
        System.out.println(stringList.containsAll(new ArrayList<>(List.of("Lanang" , "Nanduy"))));

    }

    public static void print(List<String> stringList, String spc){
        String s = "========================================";
        System.out.println(s.replaceAll("=", spc));
        for (var value1 : stringList){
            System.out.println(value1);
        }

    }


}
