
/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class Hmk2Solution {
    public static void main(String[] args) {
        int commandLength = args.length;
        int i;
        for (i = 0; i < commandLength; i++){
            if (args[i].startsWith("\"") && args[i].endsWith("\"")){
                System.out.println("the result is ");
                System.out.println("word " + args[i] + " at index " + i);
                break;
            }
        }

        if (i >= commandLength){
            System.out.println("No such word");
        }
    }
}
