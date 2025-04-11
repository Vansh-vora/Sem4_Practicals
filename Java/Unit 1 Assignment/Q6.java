import javax.swing.*;
import java.util.Scanner;

// Write a Java Program that take user Year as input from user making use of
// JoptionPane class and check whether its leap year or not.
public class Q6 {
    public static void main(String[] args){
        int year=0;
        Scanner sc=new Scanner(System.in);
        year=Integer.parseInt(JOptionPane.showInputDialog("Enter year to check either leap year or not "));
        if(year%4==0){
            System.out.println(year+"is a Leap Year");

        }
        else {
            System.out.println(year+"is not Leap Year");
        }
    }
}
