import java.util.Arrays;
import java.util.Scanner;
public class practice6 {
    public static void leftarray(int[]arr,int k){
    int n = arr.length;
    k=k%n;
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
        temp[i]=arr[i];
        }
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[n-k+i]=temp[i];
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
    
    leftarray(arr, k);
   
        sc.close();
    }
}
