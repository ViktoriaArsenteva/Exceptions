package Lesson1;
import java.util.Scanner;

public class divide {

    public static void divide() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Find the quotient a/b");
        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();
        int result = a/b;
        System.out.printf("a/b = " + result);
            }
        catch (ArithmeticException e) {
            System.out.println("Sorry. Can't be divided by zero. Try again");
        }
    }
}
