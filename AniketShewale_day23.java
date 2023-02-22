import java.util.Scanner;
public class AniketShewale_day23 { 
    public static void main(String args[]) 
    { 
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number "); 
        no = sc.nextInt();
        // System.out.println(no + " is of type " + ((Object)no).getClass().getSimpleName());   
        // 310020 = 311121
        String str=String.valueOf(no);  
        // System.out.println(str + " is of type " + str.getClass().getSimpleName()); 
        
        String str1 = str.replace("0","1");
        System.out.println(str1); 


      
    } 
}