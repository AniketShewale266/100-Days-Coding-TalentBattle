import java.util.Scanner;
public class AniketShewale_day44 { 
    public static void main(String args[]) 
    { 
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:"); 
        size = sc.nextInt();
        int arr1[] = new int[size];
        System.out.println("Enter elements "); 
        for(int i=0;i<size;i++){
            arr1[i] = sc.nextInt();
        }
        sc.close();
        
        int even_cnt = 0;
        int odd_cnt = 0;
        for(int i=0;i<size;i++){
            if(arr1[i] % 2 == 0){
                even_cnt++;
            }
            else{
                odd_cnt++;
            }
        }
        System.out.println("Number of even elements:" +even_cnt);
        System.out.println("Number of odd elements:" +odd_cnt);
        
       
    } 
}