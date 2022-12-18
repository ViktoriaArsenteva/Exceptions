package Lesson1;

import java.util.Scanner;

public class rectangle {
    public static void ractangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Finding the surface area of a rectangle");
        System.out.print("a = ");
        String a = input.nextLine();
        System.out.print("b = ");
        String b = input.nextLine();
        try {
            ex(a, b);
            int result = Integer.parseInt(a) * Integer.parseInt(b);
            System.out.println("surface area of a rectangle = "+ result);
        }
        catch(NumberFormatException e){
            System.out.println("Please enter only numbers. Try again");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
   
    public static void ex(String a, String b) throws Exception {
        if ((a == "") | (b == "")) {
            throw new Exception("One or both numbers are missing. Try again");
        }
        if ((Integer.parseInt(a) < 0) | (Integer.parseInt(b) < 0)) {
            throw new Exception("Please enter positive numbers");
        }
        
        
    }
    
    
}
