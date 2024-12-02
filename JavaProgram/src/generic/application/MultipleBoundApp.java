package generic.application;

import generic.bound.multiple.Data;
import generic.bound.multiple.VicePresident;

public class MultipleBoundApp {

    public static void main(String[] args) {

//        Data<Manager> managerData = new Data<Manager>(new Manager());
        Data<VicePresident> vicePresidentData = new Data<>(new VicePresident());
        vicePresidentData.getData().sayHello("Lanang");


    }
}
