package problems.star_pattern_output;

/*
    Pattern of stars - it is made up of two triangles one is straight other is inverted.

       *        L-0 Sp-3
      * *       L-1 Sp-2
     * * *      L-2 Sp-1
    * * * *     L-3 Sp-0
     * * *      L-4 Sp-1
      * *       L-5 Sp-2
       *        L-6 Sp-3

    We will be using two for loops one for printing the upper traingle and 
    another one for printing the inverted triangle
    The inverted triangle has one less number of line than the upper traingle.
    
    Here N = Number of lines for upper triangle
    
    To print the triangle:

        DO the following for number of lines
            we first print the starting spaces which are given by sp = N-i-1

            We then print the starts with a space while keeping in check that 
            we donot print a space at the end

        To print inverted triangle just do the reverse of the above with some 
        minor changes.
*/


/**
 *
 * @author Ashish
 */
public class pattern_double_triangle_stars {
    public static void main(String[] args) {
        //here we are passing number of lines we want in upper triangle
        printPattern(4);
    }
    
    public static void printPattern(int N){
        //we would be using two loops one for upper triangle and other for inverted traingle
        
        int sp=0;
        //for printing the upper triangle
        //Here i represents line number
        for (int i = 0; i < N; i++) {
            sp=N-i-1;
            //prints leading space
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            
            //we donot print the space at the end of line.
            for (int j = 0; j <= i; j++) {
                String ending_sp = (j!=i)?" ":""; 
                System.out.print("*"+ending_sp);
            }
            System.out.println("");
        }
        
        //for printing the inverted triangle
        
        //here we want to run one less time so we use N-1 instead of N
        for (int i = N-1; i > 0; i--) {
            sp=N-i;
            //prints leading space
            for(int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            
            for(int j = 0; j < i; j++) {
                String ending_sp = (j!=i)?" ":""; 
                System.out.print("*"+ending_sp);
            }
            System.out.println("");
        }
        
    }
}
