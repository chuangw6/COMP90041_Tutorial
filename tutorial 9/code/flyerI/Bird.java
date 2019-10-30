package tute9.flyerI;

/**
 * @author Chuang Wang
 * @studentID 791793
 * @institution University of Melbourne
 */
public class Bird extends Flyer implements Animal {


    @Override
    public void tweet() {
        System.out.println("tweet from bird class");
    }

    @Override
    public void takeOff() {
        System.out.println("takeOff from bird class");

    }


}
