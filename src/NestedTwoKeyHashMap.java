import java.util.*;

public class NestedTwoKeyHashMap<K1, K2, V> implements TwoKeyMap<K1, K2, V> {

    private final Map<Pair<K1, K2>, V> map = new HashMap<>();

    @Override
    public V put(K1 k1, K2 k2, V value) {
        return map.put(new Pair<>(k1, k2), value);
    }

    @Override
    public V get(K1 k1, K2 k2) {
        return map.get(new Pair<>(k1, k2));
    }

    @Override
    public V remove(K1 k1, K2 k2) {
        return map.remove(new Pair<>(k1, k2));
    }

    @Override
    public boolean containsKeys(K1 k1, K2 k2) {
        if (map.containsKey(new Pair<>(k1, k2))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean containsValue(V value) {
        if (map.containsValue(value)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        if (map.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Set<Entry<K1, K2, V>> entrySet() {
        Set<Entry<K1, K2, V>> newSet = new HashSet<>();
        for (Map.Entry<Pair<K1, K2>, V> e : map.entrySet()) {
            Pair<K1, K2> p = e.getKey();
            newSet.add(new EntryObject<>(p.getFirst(), p.getSecond(), e.getValue()));
        }
        return newSet;
    }

    @Override
    public Set<Pair<K1, K2>> keySet() {
        return map.keySet();
    }

    @Override
    public Collection<V> values() {
        return map.values();
    }

    @Override
    public void putAll(TwoKeyMap<? extends K1, ? extends K2, ? extends V> other) {
        for (Entry<? extends K1, ? extends K2, ? extends V> entry : other) {
            put(entry.getKey1(), entry.getKey2(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Iterator<Entry<K1, K2, V>> iterator() {
        return entrySet().iterator();
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
