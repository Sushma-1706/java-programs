import java.util.Scanner;

public class strings {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        String C=A.concat(B);
        System.out.println(C.length());
        
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
  String cap=A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase();      
  String cap1=B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase();   
  System.out.println(cap+" "+cap1);   
        sc.close();
    }
}

