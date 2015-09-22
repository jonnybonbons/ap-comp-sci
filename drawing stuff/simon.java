import java.util.*;
public class simon
{
    public static void main (String args[]) {
        Scanner reader = new Scanner (System.in);
        System.out.println("Shloop");
        System.out.println("Select an operation: 1=Vertical, 2=Horizontal, 3=By 4s, 4=Factoring, 5=Big Numbers");
        System.out.print("Enter an integer: ");
        int operation = reader.nextInt();
        if (operation == 1) {
            System.out.print("Enter an integer to count to: ");
            int a, n = reader.nextInt(); //a = counting, n = input
            for (a = 1; a <= n; ++a) {
                System.out.println(a);
            }
        }
        if (operation == 2) {
            System.out.print("Enter an integer to count to: ");
            int a, n = reader.nextInt(); //a = counting, n = input
            for (a = 1; a <= n; ++a) {
                if (a != n) {
                    System.out.print(a + ", ");
                }
                else if (a == n) {
                    System.out.print(a);
                }
            }
        }
        if (operation == 3) {
            for (int a = 4; a <= 100; a+=4) {
                System.out.println(a);
            }
        }
        if (operation == 4) {
            System.out.print("Enter an integer to check the factors of: ");
            int a, n = reader.nextInt(); //a = counting, n = input
            for (a = 1; a <= n; a++)
                if (n % a == 0) {
                    System.out.println(a);
                }
        }
        if (operation == 5) {
            //System.out.print("Enter an (0 to end): ");
            int a = 0, n = 1; //a for counting, n used to trigger while loop
            while (n > 0) {
                System.out.print("Enter an (0 to end): ");
                int b = reader.nextInt(); //b is used to capture the last number and compare it
                if (b > a) {
                    a = b;
                }
                if (b == 0) {
                    System.out.println("The largest integer was " + a);
                    break;
                }
            }
        }
    }
}

