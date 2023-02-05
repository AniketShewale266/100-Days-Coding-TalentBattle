import java.util.*;
public class AniketShewale_day18 { 
    public static void main(String args[]) 
    {
        int X1,X2,Y1,Y2,X3,Y3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of X1:"); 
        X1 = sc.nextInt();
        System.out.print("Enter value of Y1:"); 
        Y1 = sc.nextInt();
        System.out.print("Enter value of X2:"); 
        X2 = sc.nextInt();
        System.out.print("Enter value of Y2:"); 
        Y2 = sc.nextInt();
        X3 = (X1*Y2) + (X2*Y1);
        Y3 = (Y1*Y2);
        int ans = X3 % Y3;
        if(ans == 0){
        System.out.println(X3/Y3+ "/" +1);
        }
        else{
            System.out.println(X3+ "/" +Y3);
        }
    } 
}