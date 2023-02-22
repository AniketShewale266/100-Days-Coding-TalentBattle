import java.util.Scanner;
public class AniketShewale_day32 { 
    public static void main(String args[]) 
    {
        String str1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:"); 
        str1 = sc.next();
        sc.close();

        String str2 = "";
        str2 = str1.replaceAll("[aeiou]", ""); 
        System.out.println(str2); 
    } 
}