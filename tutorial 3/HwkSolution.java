
/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class HwkSolution {
    public static void main(String[] args) {
        String print_line = "";
        for (int i = 0; i <= 10; i++) {
            if (i == 0) {
                print_line = "";
                for (int j = 0; j <= 10; j++) {
                    if (j == 0) {
                        print_line += "  *  ";
                    } else {
                        print_line += "|" + numWithSpace(j);
                    }
                }
                System.out.println(print_line);
            } else {
                print_line = numWithSpace(i);
                for (int j = 1; j <= 10; j++) {
                    print_line += "|" + numWithSpace(i * j);
                }
                System.out.println(print_line);
            }
            print_line = "-----";
            for (int j = 0; j < 10; j++)
                print_line += "+-----";
            System.out.println(print_line);
        }
    }

    private static String numWithSpace(int num) {
        if (num > 0 && num < 10) {
            return "  " + num + "  ";
        } else if (num >= 10 && num < 100) {
            return "  " + num + " ";
        } else if (num == 100) {
            return " 100 ";
        } else
            return "";
    }
}
