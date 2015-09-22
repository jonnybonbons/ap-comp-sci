import java.util.*;
public class calc {
    public static void main (String args[]) {
        Scanner reader = new Scanner (System.in);
        System.out.println("Calculator v. 0.5");
        System.out.print("Enter an integer: ");
        int a = reader.nextInt();
        System.out.print("Enter an integer: ");
        int b = reader.nextInt();
        System.out.print("Enter an operation: 1=add, 2=subtract, 3=multiply, 4=divide");
        int c = reader.nextInt();
        // use conditionals to determine which operation to use and calculate result
        // if c is 1, then use addition, etc.
        int result;
        if (c == 1){
            result = a + b;
            System.out.println("The sum of " + a + " and " + b + " is " + result);
        }
        if (c == 2) {
            result = a - b;
            System.out.println("The difference of " + a + " and " + b + " is " + result);
        }
        if (c == 3) {
            result = a * b;
            System.out.println("The product of " + a + " and " + b + " is " + result);
        }
        if (c == 4) {
            result = a / b;
            if (a % b == 0)
                System.out.println("The quotient of " + a + " and " + b + " is " + result);
            else if (a % b != 0 && a / b != 0)
                System.out.println("The quotient of " + a + " and " + b + " is " + result + " " + a + "/" + b);
            else if (a % b != 0 && a / b == 0)
                System.out.println("The quotient of " + a + " and " + b + " is " + (a % b) + "/" + b);
        }
        System.out.println("The end.");
    }
}
