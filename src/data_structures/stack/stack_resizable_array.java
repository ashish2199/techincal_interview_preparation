/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures.stack;

/**
 *
 * @author Ashish
 */
public class stack_resizable_array<T> implements Stack_ADT<T>{

    T items[];
    
    /*
    Top represents a temporary variable used to mark the index where the next item will be placed and is one more than index of last item placed
    */
    int top;
    
    int size;
    
    public stack_resizable_array(){
        items = ( T[] )new Object[2];
        size=0;
    }
    
    /*
        Push Running time analysis
        Amortised cost - O(1)
        worst case - O(N)
    */
    @Override
    public void push(T item) {
        if(top==items.length){
            resize(items.length*2);
        }
        //here we first place the item and then increment the top
        items[top++]=item;
        ++size;
    }

    
    /*
        Pop Running time analysis
        Amortised cost - O(1)
        worst case - O(N)
    */
    @Override
    public T pop() {
        
        //here first we decrease the top pointer and then remove the element
        T item = items[--top];
        --size;
        
        items[top]=null; // to prevent loitering
        
        if(top==(items.length/4)){
            resize(items.length/2);
        }
    
        return item;
    }
    

    /*
        IsEmpty - O(1)
    */
    @Override
    public boolean isEmpty() {
        return (size==0)?true:false;
    }

    /*
        getSize - O(1)
    */
    @Override
    public int getSize() {
        return size;
    }
    
    
    /*
    Resize method - O(N)
    */
    public void resize(int newSize){
        T[] newArray = ( T[] )new Object[newSize];
        /*Copy elements from old array to new array*/
        for (int i = 0; i < items.length; i++) {
            newArray[i] = items[i];
        }
        items=newArray;
    }
    
}
