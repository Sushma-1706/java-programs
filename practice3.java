import java.util.Scanner;
import java.util.Arrays;
public class practice3 {
    public static boolean isSorted(int[]arr){
        Arrays.sort(arr);
        System.out.println("After sorting:"+Arrays.toString(arr));
       
        for(int i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
           return false; 
         
        }
    }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Before sort: "+Arrays.toString(arr));
       boolean sorted = isSorted(arr);
        if(sorted){
            System.out.println("The array is sorted ");
        }else{
            System.out.println("the array is not sorted");   
        }
        sc.close();
    }
    
}
