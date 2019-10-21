package tute11.demo;

import java.util.Scanner;

public class GenericPairDemo {
    public static void main(String[] args) {

        Pair<String> secretPair = new Pair<>("Happy", "Day");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter two words:");

        String word1 = keyboard.next();
        String word2 = keyboard.next();

        Pair<String> inputPair = new Pair<>(word1, word2);


        if (inputPair.equals(secretPair)) {
            System.out.println("You guessed the secret words");
            System.out.println("in the correct order!");
        } else {
            System.out.println("You guessed incorrectly.");
            System.out.println("You guessed");
            System.out.println(inputPair);
            System.out.println("The secret words are");
            System.out.println(secretPair);
        }
    }
}
