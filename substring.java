
import java.util.Scanner;

public class substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String substr = S.substring(start,end);
        System.out.print(substr);
        in.close();
    }
}