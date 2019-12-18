/* /////////////////////////////////////////////////////////////////////////////
 * Yasir Hassan - March 29, 2019
 * CS 3300 - Final Project
 * This project is to demonstrate OOP using inheritance, encapsulation, and
 * polymorphism... 
 * This project contains 8 classes.
 * /////////////////////////////////////////////////////////////////////////////
 * A company pays its employees on a weekly basis. The employees are 
 * of four types: Salaried employees are paid a fixed weekly salary regardless
 * of the number of hours worked, hourly employees are paid by the hour 
 * and receive overtime pay (i.e., 1.5 times their hourly salary rate)
 * for all hours worked in excess of 40 hours, commission employees
 * are paid a percentage of their sales and base-salaried commission employees 
 * receive a base salary plus a percentage of their sales. 
 * Recently, the company has decided to reward salaried-commission employees
 * by adding 10% to their base salaries. Also, the company will award
 * a $100 bonus for each employee whose birthday matches the current month. 
 * The company wants to write an application that performs its payroll 
 * calculations polymorphically. 
 */ ////////////////////////////////////////////////////////////////////////////

// package name
package payroll.system;

// PayrollSystemTest is class-driver to test the whole project
public class PayrollSystemTest 
{
    // main method
    public static void main(String[] args) 
    {
        // create a ManagePayroll object and
        // assign its address to payroll reference varaible
        ManagePayroll payroll = new ManagePayroll();
        
        // invoke runPayroll
        payroll.runPayroll();
        
    } // end main method
} // end PayrollSystemTest class
