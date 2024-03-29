// Date class 
// It validates day and month
// set date to Date object

package payroll.system;

public class Date 
{
   private final int month; // 1-12
   private final int day;   // 1-31 based on month
   private final int year;  // any year

   // constructor: call checkMonth to confirm proper value for month; 
   // call checkDay to confirm proper value for day
   public Date( int theMonth, int theDay, int theYear )
   {
      month = checkMonth( theMonth ); // validate month
      year = theYear; // could validate year
      day = checkDay( theDay ); // validate day
   } // end Date constructor

   // utility method to confirm proper month value
   private int checkMonth( int testMonth )
   {
      if ( testMonth > 0 && testMonth <= 12 ) // validate month
         return testMonth;
      else // month is invalid 
      { 
         System.out.printf( "Invalid month (%d) set to 1.\n", testMonth );
         return 1; // maintain object in consistent state
      } // end else
   } // end method checkMonth

   // utility method to confirm proper day value based on month and year
   private int checkDay( int testDay )
   {
      int[] daysPerMonth = 
         { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
   
      // check if day in range for month
      if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
         return testDay;
   
      // check for leap year
      if ( month == 2 && testDay == 29 && ( year % 400 == 0 || 
           ( year % 4 == 0 && year % 100 != 0 ) ) )
         return testDay;
   
      System.out.printf( "Invalid day (%d) set to 1.\n", testDay );
   
      return 1;  // maintain object in consistent state
   } // end method checkDay

   // return day
   public int getDay()
   {
      return day;
   } // end method getDay

   // return month
   public int getMonth()
   {
      return month;
   } // end method getMonth

   // return year
   public int getYear()
   {
      return year;
   } // end method getYear

   // return a String of the form month/day/year
   @Override
   public String toString()
   { 
      return String.format( "%d/%d/%d", month, day, year ); 
   } // end method toString
} // end class Date

