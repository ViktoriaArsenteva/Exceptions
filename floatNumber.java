
import java.util.Scanner;

public class floatNumber {

    public static void main(String[] args) {
        floatNumber();
    }

    public static void floatNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any float number: ");
        try {
            String num = input.nextLine();
            exeptions(num);
            float number = Float.parseFloat(num);
            System.out.println(number);
            
        } 
        catch(NumberFormatException e){
            System.out.println("Please enter only float numbers. Try again");
            floatNumber();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            floatNumber();
        }
        
    }

    public static void exeptions(String number) throws Exception {
        if (number == ""){
            throw new Exception("You entered an empty string.Try again");
            
        }
    }
}
