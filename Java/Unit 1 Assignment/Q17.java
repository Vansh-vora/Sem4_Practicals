import java.util.Scanner;

//Write a Java Program to display all prime odd numbers from 50 to 100.
public class Q17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<100;i++){
            if(i%2!=0){
                System.out.println("number is: "+i);
            }
        }
    }
}
