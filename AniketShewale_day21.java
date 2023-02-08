import java.util.Scanner;
public class AniketShewale_day21 { 
    public static void main(String args[]) 
    {
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        no = sc.nextInt();
        int i = 1;
        int rev = 0;
        int rem = 0;
        int temp = no;
        while(i <= no){
            rem = no % 10;
            rev = rev * 10 + rem;
            no = no / 10;
        } 
        if(rev == temp){
            System.out.println("Palindrome");
        }
        else{
             System.out.println("Not a Palindrome");
        }
    } 
}