import java.util.*;
public class AniketShewale_day16 { 
    public static void main(String args[]) 
    { 
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number "); 
        no = sc.nextInt();
        int sum = 0;
        for(int i=1;i<no;i++){
            if(no % i==0){
                // System.out.println(i); 
                sum = sum + i;
            }
        }
         if(no == sum){
            System.out.println("Perfect Number"); 
         }
         else{
            System.out.println("Not a perfect number"); 
         }
    } 
}