import java.util.Scanner;
public class stringpractice2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char [] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                if(c[i]!=c[j]){
                   sc.close();
                }
            }
        }
    }
}
