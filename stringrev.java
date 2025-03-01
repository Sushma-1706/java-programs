import java.util.Scanner;

public class stringrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        StringBuilder sb = new StringBuilder(str);
       sb.reverse();
        //System.out.println("after rev:"+sb);
         if (sb.toString().equals(str)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
        sc.close();
    }
}




    
    

