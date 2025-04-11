import java.util.Scanner;

// Write a Java program that will convert the given temperature in fahrenheit to
// celcius using the formula C=(F-32)/1.8
public class Q2 {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temp in Farenhit:");
        double faren=sc.nextDouble();

        double celcius=(faren-32)/1.8;
        System.out.println("Temp in Celcius is:"+celcius);
    }

}
