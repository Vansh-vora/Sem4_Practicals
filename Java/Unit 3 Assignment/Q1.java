//Define a class MotorVehicle to take modelName, modelNumeber, modelPrice, and a method display() to display these details. Create another class Car which inherits the class MotorVehicle and has the member discountRate and having display() method todisplay details. Test this class with suitable constructor. If necessary use the super keyword.

import java.util.*;

class MotorVehicle{
  String modelName;
  int modelNumber;
  float modelPrice;

  MotorVehicle(String modelName,int modelNumber,float modelPrice){
    this.modelName=modelName;
    this.modelNumber=modelNumber;
    this.modelPrice=modelPrice;

  }

  void display(){
    System.out.println("The model name is: "+modelName);
    System.out.println("The model number is: "+modelNumber);
    System.out.println("The model Price is: "+modelPrice);
  }
}

class Car extends MotorVehicle{
  float discountRate;

  Car(String modelName,int modelNumber,float modelPrice,float discountRate){

      super(modelName, modelNumber, modelPrice);
      this.discountRate=discountRate;

  }

  @Override
  void display(){
    super.display();
    System.out.println("The discount rate is: "+discountRate + "%");
  }
}

class Q1{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Enter the model Name: ");
    String name=sc.nextLine();

    System.out.println("Enter the model Number: ");
    int number=sc.nextInt();

    System.out.println("Enter the model Price: ");
    int price=sc.nextInt();

    System.out.println("Enter the discount rate:");
    int discount=sc.nextInt();

    Car car=new Car(name, number, price, discount);
    System.out.println("\n Car Details");
    car.display();
   
  }
}