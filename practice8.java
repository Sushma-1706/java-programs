import java.util.*;

 public class practice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        boolean pair=false;

        for (int i = 0; i < N - 1; i++) {  
            if (arr[i] + arr[i + 1] == t) {
                System.out.println(i + " " + (i + 1)); 
                pair = true;
                break;
            }
            if(pair){
                break;
            }
        }

        sc.close(); 
}
 }

