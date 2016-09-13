/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems.misc;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ashish
 */
public class Palindrome_nos_tests {
    @Test
    //we can have a method with same name as class
    public void Palindrome_nos_tests() {
        assertEquals(true,Palindrome_nos.isPalindrome(0));
        assertEquals(true,Palindrome_nos.isPalindrome(111));
        assertEquals(true,Palindrome_nos.isPalindrome(121));
        assertEquals(true,Palindrome_nos.isPalindrome(-111));
        assertEquals(false,Palindrome_nos.isPalindrome(132));
    }
    
}
