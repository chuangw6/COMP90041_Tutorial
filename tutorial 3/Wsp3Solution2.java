
/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class Wsp3Solution2 {
    public static void main(String[] args) {
        if (args.length == 1){
            switch (args[0]){
                case "N":
                    System.out.println("0");
                    break;
                case "S":
                    System.out.println("90");
                    break;
                case "E":
                    System.out.println("180");
                    break;
                case "W":
                    System.out.println("270");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
