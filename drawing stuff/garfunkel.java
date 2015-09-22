import java.util.*;
public class garfunkel {
    public static void main (String args[]) {
        Scanner reader = new Scanner (System.in);
        System.out.println("fruity loops");
        System.out.println("Select an operation. 1=Factorial, 2=Average, 3=Prime or nah?");
        int operation = reader.nextInt();
        if (operation == 1) {
            System.out.println("Enter an integer: ");
            int input, result = 1, n = reader.nextInt();
            //n! take integer, multiply integer in for loop
            for (input=1; input<=n; input++) {
                System.out.println(input + " * " + result);
                result = result * input;
            }
            System.out.println(result);
        }
        if (operation == 2) {
            int n=1, i=0, r=0, t=0, p=1;
            //average of i. take n for input numbers and t for number of inputs and divide. r is result
            while (n > 0) {
                if (p == 1) {
                    System.out.print("Enter an integer: ");
                    p = 2;
                }
                else if (p == 2) {
                    System.out.print("Another one: ");
                }
                n = reader.nextInt();
                i += n;
                t++;
                r = i/t;
            }
            System.out.print("Average is " + r);
        }
        if (operation == 3) {
            int n, t=0, i=1;
            System.out.print("Enter an integer: ");
            n = reader.nextInt();
            for (i=1; i<=n;i++) {
                if (n%i == 0)
                    t++;
                if (t>2)
                    System.out.print("Not a prime number");
                else if (t == 2)
                    System.out.print("Prime number");
            }
        }
    }
}
