import java.util.*;
public class AniketShewale_day13{ 
    public static void main(String args[]) 
    {
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number "); 
        no = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= no){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of first " + no + " natural numbers is "+sum);
    } 
}