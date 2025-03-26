//Consider an employee class, which contains fields such as name and designation. And a subclass, which contains a field salary. Write a program for inheriting this relation.
import java.util.*;

class Employee{
  String name;
  String designation;

  Employee(String name,String designation){
    this.name=name;
    this.designation=designation;
  }
}
class HR extends Employee{
  float salary;

  HR(String name,String designation,float salary){
    super(name, designation);
    this.salary=salary;
  }

  void display(){
    System.out.println("The name of employee is:"+super.name);
    System.out.println("The designation of employee is: "+super.designation);
    System.out.println("The salary of Employee is: "+salary);
  }
}

public class Q2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the name of Employee: ");
    String name=sc.nextLine();
    
    System.out.println("Enter the designation of Employee:");
    String Des=sc.nextLine();

    System.out.println("Enter the salary of Employee:");
    float sal=sc.nextFloat();

    HR hr=new HR(name, Des, sal);
    System.out.println("Employee Details");
    hr.display();
  } 
}
