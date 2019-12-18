// Employee abstract-superclass.
// Abstract class can not be instanciated, to create objects. 
// It is used only as superclasses in inheritance hierarchies.
// It contains one abstract method to be overridden in subclasses.

package payroll.system;

public abstract class Employee 
{
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;
   private Date birthDate;

   // six-argument constructor
   public Employee( String first, String last, String ssn, 
      int month, int day, int year )
   {
      firstName = first;
      lastName = last;
      socialSecurityNumber = ssn;
      birthDate = new Date( month, day, year );
   } // end six-argument Employee constructor

   // set first name
   public void setFirstName( String first )
   {
      firstName = first;
   } // end method setFirstName

   // return first name
   public String getFirstName()
   {
      return firstName;
   } // end method getFirstName

   // set last name
   public void setLastName( String last )
   {
      lastName = last;
   } // end method setLastName

   // return last name
   public String getLastName()
   {
      return lastName;
   } // end method getLastName

   // set social security number
   public void setSocialSecurityNumber( String ssn )
   {
      socialSecurityNumber = ssn;  // should validate
   } // end method setSocialSecurityNumber

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } // end method getSocialSecurityNumber

   // set birth date
   public void setBirthDate( int month, int day, int year )
   {
      birthDate = new Date( month, day, year );
   } // end method setBirthDate

   // return birth date
   public Date getBirthDate()
   {
      return birthDate;
   } // end method getBirthDate

   // return String representation of Employee object
   @Override
   public String toString()
   {
      return String.format( "%s %s\n%s: %s\n%s: %s", 
         getFirstName(), getLastName(), 
         "Social security number", getSocialSecurityNumber(), 
         "Birth date", getBirthDate() );
   } // end method toString

   // abstract method overridden by subclasses
   // It must be implemented in all subclasses
   public abstract double earnings();
} // end abstract class Employee
