import java.util.*;
public class AniketShewale_day11 { 
    public static void main(String args[]) 
    { 
        int no,no1=0,no2=1,no3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number ");
        no = sc.nextInt();
        System.out.print(no1+ "," +no2); 
        int i=2;
        while(i < no){
            no3 = no1 + no2;
            System.out.print("," +no3); 
            no1 = no2;
            no2 = no3;
            i++;
        }
    } 
}