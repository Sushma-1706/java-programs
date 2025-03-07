import java.util.Scanner;
import java.util.Arrays;
public class practice2 {
    public static int[] findsecondlarge(int[]arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int min=arr[0];
       int max=arr[arr.length-1];
        for(int j=0;j<arr.length;j++){
                if(arr[j]>min){
                    min=arr[j];
                    break;
                    }
                }
                for(int i=arr.length-1;i>=0;i--){
                    if(arr[i]<max){
                    max=arr[i];
                    break;
                    }
                }
        return new int[]{min,max};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        System.out.println("Array: "+Arrays.toString(arr));
       int[] result= findsecondlarge(arr);
        
                System.out.println("second min: "+result[0]);
                System.out.println("second max: "+result[1]);
        sc.close();
    }
    
}
