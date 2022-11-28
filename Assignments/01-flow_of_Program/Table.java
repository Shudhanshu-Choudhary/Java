import java.util.Scanner;

public class Table {
    static void PrintTable(int Num) {
        for(int i = 1; i<= 10; i++){
            int prod = Num * i;
            System.out.println(Num + " * " + i + " = " + prod);
        }
    } 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int Num = in.nextInt();
        PrintTable(Num);
        in.close();
    }
}
