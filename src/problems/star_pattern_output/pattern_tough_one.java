package problems.star_pattern_output;
public class pattern_tough_one {

    /*
    Thanks to Rohit Yadav for the question
    
    Program to print the following pattern for a given value of n>0
    
    n=1   
                        *
    
    n=2 
                        *
                      * *
    
    n=3 
                        *
                     *  *
                   * *  *
    
    n=4
                        *   
                    *   *   
                 *  *   *   
               * *  *   *    
    
    n=5
    0                    *   space at starting = 14  s=5
    1               *    *   space at starting =  9  s=4
    2           *   *    *   space at starting =  5  s=3
    3        *  *   *    *   space at starting =  2  s=2
    4      * *  *   *    *   space at starting =  0  s=1
    
    We observe that the number of spaces between the stars is increasing 1 each time.
    The pattern for space at starting is 0,2,5,9,14 that is that is prev+2,prev+3,prev+4,prev+5
    
    */
      
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int n){
        for (int i = 0; i < n; i++) {
            printStartingSpace(n-i);
            printRow(i,n);
        }
    }
    public static void printRow(int i,int n){
        
        for (int j = 0; j <= i; j++) {
            System.out.print("*");
            for (int k = 0; k <= n-i+j; k++) {
                if( n-i+j != n ){
                    System.out.print(" ");
                }
            }
        }
        System.out.println("");
    }
    public static void printStartingSpace(int i){
        int space =0;
        for (int j = 2; j < i+2; j++) {
            space=space+j;
        }
        for (int j = 0; j < space; j++) {
            System.out.print(" ");
        }
    }
}
