import java.util.Scanner;

//Write a Java program to search an element in an array. (Note: using user-defined function)
public class Q9 {
    public static void search(int[] arr,int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("The number"+num+"is present in array at"+i+"index");
                return;
            }
        }
        System.out.println("the number does not exist");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={56,78,68,90,91,76};
        System.out.println("Enter the element you want to search:");
        int num=sc.nextInt();

        search(arr,num);
        sc.close();
    }
}

