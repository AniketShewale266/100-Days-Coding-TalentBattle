import java.util.Scanner;
public class AniketShewale_day25 { 
    public static void main(String args[]) 
    { 
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: "); 
        r = sc.nextInt();
        sc.close();
        double area = (3.14 * r * r);
        System.out.print("Area of Circle is "+area); 
    } 
}