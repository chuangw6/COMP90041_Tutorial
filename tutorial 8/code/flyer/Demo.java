package tute8.flyer;

/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class Demo {
    public static void main(String[] args) {
        Flyer f1 = new Flyer();
        Flyer f2 = new Bird();
        Bird b1 = new Bird();
        Bird b2 = new Kiwi();
        PrivatePlane p = new PrivatePlane();
        f1.fly();
        f2.land();
        b1.takeOff();
        b2.tweet();
        p.serveDrinks();
    }
}
