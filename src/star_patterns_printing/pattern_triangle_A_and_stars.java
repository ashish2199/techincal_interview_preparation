package star_patterns_printing;
public class pattern_triangle_A_and_stars {
/*  
    convert pattern into boxes and objserve the position of stars and spaces
    outer loop = number of lines that is i
        leading spaces are of the form 6,4,2,0 for N=4 so 
        that is (2*N)-2*i where N is the line number
    
        even position "A "
        odd position "* "
    newline after the end of iteration of outer loop

The pattern to be generated
    
      *         //Line- 0 SP- 6 
    * A *       //Line- 1 SP- 4
  * A * A *     //Line- 2 SP- 2
* A * A * A *   //Line- 3 SP- 0
    
*/
    
    public static void main(String[] args) {
        printPattern(4);
    }

    public static void printPattern(int N) {
        for(int i =0 ; i<N;i++){
            for(int j = (2*N-2)-i*2;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k = 2*i+1;k>0;k--)
            {
                if(k%2==1){System.out.print("* ");}
                if(k%2==0){System.out.print("A ");}
            }
            System.out.println("");
        }
    }
    
}
