/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures.heap;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Ashish
 */
public class Binary_Heap_Test {
    
    data_structures.heap.Binary_Heap heap;
    public Binary_Heap_Test() {
        
    }
    
    
    //this will run once for each method with @test
    @Before
    public void setUp(){
        heap=new Binary_Heap(0);
        int[] a=new int[]{2,5,3,6,7};
        heap.buildHeap(a);
    }
    
    @After
    public void tearDown() {
        heap = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test_insert(){
        heap.insert(26);
        heap.insert(13);
        //int max = heap.extractMax();
        assertEquals(26,heap.arr[0]);
    } 
    
    @Test
    public void test_delete(){
        heap.delete(0);
        assertEquals(6,heap.extractMax());
    }
    
    @Test
    public void test_extractMax(){
        int max = heap.extractMax();
        assertEquals(7,max);
    }
    
    @Test
    public void test_changeKey(){
        
    }
    
}
