import java.util.Random;
import java.util.Scanner;

/**
A test for the ComboLock class.
 */
public class ComboLockTest
{
    public static void main(String[] args)
    {
        Random randomizer = new Random();

        int secret1 = randomizer.nextInt(40);
        int secret2 = randomizer.nextInt(40);
        int secret3 = randomizer.nextInt(40);
        
        System.out.println("LOCK COMBINATION: " + secret1 + " " + secret2 + " " + secret3);

        ComboLock lock = new ComboLock(secret1, secret2, secret3);

        Scanner in = new Scanner(System.in);
        boolean opened = false;
        boolean turningRight = true;
        while(!opened)
        {
            lock.printNum();
            System.out.println("Enter number of ticks to turn to the " + (turningRight ? "right" : "left") + " 0 - 39. Enter an invalid number to quit.");
            int ticks = in.nextInt();
            if((ticks <= 0) || (ticks > 39))
            {
                System.out.println("Invalid entry. The program will now exit.");
                return;
            }
            if(turningRight)
            {
                lock.turnRight(ticks);
                lock.printNum();
            }
            else
            {
                lock.turnLeft(ticks);
                lock.printNum();
            }
            turningRight = !turningRight;
            opened = lock.open();
        }
        System.out.println("You opened the lock!");
    }    
}
