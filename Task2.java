public class Task2 {
    public static void main(String[] args) {
        
    }
    public static void task2() {
        try {
            int d = 0;
            double[] catchedRes1 = new double [8];
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
         
    }
}
