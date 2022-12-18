// * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
package Lesson1;
import java.util.Arrays;
import java.util.Scanner;

public class arrays2 {
    public static void arrays() {
        Scanner input = new Scanner(System.in);
        System.out.println("Finding the quotient of two arrays");
            System.out.print("Enter the values for the 1 array separated by a space: ");
            String arr1 = input.nextLine();
            System.out.print("Enter the values for the 2 array separated by a space: ");
            String arr2 = input.nextLine();
            String[] firstArray = arr1.split(" ");
            String[] secondArray = arr2.split(" ");
            int max = 0;
            if (firstArray.length > secondArray.length) {max = firstArray.length;}
            else {max = secondArray.length;}
            int[] result = new int[max];
        try {
            
            exc(arr1, arr2);
            for(int i = 0; i < result.length; i++){
                result[i] = Integer.parseInt(firstArray[i]) / Integer.parseInt(secondArray[i]);
            }
            System.out.println("result: "+ Arrays.toString(result));
        }
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Please enter arrays of the same lenght. Try again");
        }
        catch(NumberFormatException e){
            System.out.println("Please enter only numbers. Try again"); 
        }
        catch(ArithmeticException e){
            System.out.println("Can't be divided by zero. Try again");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("First Array: " + Arrays.toString(firstArray));
            System.out.println("Second Array: " + Arrays.toString(secondArray));
        }
        
}
private static void exc(String arr1,String arr2) throws Exception {
    if((arr1 == "") | (arr2 == "")){throw new Exception("One or both of the arrays is empty. Try again");}
}
}
