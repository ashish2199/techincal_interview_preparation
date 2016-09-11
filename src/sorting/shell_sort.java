/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import static sorting.helper_methods.exch;
import static sorting.helper_methods.less;

/**
 *
 * @author Ashish
 */
/*
    Shell Sort
    Developed by Donald Shell

    It can be seen as either generalization of sorting by 
    insertion (insertion sort).( Insertion sort with stride length H )
    Move entries more than one position at a time by h-sorting the array.
    
    It is generally fast for small size input and Tiny footprint of code makes
    it suitable for embedded applications.
    
    if a array is h sorted and we k sort it then it remains h sorted

    Stable(does not change the relative order of elements with equal keys) : No
    Online(can sort as it recieves input) : No
    Adaptable(faster for already sorted data) : Yes
    Inplace (doesnt require additional space) : Yes

    
Analysis
    Worst Case Running Time : O( N^(3/2) )
    Best Case Running Time : O(N LogN)
    Space Complexity : O(1)
*/
public class shell_sort {
    public static void sort(Comparable[] a)
    {
        int N = a.length;
        int h = 1;
        
        while (h < N/3) h = 3*h + 1; // 1, 4, 13, 40, 121, 364, ... developed by knuth
        //We start with largest value of H and H will be decreasing till H=1
        //(that is insertion sort)
        
        while (h >= 1)
        {   
            // h-sort the array.
            for (int i = h; i < N; i++)
            {
                /*
                putting the element in its proper position by moving H steps 
                backward at a time.
                */
                for (int j = i; j >= h; j -= h){
                    //if a[j] is less than a[j-h] then exchange
                    if( less(a[j], a[j-h]) ){
                        exch(a, j, j-h);
                    }
                    else{
                        break;
                    }
                }
            }
            h = h/3;
        }
    }
}
