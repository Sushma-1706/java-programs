import java.util.Scanner;
import java.util.Arrays;
public class practice4 {
    public static int dulicate(int[]arr){
    Arrays.sort(arr);
int newArray=1;
for(int i=0;i<arr.length-1;i++){
    if(arr[i]!=arr[i+1]){
        arr[newArray]=arr[i+1];
        newArray++;
    }
}

return newArray;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Before: "+Arrays.toString(arr));
        int uniquearray=dulicate(arr);
        System.out.println("new array " +Arrays.toString(Arrays.copyOf(arr,uniquearray)));
        sc.close();
    }
    
}
