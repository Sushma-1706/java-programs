import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String num = Integer.toString(n);
        String num1="";
        for(int i=num.length()-1;i>=0;i--){
            char ch = num.charAt(i);
           
                num1=num1+ch;
            }
            System.out.println(num1);
            if(num.equals(num1)){
                System.out.print("palindrom");
            }else {
                System.out.print("not a palindrome");
            }
            sc.close();
        }
    }
    

