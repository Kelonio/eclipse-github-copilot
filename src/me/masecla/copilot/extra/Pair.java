package me.masecla.copilot.extra;

/**
 * Simple generic pair container.
 *
 * @param <K> first element type
 * @param <V> second element type
 */
public class Pair<K, V> {
    private final K first;
    private final V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public static <K, V> Pair<K, V> of(K first, V second) {
        return new Pair<>(first, second);
    }

    @Override
    public String toString() {
        return "Pair[first=" + first + ", second=" + second + "]";
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (first == null ? 0 : first.hashCode());
        result = 31 * result + (second == null ? 0 : second.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pair<?, ?> other = (Pair<?, ?>) obj;
        if (first != null ? !first.equals(other.first) : other.first != null) return false;
        return second != null ? second.equals(other.second) : other.second == null;
    }
}
