import java.util.Scanner;

//Write a Java Program to create an array with 10 elements and find Smallest Number from
//it.
public class Q1 {
    public static int getMin(int[] arr){
        int min=arr[0];

        for(int e:arr){
            if(e<min){
                min=e;
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter value of Arr["+i+"]: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("The Smallest number in array is:"+getMin(arr));
        sc.close();
    }
}
