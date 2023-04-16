import java.util. *;

/**
 *
 * @param <E>
 */
public abstract class MyArrayList<E> implements List<E> {
    private Object[] elements;

    /**
     *
     * @param initialCapasity constructs a new MyArrayList object with the specified initial capacity;
     */
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

    /**
     *
     * @param element element whose presence in this collection is to be ensured
     *                adds the specified element to the end of the list
     * @returns true
     */
    public boolean add(E element){
        ensureCapacity(size+1);
        elements[size++] = element;
        return true;
    }

    /**
     *
     * @param index index of the element to return
     * @returns hte element at hte specified index from the list
     */
    public E get(int index){
        if (index < 0 || index >= size )
            throw new IndexOutOfBoundsException();
        return (E) elements[index];
    }

    /**
     *
     * @param index the index of the element to be removed
     * @return
     */
    public E remove(int index){
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        E oldValue = (E) elements[index];
        int numMoved = size - index - 1;
        if ( numMoved > 0)
            System.arraycopy(elements, index+1, elements, index, numMoved);
        elements[--size] = null;
        return oldValue;
    }

    /**
     *
     * @return
     */
    public int size() {
        return size;
    }
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>() {
            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Integer set(int index, Integer element) {
                return null;
            }

            @Override
            public void add(int index, Integer element) {

            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Integer> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Integer> listIterator(int index) {
                return null;
            }

            @Override
            public List<Integer> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println(myList.get(1)); // Output: 2
        myList.remove(1);
        System.out.println(myList.get(1)); // Output: 3
        System.out.println(myList.size()); // Output: 2
    }

}
