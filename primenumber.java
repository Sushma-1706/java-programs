import java.util.Scanner;
public class primenumber{
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int count=0;
       for(int i=0;i<=n;i++){
        if(i%2!=0){
            count++;
           }       
         }

        if (count==2){
            System.out.print("prime number");
        }else{
            System.out.print("not prime");
        }

       sc.close();
    }
    
}