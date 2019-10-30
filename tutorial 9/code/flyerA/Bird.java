package tute9.flyerA;

/**
 * @author Chuang Wang (inspired by CPSC210 Gail Murphy, Elisa Baniassad)
 * @institution University of Melbourne
 */
public class Bird extends Flyer {
    private int size;
//    public Bird(String name){
//        super(name);
//    }

    @Override
    public void takeOff() {
        System.out.println("takeOff from bird class");
    }
}
