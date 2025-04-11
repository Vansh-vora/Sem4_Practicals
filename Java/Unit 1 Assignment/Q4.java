import java.util.Scanner;

// Write a Java Program that will accept a number from the user and calculate
// its square and cube and display the same.
public class Q4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();

        int square=number*number;
        int cube=number*number*number;

        System.out.println("The Square is:"+square);
        System.out.println("The Cube is:"+cube);
    }
}
