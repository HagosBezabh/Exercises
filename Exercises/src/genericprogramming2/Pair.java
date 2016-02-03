package genericprogramming2;

public interface Pair<K, V> {
    public K getKey();
    public V getValue();

    default String defaultToString() {
    	return "(" + getKey().toString() + ", " + getValue().toString() + ")";
    }
}