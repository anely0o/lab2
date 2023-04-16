import java.util.*;

/**
 *
 * @param <E> used to specify the type of elements to be stored in the linked list
 */
public class MyLinkedList<E> implements List<E> {
    private class Node {
        E element;
        Node next;
        Node prev;

        /**
         *
         * @param element stores the element contained in the node
         * @param next  stores a reference to the next node in the list
         * @param prev stores a reference to the previous node in the list
         */

        public Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

    }

    private Node head;
    private Node tail;
    private int size;

    /**
     *
     * @param element element whose presence in this collection is to be ensured
     * @return
     */

    public boolean add(E element) {
        Node newNode = new Node(element, null, tail);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            boolean b = tail == newNode;
        }
        size++;
        return true;
    }

    /**
     *
     * @param index index of the element to return
     * @return
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else if () {
            current = tail;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        if (current.prev == null) {
            head = current.next;
        } else {
            current.prev.next = current.next;
        }
        if (current.next == null) {
            tail = current.prev;
        } else {
            current.next.prev = current.prev;
        }
        size--;
        return current.element;

    }

    /**
     *
     * @return
     */
    public int size() {
        return size;
        }
    public static void main(String[] args) {
        List<Integer> myList = new MyLinkedList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println(myList.get(1)); // Output: 2
        myList.remove(1);
        System.out.println(myList.get(1)); // Output: 3
        System.out.println(myList.size()); // Output: 2
    }


}
