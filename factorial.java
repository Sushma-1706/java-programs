import java.util.*;
public class factorial {
    public static int factorialnumber(int n){
        
        if( n==0||n==1){
            return 1;
    
    } int fact=1;
    for(int i=2;i<=n;i++){
        fact*=i;
    }
           return fact;
    }
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
          int factorial1= factorialnumber(n);
           if(factorial1!=0){
            System.out.println("factorial"+factorial1);
           }
           sc.close();
           
   } 

}        