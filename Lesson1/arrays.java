// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. 
package Lesson1;
import java.util.Arrays;
import java.util.Scanner;
public class arrays {
    

    public static void arrays() {
        Scanner input = new Scanner(System.in);
        System.out.println("Finding the difference of two arrays");
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
            ex(arr1, arr2);
            for(int i = 0; i < result.length; i++){
                result[i] = Integer.parseInt(firstArray[i]) - Integer.parseInt(secondArray[i]);
            }
            System.out.println("result: "+ Arrays.toString(result));
        }
        
        catch (ArrayIndexOutOfBoundsException ex) {

            System.out.println("Please enter arrays of the same lenght. Try again");
        }
        catch(NumberFormatException ex){
            System.out.println("Please enter only numbers. Try again"); 
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("First Array: " + Arrays.toString(firstArray));
            System.out.println("Second Array: " + Arrays.toString(secondArray));
        }
      
}
 public static void ex(String arr1, String arr2) throws Exception {
     if ((arr1 == "") | (arr2 == "")){throw new Exception("One or both of the arrays is empty. Try again");}
     
 }
}
