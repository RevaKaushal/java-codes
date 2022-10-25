//trial of boolean method of sc object
import java.util.Scanner;
public class p3a_input {
    public static void main(String[] agrs){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a integer ");
        boolean a= sc.hasNextInt();  //or sc.hasNextFloat etc
        System.out.print(a);
    }
}

//INCREMENTION 
/*System.out.println("enter int ")
  int a=sc.nextInt();        
  System.out.parintln(a);    5
  System.out.parintln(++a);  6
  System.out.parintln(a++);  6
  System.out.parintln(a);    7

  char ch='a';
  System.out.print(++ch);   //a ka increment is b
                            //b k increment is c and so on 
 */