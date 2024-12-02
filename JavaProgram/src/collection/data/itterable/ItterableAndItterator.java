package collection.data.itterable;

import java.util.Iterator;
import java.util.List;

/*

Pada dasarnya collection dibagi menjadi 2
yaitu iterator dan map. untuk iterator ini
bersifat generic. untuk mendapatkan valuenya
kita dapat menggunakan for each. pada dasarnya
for each ini merupakan implementasi dari itterator
 */
public class ItterableAndItterator {

    public static void main(String[] args) {

        Iterable<String> names = List.of("Lanang", "Nandur", "Islam");

        for(var i : names){
            System.out.println(i);
        }

        /*
        Sebenarnya pada for each ini manualnya didalam interface melakukan seperti ini
         */
        System.out.println("ITTERATOR");
        Iterator<String> namesItterator = names.iterator();
        while (namesItterator.hasNext()){
            var name = namesItterator.next();
            System.out.println(name );
        }
    }


}
