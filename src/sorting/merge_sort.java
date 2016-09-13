package sorting;
import static sorting.helper_methods.*;
/**
 *
 * @author Ashish
 */
/*
Merge Sort 
    Sort algorithm used by Java for sorting objects.
    Based on devide and Conquer
    Less number of compares
    Here one half gets sorted first and then other half gets sorted

    Stable(does not change the relative order of elements with equal keys) : Yes
    Online(can sort as it recieves input) : No
    Adaptable(faster for already sorted data) : No
    Inplace (doesnt require additional space) : No

Analysis
    Worst Case Running Time : O(NLogN) when the list is reverse sorted
    Best Case Running Time : O(NLogN) Already sorted list
    Space Complexity : O(N) auxilary space(left and right arrays)

*/
public class merge_sort {
    static Comparable[] aux;
/*
    we are not creating auxiliary array in the recursion to improve performance
    */
    public static void sort(Comparable[] a)
    {
        aux = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }
    
    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi)
    {
        if (hi <= lo) return;
        
        int mid = lo + (hi - lo) / 2;
        
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        
        merge(a, aux, lo, mid, hi);
        
    }

    /*
    Abstract inplace merge
    Here we are using a auxilary array to hold the data before merging them
    we are using assertions to check the invariants
    */
    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi)
    {
        assert isSorted(a, lo, mid); // precondition: a[lo..mid] sorted
        assert isSorted(a, mid+1, hi); // precondition: a[mid+1..hi] sorted
        
        /*Copy everything to auxiliart array*/
        for (int k = lo; k <= hi; k++){
            aux[k] = a[k];
        }
        
        int i = lo, j = mid+1;
        
        /*
        Copy everything back to orgional array but this time in sorted order
        i - current entry in left half
        j - current entry in right half
        k - current entry in the sorted result
        */
        for (int k = lo; k <= hi; k++)
        {
            //if Left half is exhausted so we need to just add the right half to origional array
            if(i > mid){  
                a[k] = aux[j++]; 
            }
            //if Right half is exhausted so we need to just add the left half to origional array
            else if(j > hi){ 
                a[k] = aux[i++]; 
            }
            /* 
                if right half element is smaller than left half element then 
                move right half element into origional array 
                else move left half element into the origional array
            */
            else if( less(aux[j], aux[i]) ){
                a[k] = aux[j++]; 
            }
            else{
                a[k] = aux[i++]; 
            }
        }
        
        assert isSorted(a, lo, hi); // postcondition: a[lo..hi] sorted
    }
    
    /*
        we first start with subarray of size 1 is single elements and merge them
        to get subarray of size 2 and then 4 , 8 and so on 
        uses log n passes and each pass taking n compares
    */
    public static void sort_bottom_up_non_recursive(Comparable[] a)
    {
        int N = a.length;
        Comparable[] aux = new Comparable[N];
        for (int sz = 1; sz < N; sz = sz+sz){ //here we double the size each time
            for (int lo = 0; lo < N-sz; lo += sz+sz){
                /*
                    we are using minimum as for last subarray we may not full subarray
                */
                merge(a, aux, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
            }
        }
    }
}
