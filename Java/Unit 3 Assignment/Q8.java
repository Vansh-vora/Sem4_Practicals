//Write a program in Java to demonstrate implementation of multiple inheritance usinginterfaces.

interface Engine{
  void startEngine();
}

interface Transmission{
  void changeGear(int gear);
}

class Caar implements Engine,Transmission{
  int gear;

  @Override
  public void startEngine(){
    System.out.println("Engine Started");
  }

  @Override
  public void changeGear(int gear){
      this.gear=gear;
      System.out.println("Gear changes to: "+this.gear);

  }
}
public class Q8 {
  public static void main(String[] args) {
    Caar myCaar=new Caar();
    myCaar.startEngine();
    myCaar.changeGear(3);
  }

}
