import java.util.*;
public class rngesus
{
    public static void main (String args[]) {
        Scanner reader = new Scanner (System.in);
        System.out.println("Enter a number on [1, 100] (Press 0 to admit defeat): ");
        Random r = new Random();
        int n = r.nextInt(100) + 1;
        int a = 0, c = 0;
        do {
            a = reader.nextInt();
            c++;
            if (a < n && a != 0) {
                System.out.print("There's no waaaaay it'd be that low. ");
            }
            if (a > n) {
                System.out.print("Not so high, big guy. ");
            }
            if (a != 0) {
                System.out.print("Try again: ");
            }
            if (a == n) {
                System.out.println("!! You did it !! It only took " + c + " tries !!");
                break;
            }
        }
        while (a != 0);
        if (a == 0) {
            c--;
        }
        if (a == 0 && c > 1) {
            System.out.print("Already giving up? You only took " + c + " tries!");
        }
        if (a == 0 && c == 1) {
            System.out.print("Already giving up? You only tried once!");
        }
        if (a == 0 && c == 0) {
            System.out.print("Leaving already? Did you open this by accident or something?");
        }
    }
}
