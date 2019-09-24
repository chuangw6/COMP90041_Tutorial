package tute8.hrSystem;

/**
 Class Invariant: All objects have a name string, hire date, nonnegative 
 wage rate, and nonnegative number of hours worked. A name string of 
 "No name" indicates no real name specified yet. A hire date of Jan 1, 1000 
 indicates no real hire date specified yet.
*/
public class HourlyEmployee extends Employee 
{
    private double wageRate; 
    private double hours; //for the month

    public HourlyEmployee( )
    {
        super( );//if the line is omitted, Java will still invoke the non-argument constructor for the base class 
        wageRate = 0;
        hours = 0;
    }

    /**
     Precondition: Neither theName nor theDate is null; 
     theWageRate and theHours are nonnegative.
    */
    public HourlyEmployee(String theName, Date theDate,
                       double theWageRate, double theHours)
    {
         super(theName, theDate);//call a constructor for the base class
         if ((theWageRate >= 0) && (theHours >= 0))
         {
             wageRate = theWageRate;
             hours = theHours;
         }
         else
         {
             System.out.println(
                       "Fatal Error: creating an illegal hourly employee.");
             System.exit(0);
         }
    }

    public HourlyEmployee(HourlyEmployee originalObject)
    {
         super(originalObject);
         wageRate = originalObject.wageRate;
         hours = originalObject.hours;
    }

    public double getRate( )
    {
        return wageRate;
    }

    public double getHours( )
    {
        return hours;
    }

    /**
     Returns the pay for the month.
    */
    public double getPay( )
    {
        return wageRate*hours;
    }

    /**
     Precondition: hoursWorked is nonnegative.
    */
    public void setHours(double hoursWorked)
    {
         if (hoursWorked >= 0)
             hours = hoursWorked;
         else
         {
             System.out.println("Fatal Error: Negative hours worked.");
             System.exit(0);
         }
     }

    /**
     Precondition: newWageRate is nonnegative.
    */
    public void setRate(double newWageRate)
    {
         if (newWageRate >= 0)
             wageRate = newWageRate;
         else
         {
             System.out.println("Fatal Error: Negative wage rate.");
             System.exit(0);
         }
    }

    //the method toString is "overridden" so  it is different in the derived class HourlyEmployee than it is in the base class Employee
    public String toString( )
    {
        return (getName( ) + " " + getHireDate( ).toString( ) 
                + "\n$" + wageRate + " per hour for " + hours + " hours");
        /*
        return (super.toString()
                + "\n$" + wageRate + " per hour for " + hours + " hours");
        */
 
    }
 
    // public boolean equals(HourlyEmployee other)
    // {
    //    return (super.equals(other) && wageRate == other.wageRate
    //             && hours == other.hours);
        
       
    //    return (getName( ).equals(other.getName( )) 
    //             && getHireDate( ).equals(other.HireDate( ))
    //             && wageRate == other.wageRate
    //             && hours == other.hours);
        
    // }

    
    public boolean equals(Object otherObject)
    {
        if(otherObject == null)
            return false;
        else if (getClass() != otherObject.getClass() )
            return false;
        else
        {
            HourlyEmployee otherHourlyEmployee = (HourlyEmployee)otherObject;
            return (super.equals(otherHourlyEmployee) && wageRate == otherHourlyEmployee.wageRate
                && hours == otherHourlyEmployee.hours);
        }
    } 
}
