import java.util.Scanner;

public class SumOfNnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        char num;
        System.out.println("To End Press x: ");
        System.out.print("Enter the Number: ");
        while((num = in.next().charAt(0)) != 'x'){ 
            int numericValue = Character.getNumericValue(num);
            sum += numericValue;
        }
        {
            System.out.println("The Sum of all number is " + sum);
            System.exit(1);
            in.close();
        }
    }
}
