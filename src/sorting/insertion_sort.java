package sorting;

import static sorting.helper_methods.exch;
import static sorting.helper_methods.less;

/**
 *
 * @author Ashish
 */

/*
Insertion Sort 

    Piecewise Swap to left till the element is its correct position.
    On average uses 1/4 N^2 compares and 1/4 N^2 swaps

    Efficient for small data set

    Stable(does not change the relative order of elements with equal keys) : Yes
    Online(can sort as it recieves input) : Yes
    Adaptable(faster for already sorted data) : Yes
    Inplace (doesnt require additional space) : Yes

Analysis
    Worst Case Running Time : O(N^2) when the list is reverse sorted
    Best Case Running Time : O(N) Already sorted list
    Space Complexity : O(1)

*/
public class insertion_sort {
    public static void sort(Comparable[] a)
    {
        int N = a.length;
        
        /*Move through array*/
        for (int i = 0; i < N; i++){
            /*Piecewise swap till it is in its proper place*/
            for (int j = i; j > 0; j--){
                if (less(a[j], a[j-1]))
                {
                    exch(a, j, j-1);
                }
                /*Break when its in proper place*/
                else{ 
                    break;
                }
            }
        }
    }
}
