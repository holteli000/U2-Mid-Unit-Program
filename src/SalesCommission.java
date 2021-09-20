/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

Total Earnings: $1184.38

 */

/* put together a plan
1. get inputs
2. calculate
3.
*/


import javax.swing.*;
import java.text.DecimalFormat;

public class SalesCommission {

    public static void main(String[] args) {

        double hourlyRate = getInput("What is the hourly rate? ");
        double hoursWorked = getInput("What is the hours worked? ");
        double salesCommission = getInput("What is the sales commission? ");
        double totalSales = getInput("What is the total sales? ");

        double hourlyPay = hourlyPay(hourlyRate, hoursWorked);
        double commission = commission(totalSales,salesCommission);
        double totalPay = totalPay(hourlyPay, commission);

        output(totalPay);

    }

    public static double getInput(String prompt){

        return Double.parseDouble(JOptionPane.showInputDialog(prompt));

    }

    public static double hourlyPay(double hourlyRate, double hoursWorked){
        return hourlyRate * hoursWorked;


    }

    public static double commission(double totalSales, double salesCommission){
      return  totalSales * (salesCommission/100.00);

    }

    public static double totalPay(double hourlyPay, double commission){
        return hourlyPay + commission;

    }
    private static void output(double totalPay) {

        DecimalFormat round = new DecimalFormat("#,###.00");
        JOptionPane.showMessageDialog(null, " the total pay is " + round.format(totalPay));

    }
}
