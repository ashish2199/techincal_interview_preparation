package sorting;

import java.util.Random;

/**
 *
 * @author Ashish
 */
public class helper_methods {
    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
    public static void exch(Comparable[] a,int i,int j){
        Comparable swap = a[i];
        a[i]=a[j];
        a[j]=swap;
    }
    public static boolean isSorted(Comparable[] a)
    {
        for (int i = 1; i < a.length; i++){
            if (less(a[i], a[i-1])) return false;
        }
        return true;
    }
    
    /*
    O(N) Fisher yates algorithm
    In iteration Ith , pick integer between 0 and I uniformly at random 
    and Swap a[i] and a[r]
    
    -- To shuffle an array a of n elements (indices 0..n-1):
    for i from 0 to n−2 do
        j ← random integer such that i ≤ j < n
        exchange a[i] and a[j]
    
    */
    public static void shuffle(Comparable[] a)
    {
        int N = a.length;
        Random rand = new Random();
        
        for (int i = 0; i < N-2; i++)
        {
            Random ranGen = new Random();
            /* j ← random integer such that i ≤ j < n*/
            int j = ranGen.nextInt(N-i)+i;
            exch(a, i, j);
        }
    }
    
    public static Integer[] getRandomValuesArray(int size) {
        Integer a[]=new Integer[size];
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        shuffle(a);
        return a;
    }
    
    public static Integer[] getValuesArray(int size) {
        Integer a[]=new Integer[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        return a;
    }
    
}
