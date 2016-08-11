/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems.data_structures.stack;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ashish
 */
public class mathematical_expression_evaluation_test {
    
    
    @Test
    public void evaluate_expr_using_postfix_test(){
        try {
            String expr = "( 10 + 5 )";
            int answer = 15;
            int result = problems.data_structures.stack.mathematical_expression_evaluation.evaluate_expression(expr);
            assertEquals(answer,result);
        
            expr = "( 10 - 5 )";
            answer = 5;
            result = problems.data_structures.stack.mathematical_expression_evaluation.evaluate_expression(expr);
            assertEquals(answer,result);
        
            expr = "( 10 - 5 ) * ( 10 * 2 )";
            answer = 100;
            result = problems.data_structures.stack.mathematical_expression_evaluation.evaluate_expression(expr);
            assertEquals(answer,result);
            
            expr = "( 10 - 5 ) * ( 10 * 2 ) + 10 * 2 + 5";
            answer = 125;
            result = problems.data_structures.stack.mathematical_expression_evaluation.evaluate_expression(expr);
            assertEquals(answer,result);
            
        } catch (Postfix_Evaluation.postfix_evaluation_exception ex) {
            Logger.getLogger(mathematical_expression_evaluation_test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Test
    public void evaluate_expr_two_stack_test(){
        String expr = "( 10 + 5 )";
        int answer = 15;
        int result = problems.data_structures.stack.mathematical_expression_evaluation.evaluate_expression_two_stack(expr);
        assertEquals(answer,result);
        
        expr = "( 10 - 5 )";
        answer = 5;
        result = problems.data_structures.stack.mathematical_expression_evaluation.evaluate_expression_two_stack(expr);
        assertEquals(answer,result);

        expr = "( 10 - 5 ) * ( 10 * 2 )";
        answer = 100;
        result = problems.data_structures.stack.mathematical_expression_evaluation.evaluate_expression_two_stack(expr);
        assertEquals(answer,result);
    }
}
