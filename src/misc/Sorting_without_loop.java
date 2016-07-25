/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

/**
 *
 * @author Ashish
 */
public class Sorting_without_loop {

 
   static void sort(int p[],int i,int j,int size)
   {
     if(i<size)
     { 
         if(j<size-1)
         {
             System.out.println("checking for "+j+" "+(j+1));
             if(p[j]>p[j+1])
             {
                int temp = p[j];
                p[j] = p[j+1];
                p[j+1] = temp;
             }
         }
         else
         {
             j=0;
             ++i;
             //sort(p,i,j,size);
         }
      
      ++j;
      sort(p,i,j,size);
     }
   }
   public static void main(String[] args) {
      int a[]=new int[]{1,5,2,7,3};
      a=new int[]{9,8,7,6,5,4,3,2,1,1,2,3,4,5,6,7,8,9};
      sort(a,0,0,a.length);
       for (int i = 0; i < a.length; i++) {
           int j = a[i];
           System.out.print(j+" ");
       }
   }
   
}
