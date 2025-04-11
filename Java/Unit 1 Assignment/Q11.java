import java.util.Scanner;

//Write a Java program to enter two numbers and find the smallest out of them.
// Use conditional operator.
public class Q11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter one number:");
        int number1=sc.nextInt();
        System.out.println("Enter second number:");
        int number2=sc.nextInt();

        int min=(number1<number2)?number1:number2;
        System.out.println("The smallest number is:"+min);
    }
}
