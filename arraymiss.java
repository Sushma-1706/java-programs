import java.util.*;
public class arraymiss {
 public static void main(String [] args){
    Scanner sc =new Scanner (System.in);
    
    int arr[]={1,2,4,5};
   
    
    int n=sc.nextInt();
    int actuallSum= n*(n+1)/2;
    int excepted=0;
    for(int i=0;i<arr.length;i++){
        excepted += arr[i];

    }
    int sum = actuallSum-excepted;
    System.out.println("sum" +sum);
    sc.close();
 }   
}
