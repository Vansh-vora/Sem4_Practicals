//Write a java program which takes 2 arguments - a string and its length. If the length ofthe string is not according to given one then throw the user defined LengthMatchException and handles it appropriately. 
class LengthMatchException extends Exception{
  LengthMatchException(String message){
    super(message);
  }
}

public class Q2 {
  public static void checkStrLen(String str,int length) throws LengthMatchException{
    if(str.length()!=length){
      throw new LengthMatchException("Error String Length not matched");
      
    }
    System.out.println("Success String Length Matched");
  }
  public static void main(String[] args) {
    try{
      checkStrLen("Vansh", 7);
    }catch(LengthMatchException e){
      System.out.println(e);
    }
  }
}
