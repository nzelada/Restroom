
/**
 * Print diagrams of restroom stalls as they are occupied. The premise is that
 * people generally prefer to maximize their distance from already occupied
 * stalls, by occupying the middle of the longest sequence of unoccupied places.
 *
 * 
 * @version 02/3/2019
 */
import java.util.*;

public class RestroomSimulation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // scanner
        int STALLS = 10; // orginal int for the stalls

        System.out.println("Enter a number between 5 and 30"); // prints 
        STALLS = in.nextInt(); // input scanner
        System.out.println(); // new line
        boolean[] stall = new boolean[STALLS]; // boolean array
        Restroom wc = new Restroom(STALLS);  // new object of stalls

        if ((STALLS >= 5) && (STALLS <= 30)) {
            for (int i = 1; i <= STALLS; i++) { // loop for STALLS

                wc.addOccupant(); // call the method

                System.out.println(wc.getStalls()); // fills the stalls

            }
        } else {
            System.out.println(STALLS + " is not a number between 5 and 30");
            // else if the num isn't between 5 or 30.
        }

    }
}
