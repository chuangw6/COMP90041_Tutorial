package tute8.flyer;

/**
 * @author Chuang Wang (inspired by CPSC210 Gail Murphy, Elisa Baniassad)
 * @institution University of Melbourne
 */
public class Flyer {
    // REQUIRES: being on land
    // MODIFIES: this
    // EFFECTS:  moves this into the air
    public void takeOff(){
        System.out.println("takeoff from flyer class");
    }


    // REQUIRES: being in the air
    // MODIFIES: this
    // EFFECTS: moves this horizontally in the air
    public void fly(){
        System.out.println("fly from flyer class");
    }

    // REQUIRES: being in the air
    // MODIFIES: this
    // EFFECTS: moves this onto land
    public void land(){
        System.out.println("land from flyer class");
    }
}
