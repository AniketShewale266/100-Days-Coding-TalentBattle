import java.util.Scanner;
public class AniketShewale_day28 { 
    public static void main(String args[]) 
    { 
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string "); 
        str = sc.next();

        String reverseStr = "";
        for(int i=0;i<str.length();i++){
            reverseStr = str.charAt(i) + reverseStr;
        }
        
        System.out.println("Reverse String is:"+reverseStr); 
    } 
}