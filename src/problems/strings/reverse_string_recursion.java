package problems.strings;
import java.util.Scanner;
public class reverse_string_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String inp = sc.nextLine();
        String revstr = reverse(inp);
        System.out.println("The reverse of string is "+revstr);
    }
    
    //what we are actually doing is taking last character from string then recursing the remainging string which gives us second last character and so on
    //which we concatenate and return it.
    static String reverse(String str){
        if(str.length()==1){
            return str;
        }
        else{
            /* here it will be called on 0 to str.length()-2 as
            substring(m,n) works from m to n-1 */
            return str.charAt(str.length()-1) + reverse(str.substring(0, str.length()-1));
        }
    }
}

