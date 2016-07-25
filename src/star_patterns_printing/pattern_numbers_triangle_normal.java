package star_patterns_printing;
public class pattern_numbers_triangle_normal {
    /*
    Pattern to be printed
    
        1
        3*2
        4*5*6
        10*9*8*7
        11*12*13*14*15
        21*20*19*18*17*16
    
    We can observe that it starts from 1 
    Each line has as many numbers as the line number so line 4 has 4 numbers
    In Odd number lines the numbers are incrementing
    In Even numbered lines the numbers are printing in reverse order that is 
    in line number 2,4,6,8 and so on
    
    Input- N the number of line to be printed
    Output- The pattern
    */

    public static void main(String[] args) {
        printPattern(6);
    }
    public static void printPattern(int N){
        /*  
        use two variables to mark the starting and the end 
        for the numbers in each line
        */
        int start = 1;
        int end;
        
        for (int i = 0; i <= N; i++) {
            
            //end will be from start till start+line number
            end = start + i;
            
            if(i%2==0){ //when its a even line
                
                //print in normal order
                for (int j = start; j <= end; j++) {
                    if(j!=end){
                        System.out.print(j+"*");
                    }
                    else{   //when its the last number of the line
                        System.out.print(j+"");
                    }
                }
            }
            else{   //when its a odd line
                
                //print in reverse order
                for (int j = end; j >= start; j--) {
                    if(j!=start){
                        System.out.print(j+"*");
                    }
                    else{   //when its the last number of the line
                        System.out.print(j+"");
                    }
                }
            }
            
            start = end+1;  // so that in next line we start from next number
            
            System.out.println("");     //we start the next line from a new line
        }
    }
}
