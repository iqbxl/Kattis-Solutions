public class Pair<T, U> { // create a generic Pair class
    
    public T first;
    public U second;

    public Pair() { // no-argument constructor / default constructor
        first = null;
        second = null;
    }

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public Pair(Pair<T, U> toCopy) { // copies a given pair
        first = toCopy.first;
        second = toCopy.second;
    }
}