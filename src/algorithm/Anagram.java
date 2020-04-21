// ANAGRAM OF A STRING
// ANAGRAM:- EXAMPLE-- A = "abc"  B = "cab" A AND B ARE ANAGRAM OF EACH OTHER BECAUSE BOTH OF THESE HAVE SAME LETTERS

package algorithm;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        Anagram execute = new Anagram();
        execute.isAnagram(a,b);
    }

    private void isAnagram(String a, String b)
    {
        boolean isAnagram = true;
        int[] aA = new int[256];  // because there are only 256 characters
        int[] bA = new int[256];
        for(char c: a.toCharArray()) {
            aA[(int) c]++;
        }

        for(char c: b.toCharArray()) {
            bA[(int) c]++;
        }
        for(int i=0; i<256; i++) {
            if(aA[i] != bA[i])
            {
                isAnagram = false;
                break;
            }
        }
        if(isAnagram)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
