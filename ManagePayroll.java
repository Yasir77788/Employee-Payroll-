// ManagePayroll class 
// It processes employee-payroll individually & polymorhically.
// To use plymorthism, it creates an array of type superclass variables 
// that refers objects of all direct, and indirect, subclasses.

// package name
package payroll.system;
import java.util.Scanner; // import Scanner class

public class ManagePayroll  // class ManagePayroll
{
   public void runPayroll() // runPayroll method
   {
      // create subclass objects
      // This is a straight forward assigning -
      // a class reference to same class reference variable
      SalariedEmployee salariedEmployee = 
         new SalariedEmployee( 
         "Houston", "Smith", "111-11-1111", 6, 15, 1970, 800.00 );
      HourlyEmployee hourlyEmployee = 
         new HourlyEmployee( 
         "Sam", "Austin", "222-22-2222", 12, 29, 1981, 16.75, 40 );
      CommissionEmployee commissionEmployee = 
         new CommissionEmployee( 
         "Mo", "Omar", "333-33-3333", 9, 8, 1964, 10000, .06 );
      BasePlusCommissionEmployee basePlusCommissionEmployee = 
         new BasePlusCommissionEmployee( 
         "Bob", "Lewis", "444-44-4444", 3, 2, 1969, 5000, .04, 300 );

      System.out.println( "Employees processed individually:\n" );
      
      System.out.printf( "%s\n%s: $%,.2f\n\n", 
         salariedEmployee, "Earned", salariedEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         hourlyEmployee, "Earned", hourlyEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         commissionEmployee, "Earned", commissionEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n", 
         basePlusCommissionEmployee, 
         "Earned", basePlusCommissionEmployee.earnings() );

      // create four-element Employee array
      Employee[] employees = new Employee[4]; 

      // initialize array with Employee's subclasses
      employees[ 0 ] = salariedEmployee;
      employees[ 1 ] = hourlyEmployee;
      employees[ 2 ] = commissionEmployee; 
      employees[ 3 ] = basePlusCommissionEmployee;

      Scanner input = new Scanner( System.in ); // to get current month
      int currentMonth;

      // get and validate current month
      do
      {
         System.out.print( "Enter the current month (1 - 12): " );
         currentMonth = input.nextInt();
         System.out.println();
      } while ( ( currentMonth < 1 ) || ( currentMonth > 12 ) );

      System.out.println( "Employees processed polymorphically:\n" );
      
      // generically process each element in array employees
      // using inhanced For-loop to iterate through the array 
      for ( Employee currentEmployee : employees ) 
      {
         System.out.println(currentEmployee); // invokes toString

         // determine whether an element is a BasePlusCommissionEmployee.
         // instanceof is an operator to test wheather an object is
         // of the type of the given class.
         if (currentEmployee instanceof BasePlusCommissionEmployee) 
         {
            // downcast Employee reference to 
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee = 
               ( BasePlusCommissionEmployee ) currentEmployee;

            double oldBaseSalary = employee.getBaseSalary();
            employee.setBaseSalary( 1.10 * oldBaseSalary );
            System.out.printf( 
               "New base salary with 10%% increase is: $%,.2f\n",
               employee.getBaseSalary() );
         } // end if

         // if month of employee's birthday, add $100 to salary
         if ( currentMonth == currentEmployee.getBirthDate().getMonth() )
            System.out.printf(
               "Earned $%,.2f %s\n\n", currentEmployee.earnings(), 
               "Plus $100.00 birthday bonus" );
         else
            System.out.printf( 
               "Earned $%,.2f\n\n", currentEmployee.earnings() );
      } // end for

      // get type name of each object in employees array
      for ( int j = 0; j < employees.length; j++ )
          // getClass()returns the runtime class of the object
          // getName()returns the name of the running-class
         System.out.printf( "Employee %d is a %s\n", (j + 1), 
            employees[j].getClass().getName() ); 
   } // end runPayroll
} // end class ManagePayroll