import java.util.Scanner; 
public class p4 {
    public static void main(String[] args){
        System.out.print("enter you eng marks: ");
        Scanner s= new Scanner(System.in);
        int e=s.nextInt();
        System.out.print("enter you maths marks: ");
        int m=s.nextInt();
        System.out.print("enter you physics marks: ");
        int p=s.nextInt();
        System.out.print("enter you chem marks: ");
        int c=s.nextInt();
        System.out.print("enter you cs marks: ");
        int cs=s.nextInt();
        System.out.println("your aggregate is: ");
        double agg= (e+m+p+c+cs)/5;
        System.out.println(agg);
    }
    

}
