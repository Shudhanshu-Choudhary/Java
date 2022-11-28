import java.util.Scanner;

class LeapYear {
    static void isLeapYear (int year) {
       if (year % 4 == 0) {
         System.out.println(year + " is a leap year." );
       } else {
         System.out.println(year + " is not a leap year." );
       }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year = scan.nextInt();
        isLeapYear(year);
        scan.close();
    }
}