import java.util.Scanner;
public class stringpractice1 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[]chararray = s.toCharArray();
    int left = 0;
    int right = chararray.length-1;
    while(left<right){
        char temp = chararray[left];
        chararray[left]=chararray[right];
        chararray[right]= temp;
        left++;
        right--;
        }
    String str = new String(chararray); 
    System.out.println(str);
    sc.close();
    
   } 
}
