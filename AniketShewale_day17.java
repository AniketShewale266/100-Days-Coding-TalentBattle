import java.util.*;
public class AniketShewale_day17 { 
    public static void main(String args[]) 
    { 
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number "); 
        no = sc.nextInt();
        int sum = 0;
        System.out.println("Factors of " +no+ " are"); 
        for(int i=1;i<=no;i++){
            if(no % i==0){
                System.out.print(i+ " "); 
            }
        }
    } 
}