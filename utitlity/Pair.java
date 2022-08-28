package utitlity;

public class Pair<T extends Comparable, V extends Comparable> implements Comparable<Pair>{
    T first;
    V second;
    private Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }
    public static <T, V> Pair of(T first, V second) {
        return new Pair<T, V>(first, second);
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    @Override
    public int compareTo(Pair o) {
        return this.first.compareTo(o.first);
    }
}
