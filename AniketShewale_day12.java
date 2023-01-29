import java.util.*;
public class AniketShewale_day12 { 
    public static void main(String args[]) 
    { 
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number"); 
        no = sc.nextInt();
        int i=0;
        int sum = 0;
        int rem;
        while(i < no){
            rem = no % 10;
            // System.out.println("rem "+rem); 
            sum = sum + rem;
            no = no /10;
        }
        System.out.println("Sum of digit is " + sum);
    } 
}