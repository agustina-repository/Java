package generic.bound.multiple;

public class VicePresident extends Employee implements CanSayHello{
    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}
