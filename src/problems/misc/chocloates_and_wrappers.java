package problems.misc;
/**
 *
 * @author Ashish
 */

/*
Problem : 
Cost of one chocolate is Rs.1 and as a special promotion scheme 
you get 1 toffee for three wrappers. How many chocolates you can get in Rs.45?

Rs 45 = 45 chocolates (it will result of 45 wrappers)
45 wrappers = 15 chocolate (it will result in additional 15 wrappers)
15 wrappers = 5 chocolate (it will result in additional 5 wrappers)
3 wrappers = 1 chocolate (it will result in 1 wrapper + 2 remaining from step 3)
3 wrappers = 1 chocolate (it will result in additional 1 wrapper but we have to throw it)
Total = 45+15+5+1+1 = 67

for  15 rupees 
we get 15 chocolates. on returning 15 wrappers you get 5  chocolates.
on returning 3 wrappers (keeping two wrappers in hand) you get 1 chocolate.
now this one  chocolate. wrapper and the twp wrapers you had will add on three.
atlast on returning 3 wrappers you get 1 chocolate.
i.e.,   15+5+1+1 = 22

The solution to maintain the state of cofee if we are allowed to use only R,W 
as input is to declare a variable T inside function and make function so that 
we get value of T after recursive calls.


*/
public class chocloates_and_wrappers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("For rs 15 we get "+ calcChocolates(15, 0));
    
        System.out.println("For rs 45 we get "+ calcChocolates(45, 0));
    
    }
    
    static int calcChocolates(int R, int W){
        //R - rupess we are given and W - wrappers we have
        //T - number of toffees
        int C=0;
        
        //base condition
        if( R==0 && W<3){
            return 0;
        }
        
        //Buy chocolates using money
        C = C + R;
        W = W + R;
        R = 0;
        
        //exchange wrappers for tofees
        if(W>=3){
            //exchange wrappers for chocolate
            int exch_C = W/3;
            C = C + exch_C;
            
            //Get the remaining wrappers which will be less than 3
            int Remaining_W = W%3;
            
            //Add the wrappers obtained from the exchanged tofees
            W = Remaining_W + exch_C;
        }
        
        return C + calcChocolates(R, W);
    }
}
