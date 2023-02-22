import java.util.Scanner;
public class AniketShewale_day26 { 
    public static void main(String args[]) 
    { 
        int no;
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt();
        sc.close();

        int i = 1;
        int temp = 0;
        int n;
        while(i <= no){
            n = no-i;
            temp = temp + n;
            i++;
        }
        System.out.println(temp);
    } 
}