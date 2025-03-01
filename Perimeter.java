import java.util.*;
public class Perimeter {
    public static void perimeter(int length,int width){
        System.out.println( "rectangle perimeter:"+(2*(length+width)));
    }
    public static void perimeter(int side){
        System.out.println("perimeter of a square:"+(4*side));
    }
    public static void perimeter(int side1,int side2,int side3){
        System.out.println("perimeter of a triangle:"+(side1+side2+side3));
    }
    public static void perimeter(double radius){
        System.out.println("perimeter of a circle:"+(2*3.14*radius));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square: ");
            int side=sc.nextInt();
            perimeter(side);
            System.out.print("Enter length and width of rectangle: ");
            int length= sc.nextInt();
            int width= sc.nextInt();
            perimeter(length,width);
            System.out.print("Enter three sides of triangle: ");
            int side1 = sc.nextInt();
            int side2 = sc.nextInt();
            int side3 = sc.nextInt();
            perimeter(side1,side2,side3);
            System.out.print("Enter radius of circle: ");

            double radius =sc.nextDouble();
             perimeter(radius);
             sc.close();
 } 
        

}
    

