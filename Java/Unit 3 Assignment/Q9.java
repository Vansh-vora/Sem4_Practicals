// Create a class with a method that prints "This is parent class" and its subclass with 
//another method that prints "This is child class". Now, create an object for each of the 
//class and call - 
 //method of parent class by object of parent class
//method of child class by object of child class
 // method of parent class by object of child class

 class ParentClass{
  void displayParent(){
    System.out.println("This is parent class");
  }
}

class ChildClass extends ParentClass{
  void displayChild(){
    System.out.println("This is called child class");
  }
}

    public class Q9 {
      public static void main(String[] args) {
        
        ParentClass parent=new ParentClass();
        ChildClass child=new ChildClass();

        parent.displayParent();
        child.displayChild();
        child.displayParent();
      }
}
