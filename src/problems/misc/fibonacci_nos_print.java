package problems.misc;
/**
 *
 * @author Ashish
 */
public class fibonacci_nos_print {
    static String print_fibonacci_nos_upto_N_iterative(int N){
        int first = 0;
        int second = 1;
        String sequence = "0 1 ";
        if(N==1){
            sequence="0";
            return sequence;
        }
        if(N==2){
            sequence="0 1";
            return sequence;
        }
        while( N-2 > 0 ){
            int k = first+second;
            first = second;
            second = k;
            
            sequence += k ;
            sequence += (N-2)>1?" ":"";
            N--;
        }
        return sequence;
    }
    
    static String print_fibonacci_nos_upto_N_recursive(int N){
        String sequence ="";
        for (int i = 1; i <= N; i++) {
            sequence += fibonacci(i);
            sequence += (i==N)?"":" ";
        }
        return sequence;
    }
    static int fibonacci(int n){
        if(n==1)return 0;
        if(n==2)return 1;
        return (fibonacci(n-1)+fibonacci(n-2));
    }
}
