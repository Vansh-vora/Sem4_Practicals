//Write a java program that accepts 5 even numbers from joption pane. If any of the
// number is odd then throw custom exception OddException and count such invalid
// numbers. 

import javax.swing.JOptionPane;

class OddException extends Exception{
  OddException(String message){
  super(message);
  }
}
public class Q4 {
    public static boolean oddCheck(int num) throws OddException{
      if(num%2!=0){
        throw new OddException("Odd number detected");
      }
      return true;
    }
  public static void main(String[] args) {
    for(int i=0;i<=5;i++){
      int num=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number: ","Number",JOptionPane.INFORMATION_MESSAGE));

      try{
        if(oddCheck(num)){
          System.out.println("Success");
        }
      }catch (OddException e){
        System.out.println(e);
      }
    }
  }
}
