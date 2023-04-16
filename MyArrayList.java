import java.util. *;
public abstract class MyArrayList<E> implements List<E> {
    private Object[] elements;

    public MyArrayList(int initialCapasity) {
        this.elements = new Object[initialCapasity];
    }
    private int size;
    private void ensureCapacity(int minCapacity) {
        int oldCapacity = elements.length;
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            if (newCapacity < minCapacity)
                newCapacity = minCapacity;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }
    public boolean add(E element){
        ensureCapacity(size+1);
        elements[size++] = element;
        return true;
    }

}
