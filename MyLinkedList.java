import java.util.*;
public class MyLinkedList<E> implements List<E> {
    private class Node{
        E element;
        Node next;
        Node prev;
        public Node(E element, Node next, Node prev){
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

    }
    private Node head;
    private Node tail;
    private int size;
    public boolean add(E element){
        Node newNode = new Node(element, null, tail);
        if( tail == null){
            head = tail = newNode;
        }else {
            tail.next = newNode;
            boolean b = tail == newNode;
        }
        size++;
        return true;
    }
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
        } else if (){
            current = tail;
            for( int i = 0; i< index; i++){
                current = current.next;
            }
        } else {
            current = tail ;
            for( int i size )
        }

        }


}
