package sorting;

import static sorting.helper_methods.exch;
import static sorting.helper_methods.less;
import static sorting.helper_methods.printArray;

/**
 *
 * @author Ashish
 */

/*
Bubble Sort 

    Repeatedly steps through the list to be sorted, compares each pair of 
    adjacent items and swaps them if they are in the wrong order. 
    On average uses N^2 compares and 1/4 N^2 swaps for N iterations

    Efficient for small data set

    In each iteration, largest elements bubble up to the top hence called bubble sort.
    Also called Sinking sort for the same reason.

    Another characteristic is that largest element gets to the top in first pass 
    but smallest element takes n-1 pass to move to the front. The smaller the element
    the more passes it requires to reach the front.
    
    The algorithm needs one whole pass without any swaps to know its sorted.
    
    The n-th pass finds the n-th largest element and puts it into its final place.  
    So, the inner loop can avoid looking at the last n − 1 items when running for the n-th time

    Stable(does not change the relative order of elements with equal keys) : Yes
    Online(can sort as it recieves input) : No
    Adaptable(faster for already sorted data) : Yes
    Inplace (doesnt require additional space) : Yes

Analysis
    Worst Case Running Time : O(N^2) when the list is reverse sorted
    Average Case Running Time : O(N^2)
    Best Case Running Time : O(N) Already sorted list
    Space Complexity : O(1)

*/
public class bubble_sort {
    public static void sort(Comparable[] a)
    {
        int N = a.length;
        boolean swap;
        // we are useing do while loop as bubble sort needs 
        // atleast one pass to determine if list is already sorted.
        do  
        {
            swap = false;   // we will reinitialist this variable for every loop
            for (int j = 1; j < N; j++){
                if (less(a[j], a[j-1]))
                {
                    exch(a, j, j-1);
                    swap = true;
                }
            }
        }
        while(swap); //remember to use semi colon after do while loop
        
    }
}
