package tute9.flyerA;

/**
 * @author Chuang Wang (inspired by CPSC210 Gail Murphy, Elisa Baniassad)
 * @institution University of Melbourne
 */
public class AirPlane extends Flyer {

    public void takeOff() {
        System.out.println("taxiing -> flying");
    }

    public void land(){
        System.out.println("land from AirPlane class");
    }

    public void serveDrinks() {
        System.out.println("Serving airplane drinks");
    }

    public void serveFood() {
        System.out.println("Serving chips & cookies");
    }


}
