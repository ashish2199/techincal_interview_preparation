package problems.data_structures.stack;

import data_structures.stack.stack_resizable_array;

/**
 *
 * @author Ashish
 */
public class mathematical_expression_evaluation {
    static int evaluate_expression(String expr) throws Postfix_Evaluation.postfix_evaluation_exception{
        int result = 0;
        String postfix_expr = infix_to_postfix.convert_infix_to_postfix(expr);
        result = Postfix_Evaluation.evaluatePostfixExpression(postfix_expr);
        return result;
    }
    
    /*
        Dijkstra Two Stack algorithm
    */
    static int evaluate_expression_two_stack(String expr){
        stack_resizable_array<Integer> operand_stack = new stack_resizable_array<>();
        stack_resizable_array<String> operator_stack = new stack_resizable_array<>();
        
        String[] tokens = expr.split(" ");
        
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
                if( token.equals("/") || token.equals("*") || token.equals("+") || token.equals("-") || token.equals(")") ){
                    
                    //make sure you perform operation as pop2 _ pop1 and not pop1 _ pop2 because of reversing nature of stack
                    switch(token){
                        case "+": operator_stack.push(token);
                                  break;
                        case "-": operator_stack.push(token);
                                  break;
                        case "*": operator_stack.push(token);
                                  break; 
                        case "/": operator_stack.push(token);
                                  break;                     
                        case ")": int op1 = operand_stack.pop();
                                  int op2 = operand_stack.pop();
                                  int result=0;
                                  String operand=operator_stack.pop();
                                  switch(operand){
                                      case "+": result = op2 + op1;
                                                break;
                                      case "-": result = op2 - op1;
                                                break;
                                      case "*": result = op2 * op1;
                                                break; 
                                      case "/": result = op2 / op1;
                                                break;
                                  }
                                  operand_stack.push(result);
                    }
                }
            }
        }
        return operand_stack.pop();
    }
}
