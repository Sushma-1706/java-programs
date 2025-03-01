import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            char ch = sc.next().charAt(0);
            switch(ch){
                case '+':
                System.out.print("add");
                break;
                case '-':
                System.out.print("sub");
                break;
                case'*':
                System.out.print("mul");
                break;
                case '/':
                System.out.print("div");
                break;
                default:
                System.out.print("nill");
                


            }
            sc.close();
        }
    }

