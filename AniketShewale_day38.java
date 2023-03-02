import java.util.Scanner;

public class AniketShewale_day38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        int[] freq = new int[256];

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            freq[c]++;
        }

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (freq[c] == 1) {
                System.out.print(c + " ");
            }
        }
    }
}
