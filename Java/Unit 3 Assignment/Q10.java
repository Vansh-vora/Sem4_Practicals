//Write a Java Program to create a simple class to find out the Area and perimeterrectangle and box using super and this keyword.
class Rectangle{
  double lenght,breadth;

  Rectangle(double lenght,double breadth){
    this.lenght=lenght;
    this.breadth=breadth;
  }
  double findParimeter(){
    return (lenght+breadth)*2;
  }
  double findArea(){
    return lenght *breadth;
  }
}

class Box extends Rectangle{
  Box(double lenght,double breadth){
    super(lenght,breadth);

  }
  double parimeter=super.findParimeter();
  double area=super.findArea();

  void display(){
    System.out.println("The perimeter of box is:"+parimeter);
    System.out.println("The area of box is: "+area);
  }
}
public class Q10 {
  public static void main(String[] args) {
    Box obj=new Box(10, 20);

    obj.display();
  }
}
