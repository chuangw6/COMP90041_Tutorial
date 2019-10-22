package tute11;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class Tute11Solution2 {
    private static List<String> friends = new ArrayList<>();
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Which action would you like to perform?");
        System.out.println("Type E for enter names");
        System.out.println("Type D for delete a name");
        System.out.println("Type Q for quit");

        getOption();

    }

    private static void getOption() {
        while (true){
            String s = keyboard.nextLine();
            if (s.equalsIgnoreCase("e")) {
                addNames();
            } else if (s.equalsIgnoreCase("d")) {
                deleteName();
            } else if (s.equalsIgnoreCase("q")) {
                System.exit(0);
            } else {
                System.out.println("Incorrect command, please try again");
            }
        }
    }

    private static void addNames() {
        System.out.println("please type names and type a blank line to terminate");
        String name = keyboard.nextLine();
        while (!name.isEmpty()){
            friends.add(name);
            name = keyboard.nextLine();
        }

        System.out.println("you have entered ");
        for (String s : friends){
            System.out.println(friends.indexOf(s) + " " + s);
        }

        System.out.println("next action to perform");
    }

    private static void deleteName() {
        if (friends.size() == 0) {
            System.out.println("nothing to delete. please try to take another action");
        } else {
            System.out.println("Please enter one of following index of the name to delete");
            for (String s : friends) {
                System.out.println(friends.indexOf(s) + " " + s);
            }

            try {
                int i = keyboard.nextInt();
                friends.remove(i);
                System.out.println("Removed successfully");
            } catch (InputMismatchException e) {
                System.out.println("Sorry, please type an integer");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Sorry, this index is out of bounds");
            }
        }
        // remove the rest of the line; otherwise, "" will remain in the keyboard
        keyboard.nextLine();

        System.out.println("next action to perform");
    }
}
