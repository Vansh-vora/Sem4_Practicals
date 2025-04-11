import javax.swing.*;
import java.util.Scanner;

//Write a Java Program that will ask the user to input one number and check
// whether its prime number or not using Constructor.
public class Q8 {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=0;
        number=Integer.parseInt(JOptionPane.showInputDialog("Enter the number to check it is prime or not"));
        Numb nu=new Numb(number);
    }
}
class Numb{
    int number;

    Numb(int i){
        int count=0;
        for (int j=1;j<=i;j++){
            if(i%j==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("The NUmber is Prime NUmber");
        }
        else{
            System.out.println("The number is not a prime number");
        }

    }
}
