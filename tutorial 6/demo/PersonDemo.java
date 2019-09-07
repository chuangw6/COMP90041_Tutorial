package tute6.demo;

public class PersonDemo
{
    public static void main(String[] args)
    {
        Date birthDate = new Date("March", 21, 1685);
        Date deathDate = new Date("July", 28, 1750);
        Person bach = new Person("Jone Bach", birthDate, deathDate);

        // privacy leak if getBirthDate returns original reference only
        bach.getBirthDate().setDate("march", 21, 2000);


        Person bachTwin = new Person(bach);

        System.out.println("Comparing bach and bachTwin:");
        if (bachTwin == bach)
             System.out.println("Same reference for both.");
        else
             System.out.println("Distinct copies.");

        if (bachTwin.equals(bach))
             System.out.println("Same data.");
        else
             System.out.println("Not same data.");
     }
}
