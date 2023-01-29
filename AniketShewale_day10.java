import java.util.*;
public class AniketShewale_day10 { 
    public static void main(String args[]) 
    { 
        int no;
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter a Number "); 
        no = sc.nextInt();
        int i = 1;
        int fact = 1;
        while(i <= no){
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial is "+ fact);
    } 
}