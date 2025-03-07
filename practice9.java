import java.util.Arrays;
import java.util.Scanner;
 public class practice9 {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      }
      System.out.println(Arrays.toString(arr));
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
        if (arr[i]>arr[j]){
          System.out.println("the leaders are: "+arr[i]);
          break;
        }
       
        }
      }
      sc.close();
   } 
}
