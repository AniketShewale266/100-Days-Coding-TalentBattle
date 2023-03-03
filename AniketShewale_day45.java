import java.util.Scanner;
public class AniketShewale_day45 { 

    public static int mySmallest(int[] arr1) {
        int min = arr1[0];
        for(int i=1;i< arr1.length;i++){
            if(arr1[i] < min){
                min = arr1[i];
            }
            
        }
        return min;
      }
      public static int myLargest(int[] arr1) {
        int max = arr1[0];
        for(int i=1;i< arr1.length;i++){
            if(arr1[i] > max){
                max = arr1[i];
            }
            
        }
        return max;
      }
    public static void main(String args[]) 
    { 
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array"); 
        size = sc.nextInt();
        int arr1[] = new int[size];
        System.out.println("Enter elements "); 
        for(int i=0;i<size;i++){
            arr1[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Smallest Elements "+ mySmallest(arr1)); 
        System.out.println("Largest Elements "+ myLargest(arr1)); 

    }

}