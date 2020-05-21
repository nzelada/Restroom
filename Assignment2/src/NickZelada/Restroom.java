
/**
 * A class that shows how restroom stalls are occupied.
 * 
 * @version 02/3/2019
 */ 
public class Restroom {

    private boolean occupied[]; // true or false to see if stall is filled
    private int size;
    /**
     * Constructs a restroom with a given number of stalls.
     *
     * @param ns the number of stalls
     */
    public Restroom(int ns) {
        occupied = new boolean[ns]; // constructor for occupied
        size = occupied.length;
    }

    /*
     Adds an occupant in the middle of the longest sequence of
     unoccupied places. 
     */
    public void addOccupant() {
        int frstStall = 0; // stores the first open stall they go to
        int secStall = 0; // stores the second open stall they go to
        int rightStall = 0; // right most stall
        int leftStall = 0; // left most stall
        for (int i = 0; i < size +1; i++) { // for loop
            if (i == size) {
                if (frstStall > rightStall) { 
                    rightStall = frstStall; // first stall is the farthest one
                    leftStall = secStall; // second stall is the left one
                }
            } else if (frstStall == 0 && !occupied[i]) { // not occupied
                secStall = i; // second stall is set to the index of array
                frstStall++; // first stall is incremented 
            } else {
                if (!occupied[i]) { // if stall isn't occupied then it's
                    frstStall++; // incremented
                } else {
                    if (frstStall > rightStall) { // if first stall is greater
                        rightStall = frstStall; // then it's the right most
                        leftStall = secStall; // second is left most
                    }
                    frstStall = 0; // first stall is set to zero
                }
            }
        }
        occupied[leftStall + rightStall / 2] = true; // divides the left
        // and right stall with two
    }

    /*
     Gets a string describing the current stall occupation
     @return a string with _ for an empty stall and X for an occupied one
     */
    public String getStalls() {
        String a = "";
        for (boolean h : occupied) { // enhanced for loop for print
            if (h == true) {
                a += "X"; // occupied stalls
            } else {
                a += "_"; // empty stalls
            }

        }
        return a; // returns the string
    }
}
