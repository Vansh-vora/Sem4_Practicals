import java.util.Scanner;

// Write a Java program to display all even numbers from 1 to 100 using for
//loop
public class Q16 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Showing all even number from 1 to 100:");
        for(int i=1;i<100;i++)
        {
            if(i%2==0){
                System.out.println("number is: "+i);
            }
        }
    }
}
