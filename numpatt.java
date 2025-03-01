import java.util.Scanner;

public class numpatt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for (int i = 1; i <= n; i++) { // Loop from 1 to n
            for (int j = 1; j <= n; j++) { // Loop from 1 to n
                System.out.printf("%03d ", i * j); // Print values with 2-digit formatting
            }
            System.out.println(); // Move to the next line
        }
    }
}
