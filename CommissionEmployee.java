// CommissionEmployee class
// It extends Employee super-class

package payroll.system;

public class CommissionEmployee extends Employee 
{
   private double grossSales; // gross weekly sales
   private double commissionRate; // commission percentage

   // eight-argument constructor
   public CommissionEmployee( String first, String last, String ssn, 
      int month, int day, int year, double sales, double rate )
   {
      super( first, last, ssn, month, day, year );
      grossSales = sales;
      commissionRate = rate;
   } // end eight-argument CommissionEmployee constructor

   // set commission rate
   public void setCommissionRate(double rate)
   {
       // use conditional operator to set commRate
      commissionRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0;
   } // end method setCommissionRate

   // return commission rate
   public double getCommissionRate()
   {
      return commissionRate;
   } // end method getCommissionRate

   // set gross sales amount
   public void setGrossSales(double sales)
   {
      grossSales = sales < 0.0 ? 0.0 : sales;
   } // end method setGrossSales

   // return gross sales amount
   public double getGrossSales()
   {
      return grossSales;
   } // end method getGrossSales

   // calculate earnings; override abstract method earnings in Employee
   @Override
   public double earnings()
   {
      return getCommissionRate() * getGrossSales();
   } // end method earnings

   // return String representation of CommissionEmployee object data
   @Override
   public String toString()
   {
      return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f", 
         "Commission employee", super.toString(), 
         "Gross sales", getGrossSales(), 
         "Commission rate", getCommissionRate() );
   } // end method toString   
} // end class CommissionEmployee

