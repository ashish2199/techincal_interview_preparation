package data_structures.linked_list.doubly;
public class Node{
    Node next;
    Node previous;
    int data;
    Node(int data){
        this.data=data;
        this.next=null;
        this.previous=null;
    }
}
