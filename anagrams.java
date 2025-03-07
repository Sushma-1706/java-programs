import java.util.Scanner;
public class anagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string1:");
        String s1=sc.next();
        System.out.println("Enter the string2:");
        String s2=sc.next();
        char c[]=s2.toCharArray();
        String st="";
        for(char i:c){
            if(s1.indexOf(i)!=-1 && s2.indexOf(i)!=-1){
                st=" it is a Anagram";
            }
            else{
                st="Not an anagram";
            }
        }
        System.out.println(st);
        sc.close();
    }
}
