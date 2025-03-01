import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int reverse = 0;
         while (n>0){
         var dig = n%10;
           reverse = reverse*10+dig;
           n=n/10;
           System.out.print(dig);
        }
sc.close();
   }  
}
