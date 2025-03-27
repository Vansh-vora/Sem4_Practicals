//Define User-Defined Exception which calculate the squre of value. 

import java.util.Scanner;
class NegativeNumberException extends Exception{
  NegativeNumberException(String message){
    super(message);
  }
}
public class Q9 {
  public static int calculateSquare(int num) throws NegativeNumberException{
    if(num<0){
      throw new NegativeNumberException("Error:Cannot calculate square of negative: "+num);
    
    }
    return num*num;
  }
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      try{
        System.out.println("Enter a number to find its square:");
        int number=sc.nextInt();

        int square=calculateSquare(number);
        System.out.println("Square of"+number+"is: "+square);
      }catch(NegativeNumberException e){
        System.out.println(e.getMessage());
      }catch(Exception e){
        System.out.println("Invalid input");
      }finally{
        sc.close();
      }
  }
  
}
