//Perform all the arithmatic operations using all four types of functions and
// display the sa

import java.util.Scanner;

public class Q1{
  public static int add(int a,int b){
    return a+b;

  }
  public static int sub(int a,int b){
    return a-b;
  }
  public  static int mul(int a,int b){
    return a*b;
  }
  public  static int div(int a,int b){
    if(b!=0){
      return a/b;
    }
    else{
      System.out.println("Division by zero not allowed");
      return 0;
    }
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two number");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    System.out.println("The Addition is:"+add(num1,num2));
    System.out.println("The Subtraction is: "+sub(num1,num2));
    System.out.println("The MUltiplication is: "+mul(num1,num2));
    System.out.println("The Division is: "+div(num1,num2));

  }
}

