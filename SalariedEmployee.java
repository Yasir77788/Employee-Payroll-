// SalariedEmployee class
// It extends Employee super class

package payroll.system;

public class SalariedEmployee extends Employee 
{
   private double weeklySalary;

   // seven-argument constructor
   public SalariedEmployee( String first, String last, String ssn, 
      int month, int day, int year, double salary )
   {
      super( first, last, ssn, month, day, year ); 
      weeklySalary = salary;
   } // end seven-argument SalariedEmployee constructor

   // set salary
   public void setWeeklySalary( double salary )
   {
      weeklySalary = salary < 0.0 ? 0.0 : salary;
   } // end method setWeeklySalary

   // return salary
   public double getWeeklySalary()
   {
      return weeklySalary;
   } // end method getWeeklySalary

   // calculate earnings; override abstract method earnings in Employee
   @Override
   public double earnings()
   {
      return getWeeklySalary();
   } // end method earnings

   // return String representation of SalariedEmployee object
   @Override
   public String toString()
   {
      return String.format( "Salaried employee: %s\n%s: $%,.2f", 
         super.toString(), "Weekly salary", getWeeklySalary() );
   } // end method toString   
} // end class SalariedEmployee
