package generic.genericclass;

public class MultipleGeneric<T, U> {

    private T first;
    private U second;

    public MultipleGeneric(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public U getSecond() {
        return second;
    }

}
