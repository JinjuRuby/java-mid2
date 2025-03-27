package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<E>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
        initBuckets();
    }

    public MyHashSetV3(int capacity) {
        this.capacity = capacity;

        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];

        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex]; //O(1)

        if (bucket.contains(value)) { //O(n) -> O(1) 각 배열에 데이터가 별로 없기 때문
            return false;
        }

        bucket.add(value);
        size++;

        return true;
    }

    public boolean contains(E searchValue) {
        int hashIndex = hashIndex(searchValue); //O(1)
        LinkedList<E> bucket = buckets[hashIndex]; //O(1)

        return bucket.contains(searchValue); //O(n) -> O(1) 데이터가 별로 없다
    }

    public boolean remove(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex]; //O(1)
        boolean result = bucket.remove(value); //O(n) -> O(1) 데이터가 별로 없다

        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int hashIndex(E value) {
        int hashCode = value.hashCode(); //음수가 나올 수 있다
        int hashIndex = Math.abs(hashCode) % capacity; //Math.abs(): 절댓값
        return hashIndex;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
