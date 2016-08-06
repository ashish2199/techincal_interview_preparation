/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems.data_structures.stack;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import problems.data_structures.stack.Postfix_Evaluation.postfix_evaluation_exception;
/**
 *
 * @author Ashish
 */
public class Postfix_evaluation_test {
    
    public Postfix_evaluation_test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void postfix_evaulation_test(){
        try{
        String postfix_str1 = "5 10 +";
        int answer1 = 15;
        int result1 = Postfix_Evaluation.evaluatePostfixExpression(postfix_str1);
        assertEquals(answer1, result1);
        
        String postfix_str2 = "20 10 /";
        int answer2 = 2;
        int result2 = Postfix_Evaluation.evaluatePostfixExpression(postfix_str2);
        assertEquals(answer2, result2);
        }
        catch(Postfix_Evaluation.postfix_evaluation_exception e){
            assert(false);
        }
    }
    
    @Test(expected = postfix_evaluation_exception.class)
    public void postfix_exception_test() throws postfix_evaluation_exception{
        String postfix_str1 = "5 10 + 5";
        int answer1 = 15;
        int result1 = Postfix_Evaluation.evaluatePostfixExpression(postfix_str1);
        assertEquals(answer1, result1);
    
    }
    
}
