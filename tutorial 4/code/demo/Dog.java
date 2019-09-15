
/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class Dog {
    //-------------- All instance variables -------------------
    private String name;
    private int age;
    private String breed;

    //--------------------- Constructor ------------------------
    public Dog(String name) {
        this.name = name;
    }

    //-------------- All method definitions -------------------
    public void bark(){
        System.out.println("The dog " + name + " is barking");
    }

    public void wagTail(){
        System.out.println("The dog is waging tail");
    }
}
