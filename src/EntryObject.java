public class EntryObject<K1, K2, V> implements TwoKeyMap.Entry<K1, K2, V> {
    private final K1 k1;
    private final K2 k2;
    private V value;

    public EntryObject(K1 k1, K2 k2, V value) {
        this.k1 = k1;
        this.k2 = k2;
        this.value = value;
    }

    @Override
    public K1 getKey1() {
        return k1;
    }

    @Override
    public K2 getKey2() {
        return k2;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        return value;
    }
}
