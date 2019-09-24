package tute8.flyer;

/**
 * @author Chuang Wang (inspired by CPSC210 Gail Murphy, Elisa Baniassad)
 * @institution University of Melbourne
 */
public class AirPlane extends Flyer{

    // REQUIRES: being on land
    // MODIFIES: this
    // EFFECTS:  moves this into the air
    public void takeOff(){
        System.out.println("takeoff from AirPlane class");
    }


    // REQUIRES: being in the air
    // MODIFIES: this
    // EFFECTS: moves this horizontally in the air
    public void fly(){
        System.out.println("fly from AirPlane class");
    }

    // REQUIRES: being in the air
    // MODIFIES: this
    // EFFECTS: moves this onto land
    public void land(){
        System.out.println("land from AirPlane class");
    }

    public void serveDrinks() {
        System.out.println("Serving airplane drinks");
    }

    public void serveSnacks() {
        System.out.println("Serving airplane snacks");
    }


}
