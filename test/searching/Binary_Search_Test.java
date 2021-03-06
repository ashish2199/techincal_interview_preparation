/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Ashish
 */
public class Binary_Search_Test {
    int a[];
    
    @Before
    public void setUp() {
                  // 0, 1, 2, 3, 4, 5, 6, 7, 8 
        a=new int[]{ 1, 4, 6, 8,10,33,56,78,89};
    }
    
    @Test
    public void test_for_item_present_iterative(){
        int result_index = Binary_Search.binarySearch_iterative(a,6);
        assertEquals(2, result_index);
        
        result_index = Binary_Search.binarySearch_iterative(a,89);
        assertEquals(8, result_index);
    }
    
    @Test
    public void test_for_item_absent_iterative(){
        int result_index = Binary_Search.binarySearch_iterative(a,3);
        assertEquals(-1, result_index);
    }
    
    @Test
    public void test_for_item_present_recursive(){
        int result_index = Binary_Search.binarySearch_recursive(a,6,0,a.length);
        assertEquals(2, result_index);
        
        result_index = Binary_Search.binarySearch_recursive(a,89,0,a.length);
        assertEquals(8, result_index);
    }
    
    @Test
    public void test_for_item_absent_recursive(){
        int result_index = Binary_Search.binarySearch_recursive(a,3,0,a.length);
        assertEquals(-1, result_index);
    }
}
