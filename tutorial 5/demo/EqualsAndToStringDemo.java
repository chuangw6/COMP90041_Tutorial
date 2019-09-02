package tute5.demo;

public class EqualsAndToStringDemo
{
    public static void main(String[] args)
    {
        DateFourthTry date1 = new DateFourthTry( ),
                      date2 = new DateFourthTry( );
        date1.setDate(6, 17, 1882);
        date2.setDate(6, 17, 1882);

        if (date1.equals(date2))
            System.out.println(date1 + " equals " + date2);
        else
            System.out.println(date1 + " does not equal " + date2);

        date1.setDate(7, 28, 1750);

        if (date1.precedes(date2))
            System.out.println(date1 + " comes before " + date2);
        else
            System.out.println(date2 + " comes before or is equal to " 
                                     + date1);
   }
}
