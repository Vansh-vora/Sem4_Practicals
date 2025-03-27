//Write a Java program to input n integer numbers and display lowest and second lowest
// number. Also handle the different exceptions possible to be thrown during execution. 

import java.util.Scanner;

public class Q3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    try{
      int num=0;
      int Largest=0,secondLargest=0;

      while(num!=-1){
        System.out.println("Enter a number(-1 to stop):");
        num=sc.nextInt();
        if(num>Largest){
          secondLargest=Largest;
          Largest=num;
        }
      }
      System.out.println("The Largest number you entered is:"+Largest);
      System.out.println("The Second Largest Number you entered is: "+secondLargest);
    }catch (IllegalArgumentException e){
      System.out.println(e);
    }catch (Exception e){
      System.out.println(e);
    }
    sc.close();
  }
}
