// Write a program to define custom exception called "no match exception" that is thrown
// when a string is not equal to "internet" This string is providing through Joption pane.
import java.util.*;
import javax.swing.JOptionPane; 
class noMatchException extends Exception{
  noMatchException(String message){
  super(message);
  }
}
public class Q5 {
  public static void checkStr(String str) throws noMatchException{
    if(!str.equals("internet")){
      throw new noMatchException("Invalid string passed: "+str);
    }else{
      System.out.println("Success");   
    }
  }
  public static void main(String[] args){
    String str=JOptionPane.showInputDialog(null,"Enter a string:","String check",JOptionPane.INFORMATION_MESSAGE);

    try{
      checkStr(str);
    }catch (noMatchException e){
      System.out.println(e);
    }
  }
}
