import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word1: ");
        String word1 = sc.nextLine();

        System.out.print("Enter word2: ");
        String word2 = sc.nextLine();

        char[] a = word1.toLowerCase().toCharArray();
        char[] b = word2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Word1 and Word2 are Anagrams");
        } else {
            System.out.println("Word1 and Word2 are Not Anagrams");
        }

        sc.close();
    }
}