package utitlity;

import java.util.ArrayList;
import java.util.Comparator;

public class MinHeap<T extends Comparable> {
    private ArrayList<T> list;

    public MinHeap() {
        this.list = new ArrayList<>();
    }

    public void insert(T item) {
        list.add(item);
        int i = list.size() - 1;
        int parent = parent(i);

        while (parent != i && list.get(i).compareTo(list.get(parent)) < 0) {
            swap(i, parent);
            i = parent;
            parent = parent(i);
        }
    }

    public void buildHeap() {
        for (int i = list.size() / 2; i >= 0; i--) {
            minHeapify(i);
        }
    }

    public T extractMin() {

        if (list.size() == 0) {

            throw new IllegalStateException("MinHeap is EMPTY");
        } else if (list.size() == 1) {
            T min = list.remove(0);
            return min;
        }

        // remove the last item ,and set it as new root
        T min = list.get(0);
        T lastItem = list.remove(list.size() - 1);
        list.set(0, lastItem);

        // bubble-down until heap property is maintained
        minHeapify(0);

        // return min key
        return min;
    }

    public void decreaseKey(int i, T key) {

        if (list.get(i).compareTo(key) < 0) {
            throw new IllegalArgumentException("Key is larger than the original key");
        }

        list.set(i, key);
        int parent = parent(i);

        // bubble-up until heap property is maintained
        while (i > 0 && list.get(parent).compareTo(list.get(i)) > 0) {

            swap(i, parent);
            i = parent;
            parent = parent(parent);
        }
    }

    private void minHeapify(int i) {

        int left = left(i);
        int right = right(i);
        int smallest = -1;

        // find the smallest key between current node and its children.
        if (left <= list.size() - 1 && list.get(left).compareTo(list.get(i)) < 0) {
            smallest = left;
        } else {
            smallest = i;
        }

        if (right <= list.size() - 1 && list.get(right).compareTo(list.get(smallest)) < 0) {
            smallest = right;
        }

        // if the smallest key is not the current key then bubble-down it.
        if (smallest != i) {

            swap(i, smallest);
            minHeapify(smallest);
        }
    }

    public T getMin() {

        return list.get(0);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int parent(int i) {
        if (i % 2 == 1) {
            return i / 2;
        }

        return (i - 1) / 2;
    }

    private void swap(int i, int parent) {

        T temp = list.get(parent);
        list.set(parent, list.get(i));
        list.set(i, temp);
    }

}
