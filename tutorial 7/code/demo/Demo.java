package tute7.demo;

/**
 * @author Chuang Wang
 * @studentID 791793
 * @institution University of Melbourne
 */
public class Demo {
    public static void main(String[] args) {

//        String[] cars = new String[4];
//        cars[0] = "0";
//        cars[1] = "1";
//        System.out.println(cars[4]);

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println("---------------loop over indices---------------");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("---------------for each loop---------------");
        for (String car : cars) {
            System.out.println(car);
        }


    }
}
