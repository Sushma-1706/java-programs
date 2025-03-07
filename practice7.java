import java.util.Arrays;
import java.util.Scanner;
public class practice7 {
    public static void rightarray(int[]arr,int k){
    int n = arr.length;
    k=k%n;
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
        temp[i]=arr[n-k+i];
        }
        for(int i=n-k-1;i>0;i--){
            arr[i+k]=arr[i];
        }
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        System.out.println("After: "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int[]arr=new int[n];
     int k= sc.nextInt();
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("before: "+Arrays.toString(arr));
    
    rightarray(arr, k);
   
        sc.close();
    }
}
