import java.util.*;
// Write an interface called Numbers with a method int process(int x,int y). Write a class
// called Sum in which the process() method finds the sum of two numbers and returns an
// int value. Write another class called Average in which the process() method finds the
// average of the two numbers and returns an int value.
interface Numbers{
  int process(int x,int y);
}
class Sum implements Numbers{
  @Override
  public int process(int x,int y){
    return x + y;

  }
}

class Average implements Numbers{
  @Override
  
  public int process(int x, int y) {
    return (x+y)/2;
  }
}

public class Q5 {
  public static void main(String[] args) {
    Sum obj1=new Sum();
    Average obj2=new Average();
    System.out.println("The sum of 10 and 20 is:"+obj1.process(10, 20));
    System.out.println("The average of 10 and 20 is:"+obj2.process(10, 20));

  }  
}
