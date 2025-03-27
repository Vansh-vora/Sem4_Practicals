// Write a program to demonstrate the use of the finally block. Ensure that the program
//prints a message from the finally block regardless of whether an exception is thrown.
import java.util.*;
public class Q8 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    System.out.println("Enter the index you want to access:");
    int idx=sc.nextInt();

    try{
      if(idx>arr.length){
        throw new ArrayIndexOutOfBoundsException("There is no such index");
      }
      System.out.println("Success");
    }catch (ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    }finally{
      System.out.println("This Line will print anyway even when exception occurs");
      sc.close();
    }
  }  
}
