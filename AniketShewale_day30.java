import java.util.Scanner;
public class AniketShewale_day30 { 
    public static void main(String args[]) 
    {
        String str1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string"); 
        str1 = sc.next(); 
        char ch[]=str1.toCharArray();
        int cnt = 0;
        for(char c : ch)
        {
            cnt++;
        }
        System.out.println("Length of the string = "+cnt);
}
        
}