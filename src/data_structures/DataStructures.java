package data_structures;

import data_structures.linked_list.singly.singlyLinkList;

public class DataStructures {
    public static void main(String[] args) {
        singlyLinkList sl = new singlyLinkList();
        
        for (int i = 0; i < 20; i++) {
           sl.addAtFront(i); 
        }
        
        sl.printList();
        System.out.println("");
        sl.deleteNode(19);
        sl.deleteNode(8);
        sl.deleteNode(0);
        sl.printList();
        System.out.println("");
        sl.deleteNode(8);
        sl.deleteNode(10);
        sl.printList();
        System.out.println("");
        sl.reverseListRecursively(sl.getHead());
        sl.printList();
        System.out.println("");
        sl.reverseListRecursively(sl.getHead());
        sl.printList();
        System.out.println("");
        
        /*
        long startTwoPass=System.nanoTime();
        sl.kthNodeFromEndTwoPass(1500);
        long endtTwoPass=System.nanoTime();
        System.out.println("TIme taken: "+(endtTwoPass-startTwoPass));
        
        long startOnePass=System.nanoTime();
        sl.kthNodeFromEndOnePass(1500);
        long endtOnePass=System.nanoTime();
        System.out.println("TIme taken: "+(endtOnePass-startOnePass));
        */
    }
}

