package tute10;

import java.util.Scanner;

/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        // TODO 1: try to call any of following methods you want and see what happens
    }

    /**
     * ArithmeticException example
     */
    public static void divideByZero() {
        int numerator = 10;
        int denominator = 0;
        System.out.println(numerator / denominator);
    }

    /**
     * NullPointerException example
     */
    public static void nullpointerException() {
        Student s = null;
        System.out.println(s.getId());
    }

    /**
     * ArrayIndexOutOfBoundsException example
     */
    public static void arrayIndexOutOfBounds() {
        String fruits[] = {"apple", "banana", "watermelon"};

        System.out.println(fruits[3]);
    }

    /**
     * StackOverflowError example
     */
    public static void badRecursive() {
            badRecursive();
    }

    /**
     * InputMismatchException example
     */
    public static void scannerDemo() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of laptops you want to order");
        int numOfLaptops = keyboard.nextInt();
        System.out.println("You have ordered " + numOfLaptops + " laptops");
    }

    /**
     * this example is to illustrate how to use your custom exception class
     * TODO 2: try to modify it by deleting try-catch and throw the exception to a calling method and see what happens
     * @param inputPwd
     */
    public static void logInExample(String inputPwd) {

        String username = "uni";
        String correctPwd = "unimelb123";
        try {
            if (inputPwd.equals(correctPwd)) {
                System.out.println(" yeah, correct pwd");
            } else {
                throw new LoginFailException("sorry wrong password");
            }
        } catch (LoginFailException e) {
            System.out.println("wrong pwd");
            // the alternative way is
//            System.out.println(e.getMessage());
        }


        System.out.println("test");
    }
}
