import java.util.Scanner;

public class Watermellon {
    
public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        
        if (w % 2 == 0 && w!=2) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }

        sc.close(); // Close the scanner
    }
}

