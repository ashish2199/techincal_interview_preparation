/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

/**
 *
 * @author Ashish
 */
public class Binary_Search {
    
    /*
    Complexity: O(logN)
    Worst case - O(log N)
    Best case - omega(1)
    
    Space complexity - O(1)
    */
    
    
    public static int binarySearch_iterative(int[] a,int item ){
        int lo=0;
        int hi=a.length-1;
        
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if( item > a[mid] ){
                lo=mid+1;
            }
            else if( item < a[mid] ){
                hi=mid-1;
            }
            else if( a[mid]==item ){
                return mid;
            }
        }
        return -1;
    }
    
    public static int binarySearch_recursive(int[] a,int item,int low,int high){
        
        int mid = (low+high)/2;
        //base case
        if(low>high){
            return -1;
        }
        else{ 
            if(a[mid]==item){
                return mid;
            }
            else{
                if(a[mid]<item){
                    return binarySearch_recursive(a, item, mid+1, high);
                }
                else {
                    return binarySearch_recursive(a, item, low, mid-1);
                }
            }
        }
    }
}
