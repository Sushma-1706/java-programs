import java.util.Scanner;
import java.util.Arrays;
public class practice1 {
    public static void reversearray (int[]arr){
        Arrays.sort(arr);
        System.out.println("After sorting: "+Arrays.toString(arr));
      return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before sorting: "+Arrays.toString(arr)); 
        reversearray(arr);
        sc.close();
    }

}
