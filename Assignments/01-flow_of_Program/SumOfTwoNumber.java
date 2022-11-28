import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Taking the 1st number from Terminal
        System.out.print("Enter the 1st Number: ");
        int Num1 = in.nextInt();
        System.out.println("");
        // Taknig the 2nd Number from the Terminal
        System.out.print("Enter the 2nd Number: ");
        int Num2 = in.nextInt();
        
        int Sum = Num1 + Num2;
        System.out.println(Num1 + " + " + Num2 + " = " + Sum);
    }
}
