package collection.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Person {

    private String name;

    private List<String> hobbies = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public List<String> getHobbies() {
        return hobbies;
    }

    public List<String> getHobbiesImmutable(){
        return Collections.unmodifiableList(hobbies);
    }

    public List<String> getHobbiesImmutable2(){
        return Collections.emptyList();
    }

   public void addHobbies(String hobbiesParam){
       hobbies.add(hobbiesParam);
   }
}
