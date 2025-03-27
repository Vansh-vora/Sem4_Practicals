//Write a Java program that asks the user to input two integers and then divides the first by the second. Handle any ArithmeticException (e.g., division by zero) with an appropriate message.

import java.util.Scanner;
class ArithmeticException extends Exception{
  ArithmeticException(String message){
    super(message);  }
}
public class Q6 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1st Number:");
    float num1=sc.nextFloat();
    System.out.println("Enter 2nd Number:");
    float num2=sc.nextFloat();

    try{
      if(num1==0 || num2==0){
        throw new ArithmeticException("0 detected in division");
      }
      System.out.println("Result: "+num1/num2);
    }catch (ArithmeticException e){
      System.out.println(e);
    }
  }
}
