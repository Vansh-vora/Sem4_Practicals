//Write a Java program that accepts user input as a string and tries to convert it to an
// integer. Handle NumberFormatException when the user inputs non-numeric data.
import java.util.*;
public class Q11 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a numeric String:");
    String str=sc.nextLine();

    try{
      int num=Integer.parseInt(str);

      System.out.println("Converted String: "+num);
    }catch(NumberFormatException e){
      System.out.println("Error");
    }finally{
      sc.close();
    }
  }
}