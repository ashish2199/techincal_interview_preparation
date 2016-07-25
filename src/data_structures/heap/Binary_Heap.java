package data_structures.heap;

/**
 * @author Ashish
 */
public class Binary_Heap
{
    
    int arr[];
    int size;
    int capacity;
    
    //Θ(1)
    Binary_Heap(int c){
        arr = new int[c];
        this.capacity=c;
        this.size=0;
    }
    
    
    //Θ(n)    loose upper bound is O(NlogN)
    public void buildHeap(int a[]){
        arr=a;
        capacity=a.length;
        size = a.length-1;
        //iterate from level above leaft nodes that is index less than n/2
        for (int i = (int)Math.floor(size/2); i >= 0 ; i-- ) {
            shiftDown(i);
        }
    }
    
    
    //Θ(log n)
    public void insert(int index){
        //Reallocate array if no space is left
        if(size>=capacity-1){
            System.out.println("Cannot insert Element as there is no space in array");
            int[] arrNew=new int[capacity*2];
            for (int i = 0; i < capacity; i++) {
                arrNew[i] = arr[i];
            }
            arr=arrNew;
            capacity=capacity*2;
        }
        
            size++;
            //add new element at the end of binary tree from left to right
            arr[size]=index;
            //remoce any violations to heap property by going up
            shiftUp(size);
        
    }
    
    
    //Θ(log n)
    public void delete(int index){
        /*
        make its value to infinity so that 
        this value is greater than all others and there be able to reach root
        */
        arr[index]=Integer.MAX_VALUE;
        
        //move the value up till the root
        shiftUp(index);
        
        //remove the value at the root 
        extractMax();
    }
    
    
    //Θ(log n)
    public int extractMax(){ 
        // Get the root which is max element of this max heap
        int max = arr[0];
        
        //Replace the root which is to be removed by last node
        arr[0]=arr[size];
        
        //Remove any violations in heap property by going down
        shiftDown(0);
        
        return max;
    }
    
    //This operation is the one which keeps the max heap property true
    //Also known as Max Heapify down
    //Θ(log n)  as we atmost step which this algorithm can take is O(height) which is O(logN)
    public void shiftDown(int m){
        /*
        keep doing until we reach the leaf nodes we can identify this as the 
        children of leaf nodes will be at index more than size of heap
        and if children of this node is larger than this node then swap the node
        and the children
        here we will swap with the largest of two children
        */
        int maxIndex = m;
        if(getLeftChildIndex(m) <= size && arr[ getLeftChildIndex(m) ] > arr[m] ){
            maxIndex=getLeftChildIndex(m);
        }
        
        /* 
        here we also check if the right child is larger than left
        here we compare with largest_child and not left child as there can be
        a case that left child is smaller than node and therefore 
        we need to compare node and it's right child
        */ 
        if(getRightChildIndex(m) <= size && 
                arr[ getRightChildIndex(m) ] > arr[ maxIndex ] )
        {
            maxIndex=getRightChildIndex(m);
        }
        
        //if maxindex is of it's child then swap the node with its child
        if( m != maxIndex ){
            swap(arr,m,maxIndex);
            
            //recursive call so now we move to child which was swapped
            shiftDown(maxIndex);
        }
    }
    
    
    //Θ(log n)  as we atmost step which this algorithm can take is O(height) which is O(logN)
    public void shiftUp(int m){
        /*
            keep moving up till we reach root whose index is 0 and
            the parent of the node is smaller than the node then
            swap the two and make m = parent of M
        */
        while( m>0 && arr[ getParentIndex(m) ] < arr[m] ){
            swap( arr, getParentIndex(m) , m);
            m = getParentIndex(m);
        }
    }
    
    
    //Θ(log n)
    public void decreaseKey(int index , int newKey){
        int oldKey = arr[index];
        
        //replace old key with new key
        arr[index] = newKey;
        
        //now based on key being removed remove violation to heap property
        if(oldKey<newKey){
            /*
            this is the case when we are incresing the key's value so
            violation will occur only for ascendants
            */
            shiftUp(index);
        }
        else{
            /*
            this is the case when we are decresing the key's value so
            violation will occur only for descendants
            */
            shiftDown(index);
        }
    }
    
    //Θ(1)
    public int getMax(){
        return arr[0];
    }
    
    /*
    All these operations are O(1)
    */
    private int getParentIndex(int i){
        return (int)Math.floor((i-1)/2);
    }
    private int getLeftChildIndex(int i){
        return 2*i+1;
    }
    private int getRightChildIndex(int i){
        return 2*i+2;
    }
    private void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

}
