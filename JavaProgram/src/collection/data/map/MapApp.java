package collection.data.map;

import java.util.*;

/*
Memiliki beberapa turunan
-HashMap : key unik yang tidak boleh duplikat. hanya di compare dengan hascode
-WeakHashMap : delete all key with weak key. gc
-IdentityHasMap : cek data with reference equality (==)
-LinkedHashMap : data yang disimpan akan sesuai dengan urutan

== Binary search untuk mencari nilai namun lebih thread save menghindari java out of memory
 */
public class MapApp {
    public static void main(String[] args) {

        immutableMap();
    }

    public static void hashMapMethode(){
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("first.name","Lanang");
        stringMap.putAll(Map.of("middle.name", "Nandur","last.name","Islam"));

        System.out.println(stringMap.get("first.name"));
    }

    public static void weakHashMap(){
        Map<Integer, Integer> integerMap = new WeakHashMap<>();

        for (int i = 1; i <= 1000000; i++){

            integerMap.put(i, i);
        }
        System.out.println(integerMap.size());
    }

    public static void identityHasMap(){
        Map<String, String> stringMap = new IdentityHashMap<>();
        stringMap.put("first.name","Lanang");
        stringMap.putAll(Map.of("middle.name", "Nandur","last.name","Islam"));

        Map<String, String> stringMap2 = new IdentityHashMap<>();
        stringMap.put("first.name","Lanang");
        stringMap.putAll(Map.of("middle.name", "Nandur","last.name","Islam"));

        System.out.println(stringMap.equals(stringMap2));
        System.out.println(stringMap == stringMap2);

    }

    public static void linkedHashMap(){
        System.out.println("Linked Hash Map");
        Map<String, String> stringMap = new LinkedHashMap<>();
        stringMap.put("first.name","Lanang");
        stringMap.putAll(Map.of("middle.name", "Nandur","last.name","Islam"));

        for(var i : stringMap.entrySet()){
            System.out.println(i);
        }
    }

    public static void immutableMap(){
        System.out.println("Immutable");

        Map<String, String> data = new HashMap<>();
                data.putAll(Map.of("first.name","Lanang","middle.name", "Nandur","last.name","Islam"));

        Map<String, String> stringMap = Collections.unmodifiableMap(data);

        Map<String, String> data2 = Map.of("first.name2","Lanang","middle.name2", "Nandur","last.name2","Islam");
//        data2.put("dicobs", "cobs");

        for(var i : data2.entrySet()){
            System.out.println(i.getValue());
        }
    }

    public static void binarySearch(){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 1000; i++){
            list.add(i);
        }

        Collections.binarySearch(list,873);
    }
}
