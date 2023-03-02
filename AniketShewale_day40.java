import java.util.Scanner;
public class AniketShewale_day40 { 
    public static void main(String args[]) 
    { 
        String str1,str2,str3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:"); 
        str1 = sc.nextLine();
        System.out.println("Enter the substring to be removed"); 
        str2 = sc.nextLine();

        String stringRemove = str1.replace(str2,"");

        System.out.println("Enter the new substring"); 
        str3 = sc.nextLine();

        String newString = str3+stringRemove;
        System.out.println("The new string: "+newString); 
    } 
}