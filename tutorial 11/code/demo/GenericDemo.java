package tute11.demo;

import tute10.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class GenericDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "frank");
        Student s2 = new Student(2, "mark");

        List<Student> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);
        System.out.println(list.size());

        System.out.println(list.contains(s1));

        list.remove(s2);
        System.out.println(list.size());

    }

    public static <T> void printOutArray(T[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printOutArray(String[] array){
        for (int i = 0; i < 2; i++) {
            System.out.println(array[i]);
        }
    }
}
