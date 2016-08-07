package problems.data_structures.stack;

import data_structures.stack.stack_resizable_array;

/*
Algo - 
1.Scan the infix expression from left to right 
Repeat
2.If number is found then add it to postfix operation
3.If any operator of higher precedence than stack top is found then add it stack
4.If any operator of lower precedence than stack top is found then pop the 
higher precedence operator and add it to postfix expr and add the lower precedence operator to stack.
5.If ')' closing brack it encountered then pop all the elements of stack up ttil a '(' opening bracket is found.

At the make the stack empty and add all operator to postfix expr

Complexity - O(N^2)  because there is a while loop inside the for loop which runs with complexity O(N) 
*/
public class infix_to_postfix {
    
    static String convert_infix_to_postfix(String infix){
        String postfix = "";
        stack_resizable_array<String> operator_stack = new stack_resizable_array<>();
        String[] tokens = infix.split(" ");
            
        // O(N)
        for (int i = 0; i < tokens.length; i++)
        {
            String token = tokens[i];
            try
            {
                int operand = Integer.parseInt(token);
                postfix += operand+" ";
            }
            catch(NumberFormatException nfe)
            {
                String temp_top;
                switch(token)
                {
                    case "+" :  if(operator_stack.isEmpty()){
                                    operator_stack.push(token);
                                }
                                else
                                {
                                    temp_top = operator_stack.pop();
                                    //check for precedence
                                    if(temp_top.equals("*")||temp_top.equals("/")){
                                        postfix += temp_top+" ";
                                        operator_stack.push(token);
                                    }
                                    else
                                    {
                                        operator_stack.push(temp_top);
                                        operator_stack.push(token);
                                    }
                                }
                                break;

                    case "-" :  if(operator_stack.isEmpty()){
                                    operator_stack.push(token);
                                }
                                else
                                {
                                    temp_top = operator_stack.pop();
                                    //check for precedence
                                    if(temp_top.equals("*")||temp_top.equals("/")){
                                        postfix += temp_top+" ";
                                        operator_stack.push(token);
                                    }
                                    else
                                    {
                                        operator_stack.push(temp_top);
                                        operator_stack.push(token);
                                    }
                                }
                                break;

                    case "*" :  operator_stack.push(token);
                                break;

                    case "/" :  operator_stack.push(token);
                                break;

                    case "(" :  operator_stack.push(token);
                                break;

                                // O(N)
                    case ")" :  while(!operator_stack.isEmpty()){               
                                    String tmp_operator=operator_stack.pop();
                                    if(tmp_operator.equals("(")){
                                        break;
                                    }
                                    else{
                                        postfix += tmp_operator+" ";
                                    }
                                }
                }
            }
        }
         
        // O(N)    
        while(!operator_stack.isEmpty()){
            String tmp_operator=operator_stack.pop();
            postfix += tmp_operator+" ";
        }
        
        postfix=postfix.trim();
        return postfix;
    }
}
