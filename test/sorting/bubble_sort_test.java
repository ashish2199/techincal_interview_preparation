/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ashish
 */
public class bubble_sort_test {
    
    public bubble_sort_test() {
        
    }
    
    @Test
    public void bubble_sort_test(){
        Integer a[]=new Integer[]{1,0,9,8,7,6,5,2,3,4};
        sorting.bubble_sort.sort(a);
        Integer exp[]=new Integer[]{0,1,2,3,4,5,6,7,8,9};
        assertArrayEquals(exp, a);
        
        Integer b[] = helper_methods.getRandomValuesArray(100);
        bubble_sort.sort(b);
        assertArrayEquals(helper_methods.getValuesArray(100), b);
        
    }
    
}
