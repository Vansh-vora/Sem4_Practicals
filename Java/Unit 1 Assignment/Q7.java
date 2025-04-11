import javax.swing.*;
import java.util.Scanner;

// Write a Java Program that take one number from user making use of
// JoptionPane class, pass it to the parameterised Constructor and check
// whether its Odd number or Even number.
public class Q7 {
    public  static void main(String[] args){
        int number=0;
        Scanner sc=new Scanner(System.in);
        number=Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
        Num nu=new Num(number);
    }
}
class Num{
    int number;

    Num(int i){
        System.out.println(i);
        if(i%2==0){
            System.out.println("The Number is Even");
        }
        else{
            System.out.println("The Number is Odd");
        }
    }
}
