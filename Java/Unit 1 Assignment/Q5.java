import java.util.Scanner;

//Write a Java Program to find area of a circle.
public class Q5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        double radius=sc.nextDouble();

        double area=Math.PI*radius*radius;
        System.out.println("Area of Circle:"+area);
    }
}
