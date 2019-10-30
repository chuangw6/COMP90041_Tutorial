package tute9.flyerA;

/**
 * @author Chuang Wang (inspired by CPSC210 Gail Murphy, Elisa Baniassad)
 * @institution University of Melbourne
 */
public abstract class Flyer {
    private String name;


    // REQUIRES: being on land
    // MODIFIES: this
    // EFFECTS:  moves this into the air
    public abstract void takeOff();



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
