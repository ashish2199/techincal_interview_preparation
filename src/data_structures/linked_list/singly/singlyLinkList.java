package data_structures.linked_list.singly;
public class singlyLinkList{
    //<editor-fold defaultstate="collapsed" desc="Linked List CODE">
    Node head;
    public singlyLinkList(){
        head=null;
    }
    public singlyLinkList(int d){
        Node n = new Node(d);
        head=n;
    }
    public Node getHead(){ return this.head;}
    
    public void addAtFront(int d){
        Node n = new Node(d);
        n.next=head;
        head=n;
    }
    
    public void addAtFront(Node n){
        n.next=head;
        head=n;
    }
    
    public void addAtEnd(int d){
        Node n = new Node(d);
        Node tmp;
        tmp=head;
        while(tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next=n;
        n.next=null;
    }
    public void addAtEnd(Node n){
        Node tmp;
        tmp=head;
        while(tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next=n;
        n.next=null;
    }
    
    public void deleteNode(int d){
        Node tmp = head;
        Node prevTmp=null;
        
        //find the node with data d
        while(tmp!=null&&tmp.data!=d){
            prevTmp=tmp;
            tmp=tmp.next;
        }
        
                                        
        if(tmp==head&&tmp.data==d){ //present at start
            head=head.next;
            tmp=null;
        }
        else if(tmp!=null&&prevTmp!=null&&tmp.data==d){ //present in middle or end
            prevTmp.next=tmp.next;
            tmp=null;
        }
        
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
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="various operations">
    
    // Reverse a linked list iteratively complexity O(n)
    public void reverseListIteratively(Node n){
        Node prev=null;
        Node nextnode=null;
        while(n!=null){
            nextnode = n.next;
            n.next=prev;
            prev=n;
            n=nextnode;
        }
        //dont forget to change the head
        this.head=prev;
    }
    
    //Reverse a linked list recursively
    public void reverseListRecursively(Node n){
        if(n.next==null){
            this.head=n;
            return;
        }
        Node start = n;
        Node rest = n.next;
        reverseListRecursively(rest);
        rest.next=start;
        start.next=null;
    }
    /*
    kth node from end two pass method complexity - O(N) but requires two passes
    
    there are two approaches for this kth node from end which is (total nodes-k+1)th from start
    but this requires two passes first to find total no of nodes and then to find (total - k +1)th node
    */
    public void kthNodeFromEndTwoPass(int pos){
        System.out.println("Searching for "+pos+"th Node from end in two pass");
        Node tmp=this.head;
        
        /*
        Finding the Total number of nodes
        */
        int total=0;    // we start with 0 as in the first iteration
        while(tmp!=null){   //total becomes one when we are checking if head is null it becomes 1 if head is present
            total++;
            tmp=tmp.next;
        }
        
        /*
        Finding the (total -k+1)th node from start
        */
        int k =1;   //we need to start from 1 as the numbering for position start from 1 there is no 0th position
        tmp=head;
        while(k!=(total-pos+1)){
            tmp=tmp.next;
            k++;
        }
        System.out.println("the Kth node from end in this linked list is " + tmp.data);
    }
    
    /*
    Kth node from end using just one pass - complexity O(N) only but using single pass
    
    what will do here is use two pointers, we will start with first pointer and move it K steps forward
    then will increment both the second and first pointer till the first pointer reaches the end of the linked list
    by this time the second pointer would be pointing to the Kth node from the end.
    */
    public void kthNodeFromEndOnePass(int pos){
        System.out.println("Searching for "+pos+"th Node from end in one pass");
        
        int p=0;    //we start with 0 as if we start with 1 the while loop will sun only pos-1 times not pos times.
        Node tmpFirst = this.head;
        Node tmpSecond = this.head;
        
        
        while(p!=pos){  //move the first pointer Kth steps
            tmpFirst = tmpFirst.next;
            p++;
        }
        
        while(tmpFirst!=null){ //move both the pointer till first pointer reaches end of linked list.
            tmpFirst = tmpFirst.next;
            tmpSecond = tmpSecond.next;
        }
        
        System.out.println("the Kth node from end in this linked list is " + tmpSecond.data);
    }
    
    
//</editor-fold>
}
