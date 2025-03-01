import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=n;
        int count = String.valueOf(n).length();
        int sum = 0;
        while(n>0){
         int dig = n%10;
         sum += Math.pow(dig, count);
         n=n/10;
        }
        if(num==sum){
          System.out.print("amstrong");
           }else{ 
            System.out.print("not amstrong");
        }
        sc.close();
    }
}

