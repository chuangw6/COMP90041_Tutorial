package tute8;

/**
 * @author Chuang Wang
 * @studentID 791793
 * @institution University of Melbourne
 */
public class Demo {

    public static void main(String[] args) {
        Boot b = new Boot("color", "design", 42.3f);
        b.setHeelType(HeelType.FLAT);
        System.out.println(b.getHeelType());
        b.setHeelType(HeelType.PUMP);
        System.out.println(b.getHeelType());
    }
}
