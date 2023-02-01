import java.util.*;
public class AniketShewale_day15 { 
    public static void main(String args[]) 
    {
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number "); 
        no = sc.nextInt();
        int rem,total=0;
        int temp = no;
        while(no != 0){
            rem = no % 10;
            int fact = 1;
            for(int j=1;j<=rem;j++){
                fact = fact * j;
            }
            total = total + fact;
            no = no / 10;
        }
        if(total == temp){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not a strong number");
        }
    } 
}