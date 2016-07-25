package data_structures.linked_list.doubly;
public class doublyLinkList {
//<editor-fold defaultstate="collapsed" desc="Doubly Linked List CODE">
    Node head;
    Node tail;
    public doublyLinkList(){
        head=null;
        tail=null;
    }
    public doublyLinkList(int d){
        Node n = new Node(d);
        head=n;
        tail=n;
    }
    public Node getHead(){ return this.head; }
    
    public void addAtFront(int d){
        Node n = new Node(d);
        n.next=head;
        head.previous=n;
        head=n;
    }
    
    public void addAtFront(Node n){
        n.next=head;
        head.previous=n;
        head=n;
    }
    public void addAtEnd(int d){
        Node n = new Node(d);
        n.previous=tail;
        tail.next=n;
        tail=n;
    }
    public void addAtEnd(Node n){
        Node tmp;
        n.previous=tail;
        tail.next=n;
        tail=n;
    }
    public void printList(){
        Node tmp=head;
        //here we will check for node to be not null
        //not the next pointer of the node if we do so the last element doesnt get printed
        while(tmp!=null){
            System.out.print(tmp.data+" ");
            tmp=tmp.next;
        }
    }
    public void printListReverse(){
        Node tmp=tail;
        //here we will check for node to be not null
        //we do not use the next pointer of the node if we do so the last element doesnt get printed
        while(tmp!=null){
            System.out.print(tmp.data+" ");
            tmp=tmp.previous;
        }
    }
//</editor-fold>
        
}
