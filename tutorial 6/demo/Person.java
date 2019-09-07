package tute6.demo;

/**
 Class for a person with a name and dates for birth and death.
 Class invariant: A Person always has a date of birth, and if the Person 
 has a date of death, then the date of death is equal to or later than the
 date of birth.
*/
public class Person
{
    private String name;
    private Date born;
    private Date died;//null indicates still alive.

    public Person(String initialName, Date birthDate, Date deathDate)
    {
        if (consistent(birthDate, deathDate))
        {
            name = initialName;
            born = new Date(birthDate);
            if (deathDate == null)
                died = null;
            else
                died = new Date(deathDate);
         }
         else
         {
             System.out.println("Inconsistent dates. Aborting.");
             System.exit(0);
         }
    }

    public Person(Person original)//copy constructor
    {
        if (original == null)
        {
            System.out.println("Fatal error.");
            System.exit(0);
        }

        name = original.name;
        born = new Date(original.born);

        if (original.died == null)
            died = null;
        else
            died = new Date(original.died);
    }

    public void set(String newName, Date birthDate, Date deathDate)//set instance variables 
    {
        if (consistent(birthDate, deathDate))
        {
                name = newName;
                born = new Date(birthDate);
                if (deathDate == null)
                    died = null;
                else
                    died = new Date(deathDate);
         }
         else
         {
             System.out.println("Inconsistent dates. Aborting.");
             System.exit(0);
         }
}

    public String toString( )
    {
        String diedString;
        if (died == null)
            diedString = ""; //Empty string
        else
            diedString = died.toString( );

        return (name + ", " + born + " - " + diedString);
    }

    public boolean equals(Person otherPerson)
    {
        if (otherPerson == null) 
            return false;
        else
            return (name.equals(otherPerson.name)
                    && born.equals(otherPerson.born)
                    && datesMatch(died, otherPerson.died) );
    }

    /**
     To match date1 and date2 must either be the same date or both be null.
    */
    private static boolean datesMatch(Date date1, Date date2)
    {
        if (date1 == null) 
            return (date2 == null);
        else if (date2 == null) //&& date1 != null
            return false;
        else // both dates are not null.
            return(date1.equals(date2));
    }

    /**
     Precondition: newDate is a consistent date of birth.
     Postcondition: Date of birth of the calling object is newDate.
    */
    public void setBirthDate(Date newDate)//mutator
    {
        if (consistent(newDate, died))
            born = new Date(newDate);
        else
        {
             System.out.println("Inconsistent dates. Aborting.");
             System.exit(0);
        }
    }

    /**
     Precondition: newDate is a consistent date of death.
     Postcondition: Date of death of the calling object is newDate.
    */
    public void setDeathDate(Date newDate)
    {
    
        if (!consistent(born, newDate))
        {
            System.out.println("Inconsistent dates. Aborting.");
            System.exit(0);
        }

        if (newDate == null)
            died = null;
        else
            died = new Date(newDate);
    }

    public void setName(String newName)
    {
        name = newName;
    }

     /**
     Precondition: The date of birth has been set, and changing the year
     part of the date of birth will give a consistent date of birth.
     Postcondition: The year of birth is (changed to) newYear.
    */
    public void setBirthYear(int newYear)
    {
        if (born == null) //Precondition is violated
        {
             System.out.println("Fata; Error. Aborting.");
             System.exit(0);
        }
        born.setYear(newYear);
        if (!consistent(born, died))
        {
             System.out.println("Inconsistent dates. Aborting.");
             System.exit(0);
        }
    }
 
    /**
     Precondition: The date of death has been set, and changing the year
     part of the date of death will give a consistent date of death.
     Postcondition: The year of death is (changed to) newYear.
    */
    public void setDeathYear(int newYear)
    {
        if (died == null) //Precondition is violated
        {
             System.out.println("Fata; Error. Aborting.");
             System.exit(0);
        }
        died.setYear(newYear);
        if (!consistent(born, died))
        {
             System.out.println("Inconsistent dates. Aborting.");
             System.exit(0);
        }
    }

    public String getName( )
    {
        return name;
    }

    public Date getBirthDate( )
    {
        // deep copy
        // by using copy constructor
        return new Date(born);
    }

    public Date getDeathDate( )
    {
        if (died == null)
            return null;
        else
            return new Date(died);
     }

    /**
     To be consistent, birthDate must not be null. If there is no date of
     death (deathDate == null), that is consistent with any birthDate.
     Otherwise, the birthDate must come before or be equal to the deathDate.
    */

    private static boolean consistent(Date birthDate, Date deathDate)
    {
        if (birthDate == null)
            return false;
        else if (deathDate == null)
            return true;
        else 
            return (birthDate.precedes(deathDate )
                      || birthDate.equals(deathDate ));//check the ch4 date class	
    }
}