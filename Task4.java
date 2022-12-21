import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        string();
    }
    public static void string() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String str = in.nextLine();
        try {
            exeptions(str);
            System.out.println("Hello, "+ str + "!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            string();
        }
        
    }
    public static void exeptions(String str) throws Exception {
        if (str == "") throw new Exception("You entered an ampty string. Try again");
    }
}
