package data_structures.stack;

import jdk.nashorn.internal.runtime.regexp.joni.EncodingHelper;

/**
 *
 * @author Ashish
 */
public class stack_linked_list_based<T> implements Stack_ADT<T> {

    
    class Node{
        Node next;
        T item;
    }
    
    private Node first = null;
    int size;
    
    @Override
    public void push(T item) {
        Node old_first = first;
        first = new Node();
        first.item=item;
        first.next=old_first;
        ++size;
    }

    @Override
    public T pop(){
        T item = null;
        if(first!=null){
            item = first.item;
            first=first.next;
            --size;
        }
        return item;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int getSize() {
        return size;
    }
}
