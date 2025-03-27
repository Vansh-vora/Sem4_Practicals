//Write a java program using StringBuffer Class and its methods. 
public class Q17 {
  public static void main(String[] args){
    StringBuffer sb=new StringBuffer("Hello");

    sb.append("World");

    System.out.println("After Append: "+sb);

    sb.insert(6,"to ");
    System.out.println("After inserting to:"+sb);

    sb.replace(6,15,"Java");
    System.out.println("After replacing:"+sb);

    sb.reverse();
    System.out.println("After reversing: "+sb);

    System.out.println("The length of String: "+sb.length());
    System.out.println("The capacity of String: "+sb.capacity());

    sb.ensureCapacity(50);
    System.out.println("After ensuring capacity to 50: "+sb.capacity());
  }
  
}
