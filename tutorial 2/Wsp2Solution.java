
import java.util.Scanner;
/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class Wsp2Solution {
    public static void main(String[] args) {
        // create a Scanner object called keyboard
        Scanner keyboard = new Scanner(System.in);
        /**
         * Reads the rest of the current keyboard input line
         * and returns the characters read as a value of type String.
         */
        String userInput = keyboard.nextLine();

        // print out the input length
        System.out.println(userInput.length());

        // produce the array of string by splitting the string with blank delimiter " "
        String[] inputs = userInput.split(" ");

        // prints out just the 1st word of the user’s text
        System.out.println(inputs[0]);

        // prints all of the user’s input but the 1st word.
        for (int i = 1; i < inputs.length; i++){
            System.out.print(inputs[i] + " ");
        }


    }
}
