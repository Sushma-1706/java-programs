import java.util.Arrays;
import java.util.Scanner;
public class practice10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    int maxdiff=0;
    for(int i=0;i<n;i++){
    for(int j=1;j<n;j++){
    int diff=arr[j]-arr[i];
           if(diff>maxdiff){
            maxdiff=diff;
           }

        }
    }
    System.out.println(maxdiff);
    sc.close();
    }
    
    }
   

