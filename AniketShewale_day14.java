import java.util.*;
public class AniketShewale_day14 { 
    public static void main(String args[]) 
    {
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        no = sc.nextInt();
        int i = 1;
        int rem = 0;
        while(i <= no){
            rem = no % 10;
            no = no / 10;
            System.out.print(rem);
        } 
    } 
}