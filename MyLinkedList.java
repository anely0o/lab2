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


}
