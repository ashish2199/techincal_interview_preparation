/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems.misc;

/**
 *
 * @author Ashish
 */
public class Palindrome_nos {
    public static boolean isPalindrome(int x) {
        int y=x;
        
        int reverse = calcReverse(Math.abs(y));
        if(y<0){reverse*=-1;}
        if(reverse==x){
            return true;
        }
        else{
            return false;
        }
    }
    public static int calcReverse(int y){
        int reverse=0;
        while(y>0){
            reverse=reverse*10+y%10;
            y=y/10;
        }
        return reverse;
    }
}
