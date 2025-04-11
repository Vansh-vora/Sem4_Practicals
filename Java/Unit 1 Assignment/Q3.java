import java.util.Scanner;

//Write a Java program to calculate gross salary and net salary of an employee.
//  Gross salary = Hourly rate * total number of hours worked
//  Net salary = gross salary - tax (7.5%)
// Take values from users using Scanner class.
public class Q3 {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hourly rate:");
        float hr=sc.nextFloat();
        System.out.println("Enter total number of hours work:");
        float hour=sc.nextFloat();
        float Gross_Salary=hr*hour;
        System.out.println("Total Gross Salary is:"+Gross_Salary);
        double tax=Gross_Salary*0.075;

        double netsalary=Gross_Salary-tax;
        System.out.println("NetSalary is:"+netsalary);

    }
}
