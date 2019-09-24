package tute8.flyer;

/**
 * @author Chuang Wang (inspired by CPSC210 Gail Murphy, Elisa Baniassad)
 * @institution University of Melbourne
 */
public class Bird extends Flyer{
    // REQUIRES: being on land
    // MODIFIES: this
    // EFFECTS:  moves this into the air
    public void takeOff(){
        System.out.println("takeoff from Bird class");
    }


    // REQUIRES: being in the air
    // MODIFIES: this
    // EFFECTS: moves this horizontally in the air
    public void fly(){
        System.out.println("fly from Bird class");
    }

    // REQUIRES: being in the air
    // MODIFIES: this
    // EFFECTS: moves this onto land
    public void land(){
        System.out.println("land from Bird class");
    }

    public void tweet(){
        System.out.println("birds tweet");
    }
}
