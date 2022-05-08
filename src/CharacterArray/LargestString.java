package CharacterArray;

import java.util.Scanner;

public class LargestString {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();

        String str;
        String largest = null;

        int largest_len = 0;

        while (n-- > 0) {
            str = scn.nextLine();
            int len = str.length();
            if (len > largest_len) {
                largest_len = len;
                largest = str;
            }
        }
        System.out.println(largest);
    }
}
/*
INPUT:
3
hello world good morning!
i love coding!
largest sentence
OUTPUT:
hello world good morning!
 */
