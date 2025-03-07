import java.util.Scanner;
import java.util.Arrays;
public class practice5{
    public static void zerotoend(int[]arr){
        Arrays.sort(arr);
       System.out.println("After sort: "+Arrays.toString(arr));
       int noindex=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            arr[noindex]=arr[i];
            noindex++;
        }
       }
       while(noindex<arr.length){
        arr[noindex]=0;
        noindex++;
       }
       System.out.println("After: "+Arrays.toString(arr));
    
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int []arr=new int[n];
        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before: "+Arrays.toString(arr));
        zerotoend(arr);
        sc.close();
    }
}