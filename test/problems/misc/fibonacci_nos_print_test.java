package problems.misc;

import org.junit.Test;
import static org.junit.Assert.*;
import static problems.misc.fibonacci_nos_print.print_fibonacci_nos_upto_N_iterative;
import static problems.misc.fibonacci_nos_print.print_fibonacci_nos_upto_N_recursive;

/**
 *
 * @author Ashish
 */
public class fibonacci_nos_print_test {
    
    @Test
    public void print_fibonacci_nos_upto_N_iterative_test(){
        assertEquals("0",print_fibonacci_nos_upto_N_iterative(1));
        assertEquals("0 1",print_fibonacci_nos_upto_N_iterative(2));
        assertEquals("0 1 1 2 3 5",print_fibonacci_nos_upto_N_iterative(6));
         assertEquals("0 1 1 2 3 5 8 13 21",print_fibonacci_nos_upto_N_iterative(9));
    }
    
    @Test
    public void print_fibonacci_nos_upto_N_recursive_test(){
        assertEquals("0",print_fibonacci_nos_upto_N_recursive(1));
        assertEquals("0 1",print_fibonacci_nos_upto_N_recursive(2));
        assertEquals("0 1 1 2 3 5",print_fibonacci_nos_upto_N_recursive(6));
        assertEquals("0 1 1 2 3 5 8 13 21 34",print_fibonacci_nos_upto_N_recursive(10));
    }
}
