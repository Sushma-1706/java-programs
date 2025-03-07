import java.util.Scanner;
import java.util.Arrays;
public class practice {
    public static int[] findsmallandlarge(int arr[]){
        Arrays.sort(arr);
        System.out.println("After sort"+Arrays.toString(arr));
        int min =arr[0];
        int max=arr[arr.length-1];
        return new int[]{min,max} ;
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
           
        }  
        System.out.println("Before sort"+Arrays.toString(arr));
       int[] result= findsmallandlarge(arr);
        
                System.out.println("small  "+result[0]);
                System.out.println("large  "+result[1]);
                sc.close();

        }
    }

