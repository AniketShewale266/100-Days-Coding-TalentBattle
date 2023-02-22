import java.util.Scanner;
public class AniketShewale_day36 { 
    public static void main(String args[]) 
    { 
        String str1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:"); 
        str1 = sc.nextLine();
        sc.close();

        String str2="";
        
        for(int i=0;i<str1.length();i++){
            char c = str1.charAt(i);
            if(i == 0 || i == str1.length()-1){
               char ch_lo = Character.toUpperCase(c);
               str2 =  Character.toString(ch_lo);
            }
            else{
                str2 = Character.toString(c);
            }
            System.out.print(str2);
        }
    } 
}