// Java Program to check if the arrays are equal
import java.util.Scanner;
public class AniketShewale_day42 {
	
	public static void main(String[] args)
	{
		int firstSize,secondSize;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array:"); 
        firstSize = sc.nextInt();
        System.out.println("Enter the size of second array:"); 
        secondSize = sc.nextInt();

        int arr1[] = new int[firstSize];
        int arr2[] = new int[secondSize];

        System.out.println("Enter elements of first array:");
        for(int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of second array:"); 
         for(int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }

		boolean result = true;
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i = i + 1) {
				if (arr1[i] != arr2[i]) {
					result = false;
				}
			}
		}
		else {
			result = false;
		}

		if (result == true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
	}
}
