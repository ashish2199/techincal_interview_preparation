/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems.data_structures.stack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ashish
 */
public class Infix_to_Postfix_test {
    @Test
    public void postfix_evaulation_test_easy(){
        
        String infix = "5 + 10";
        String answer = "5 10 +";
        String result = infix_to_postfix.convert_infix_to_postfix(infix);
        assertEquals(answer, result);
        
        infix = "( 5 + 10 )";
        answer = "5 10 +";
        result = infix_to_postfix.convert_infix_to_postfix(infix);
        assertEquals(answer, result);
        
        infix = "5 + ( ( 1 + 2 ) * 4 ) - 3";
        answer = "5 1 2 + 4 * 3 - +";
        result = infix_to_postfix.convert_infix_to_postfix(infix);
        assertEquals(answer, result);
    }
}
