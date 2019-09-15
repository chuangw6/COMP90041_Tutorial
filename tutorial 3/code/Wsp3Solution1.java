
/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */

public class Wsp3Solution1 {
    public static void main(String[] args) {
        if (args.length == 1) {
            if (args[0].equals("N"))
                System.out.println("0");
            else if (args[0].equals("S"))
                System.out.println("90");
            else if (args[0].equals("E"))
                System.out.println("180");
            else if (args[0].equals("W"))
                System.out.println("270");
            else
                System.out.println("Invalid input");
        } else {
            System.out.println("Invalid input");
        }
    }
}
