import java.util.Scanner;

 class Car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int day = sc.nextInt();
       if (day <= 3) {
            System.out.println(500*day);
        } else if (day >= 4 && day <= 8) {
            System.out.println(800*day);
        } else if (day >= 9 && day <= 13) {
            System.out.println(1200*day);
        } else {
            System.out.println(1700*day);
        }

        sc.close();
    }
}
