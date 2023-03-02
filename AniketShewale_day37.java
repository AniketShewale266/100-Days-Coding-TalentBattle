import java.util.Scanner;
public class AniketShewale_day37 { 
    public static void main(String args[]) 
    { 
        String str1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: "); 
        str1 = sc.nextLine();

        int[] freq = new int[256];
        for(int i=0;i<str1.length();i++){
            char c = str1.charAt(i);
            freq[c]++;
        }

         for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.println((char) i + ": " + freq[i]);
            }
        }
    } 
}