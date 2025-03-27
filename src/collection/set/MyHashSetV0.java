package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {

    private int[] elemntData = new int[10];
    private int size = 0;

    //O(n)
    public boolean add(int value) {

        if (contains(value)) {
            return false;
        }

        elemntData[size] = value;
        size++;
        return true;
    }

    // O(n)
    public boolean contains(int value) {
        for (int data : elemntData) {
            if (data == value) {
                return true;
            }
        }

        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elemntData=" + Arrays.toString(Arrays.copyOf(elemntData, size)) +
                ", size=" + size +
                '}';
    }
}
