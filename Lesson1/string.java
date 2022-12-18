package Lesson1;
import java.util.Scanner;

public class string {

    public static void string() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter any word: ");
            String str = input.nextLine();
            System.out.println("What letters to swap?");
            int a = input.nextInt();
            int b = input.nextInt();
            String[] c = str.split("");
            String store = c[a];
            c[a] = c[b];
            c[b] = store;
            str = "";
            for(int i = 0; i < c.length; i++) { str+=c[i]; }
            System.out.println(str);
            
        } 
        catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid value entered. Indexing starts from 0. Try again.");
        }
    }
}
