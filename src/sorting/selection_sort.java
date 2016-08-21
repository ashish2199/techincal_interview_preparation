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
public class selection_sort {
    /*
Selection Sort 
    In the I th iteration go through array find the shortest remaining entry to
    the right of I and swap it with first entry in the array.
    
    Data involvement is minimum – Every item is put into its final order with 
    just one exchange.
    Linear Number of exchanges - O(N) swaps
    
    Stable(does not change the relative order of elements with equal keys) : No
    Online(can sort as it recieves input) : No
    Adaptable(faster for already sorted data) : No, goes through entire data 
                                                irrespective of order. It is 
                                                quadratic for every array.
    Inplace (doesnt require additional space) : Yes

    
Analysis
    Worst Case Running Time : O(N^2)
    Best Case Running Time : O(N^2)
    Space Complexity : O(1)

*/
    public static void sort(Comparable a[]){
        int N = a.length;
        for (int i = 0; i < N; i++)
        {
            int min = i;
            for (int j = i+1; j < N; j++)
            if (less(a[j], a[min]))
            min = j;
            exch(a, i, min);
        }
    }
}
