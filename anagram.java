import java.util.Scanner;
import java.util.Arrays;

public class anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[]ch =a.toCharArray();
        char[]ch1 =b.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        String s1= new String(ch);
        String s2= new String(ch1);
                return s1.equals(s2);
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}