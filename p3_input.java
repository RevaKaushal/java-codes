//***taking INPUTS from user***

import java.util.Scanner;

public class p3_input {
    public static void main(String[] args){
        System.out.println("taking input from user ");
        Scanner s= new Scanner(System.in); //new scanner is a OBJECT and system.in makes it INPUT STREAM
        System.out.println("enter number 1");
        int a =s.nextInt(); 
        System.out.println("enter number 2");
        int b=s.nextInt();
        int sum= a+b;
        System.out.print("the sum is: ");
        System.out.print(sum);
    }
    
}
//s.nextInt ,s.nextFloat, s.hasNextInt etc-->diff methods of taking inputs 
//s.nextInt()  reads just the next integer given by user 
//s.nextLine() reads full line given by user
//s.next()     reads next first string of sentence given by user 
//s.hasNextInt() checks in boolean if input is integer or not 

