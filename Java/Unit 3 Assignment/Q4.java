import java.util.*;
//Write a program to calculate the area of circle, Rectangle & Square by using interface.
interface Shapes{
   double calculateArea();
}

class Circle implements Shapes{
  double radius;

  Circle(double radius){
    this.radius=radius;
  }
  @Override
  public double calculateArea(){
    return Math.PI * radius *radius;
  }
}

class Square implements Shapes{
  double side;

  Square(double side){
    this.side=side;
  }
  @Override
  public double calculateArea(){
    return side * side;
  }
}
class Rectangle implements Shapes{
  double length,breadth;
  Rectangle(double length,double breadth){
    this.length=length;
    this.breadth=breadth;
  }
  @Override
  public double calculateArea(){
    return length*breadth;
  }
}
public class Q4 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the radius: ");
    int radius=sc.nextInt();
    System.out.println("Enter the side: ");
    int side=sc.nextInt();
    System.out.println("Enter the lenght:");
    int length=sc.nextInt();
    System.out.println("Enter the breadth:");
    int breadth=sc.nextInt();
    sc.close();

    Circle clr=new Circle(radius);
    Square sq=new Square(side);
    Rectangle rc=new Rectangle(length, breadth);

    System.out.println("The area of circle is:"+clr.calculateArea());
    System.out.println("The area of Square is:"+sq.calculateArea());
    System.out.println("The area of Rectangle is:"+rc.calculateArea());
  } 
}
