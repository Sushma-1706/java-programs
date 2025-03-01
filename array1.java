import java.util.*;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for ( int i=0;i<n;i++){
        arr[i]= sc.nextInt();
        }

         Arrays.sort(arr);
        // int min=arr[0];
        // int max=arr[arr.length-1];
        
        // System.out.print(max+" ");
        // System.out.print(min);
    //     int min=0;
    //     int max=0;
    //   for(int i=0;i<arr.length;i++){
    //     if (arr[i]>max){
    //     max=arr[i];
    //     }
    //     if( arr[i]<min){
    //         min= arr[i];
    //     }
    //   }
    //   System.out.print(max);
    // //   Arrays.sort(arr);
    //   for(int i=n-1;i>=0;i--){
    //      System.out.print(arr[i]+" ");
    //   }

       
        sc.close();

        
    }
}
    

