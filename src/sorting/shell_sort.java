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
public class shell_sort {
    public static void sort(Comparable[] a)
    {
        int N = a.length;
        int h = 1;
        while (h < N/3) h = 3*h + 1; // 1, 4, 13, 40, 121, 364, ...
        //H will be decreasing till H=1(that is insertion sort)
        while (h >= 1)
        {   
            // h-sort the array.
            for (int i = h; i < N; i++)
            {
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h){
                    exch(a, j, j-h);
                }
            }
            h = h/3;
        }
    }
}
