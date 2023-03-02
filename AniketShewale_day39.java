import java.util.Scanner;
import java.util.Arrays;
public class AniketShewale_day39 { 
    public static void main(String args[]) 
    { 
        String str1,str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string"); 
        str1 = sc.nextLine();
        System.out.println("Enter second string"); 
        str2 = sc.nextLine();

        if(AnagramChecker(str1,str2)){
            System.out.println("Anagram"); 
        }
        else{
            System.out.println("Not a Anagram"); 
        }
    } 

    public static boolean AnagramChecker(String str1,String str2){
        if (str1.length() != str2.length()) {
            return false;
        }
 
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            boolean result = Arrays.equals(arr1, arr2);
            return result;
    }
}