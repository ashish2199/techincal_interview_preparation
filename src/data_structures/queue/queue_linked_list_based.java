/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures.queue;

import java.util.Iterator;

/**
 *
 * @author Ashish
 */
public class queue_linked_list_based<T> implements Iterable<T>,queue_ADT<T>{

    @Override
    public Iterator<T> iterator() {
        return new queue_iterator();
    }

     class Node{
        Node next;
        T item;
    }
    
    private Node head = null;
    private Node tail = null;
    int size;
    
    @Override
    public void enqueue(T item) {
        Node oldTail = tail;
        tail = new Node();
        tail.item = item;
        tail.next = null;
        if(isEmpty()){
            head = tail;
        }
        else{
            oldTail.next=tail;
        }
        size++;
    }

    @Override
    public T dequeue() {
        Node itemNode = head;
        head=head.next;
        size--;
        if(isEmpty()){
            tail=null;
        }
        return itemNode.item;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public int getSize() {
        return size;
    }
    
    /*
        This is inner class which implements iterator interface to create a iterator.
        Iterator is used for traversing the queue
    */
    class queue_iterator implements Iterator<T>{
        Node current=head;
        @Override
        public boolean hasNext() {
            return !(current == null);
        }
        @Override
        public T next() {
            T item = current.item;
            current = current.next;
            return item;
        }
    }
}
