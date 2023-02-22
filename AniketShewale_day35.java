import java.util.Scanner;
public class AniketShewale_day35 { 
    public static void main(String args[]) 
    {
        String str1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string containing numbers:"); 
        str1 = sc.nextLine();
        sc.close();

        int sum = 0;
        for(int i=0;i<str1.length();i++){
            char c = str1.charAt(i);

            if(Character.isDigit(c)){
                int value = Integer.parseInt(String.valueOf(c));
                sum = sum + value;
            }
        }
         System.out.println("sum of numbers in the string: "+sum); 
    } 
}