package tute8.hrSystem;

public class InheritanceDemo
{
    public static void main(String[] args)
    {
        HourlyEmployee joe = new HourlyEmployee("Joe Worker",
                                   new Date("January", 1, 2004), 50.50, 160);

        System.out.println("joe's longer name is " + joe.getName( ));

        System.out.println("Changing joe's name to Josephine.");
        joe.setName("Josephine");

        System.out.println("joe's record is as follows:");
        System.out.println(joe);
       }
}
