package problems.data_structures.stack;
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
}
