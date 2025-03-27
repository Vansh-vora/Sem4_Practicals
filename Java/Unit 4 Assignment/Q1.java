//Write a program to display the sum of digits of given numbers with exception handling.
import java.util.*;

public class Q1{
  public static int sumofDigits(int num){
    int sum=0;
    int rem=0;

    for(int i=num;i!=0;i/=10){
      rem=i%10;
      sum+=rem;
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    try{
      System.out.println("Enter the number:");
      int num=sc.nextInt();

      System.out.println("Sum of "+num+":"+sumofDigits(num));
    }catch(Exception e){
      System.out.println("Invalid number");
    }
    sc.close();
  }
}