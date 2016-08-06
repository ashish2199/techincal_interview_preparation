/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems.data_structures.stack;
import data_structures.stack.stack_resizable_array;
/**
 *
 * @author Ashish
 */
public class Postfix_Evaluation {
    static int evaluatePostfixExpression(String postfix_expr) throws postfix_evaluation_exception{
        stack_resizable_array<Integer> operand_stack = new stack_resizable_array<>();
            
            String[] tokens = postfix_expr.split(" ");
        
            for (int i = 0; i < tokens.length; i++) {
                String token = tokens[i];
            
                try
                {
                    int operand = Integer.parseInt(token);
                    operand_stack.push(operand);
                }
                catch(NumberFormatException nfe)
                {
                    
                    //operator is found
                    if( token.equals("/") || token.equals("*") || token.equals("+") || token.equals("-") ){
                        int op1 = operand_stack.pop();
                        int op2 = operand_stack.pop();
                        int result = 0;

                        //make sure you perform operation as pop2 _ pop1 and not pop1 _ pop2 because of reversing nature of stack
                        switch(token){
                            case "+": result=op2+op1;
                                      break;
                            case "-": result=op2-op1;
                                      break;
                            case "*": result=op2*op1;
                                      break; 
                            case "/": result=op2/op1;
                                      break;                             
                        }
                        operand_stack.push(result);
                    }
                }
                 
            }
        if(operand_stack.getSize()==1){
            return operand_stack.pop();
        }
        else{
            System.out.println("Error occured");
            throw new postfix_evaluation_exception();
        }
    }
    
    static class postfix_evaluation_exception extends Exception{

        @Override
        public String toString() {
            return super.toString()+"\n\n The stack contained more than one result"; //To change body of generated methods, choose Tools | Templates.
        }
    }
}
