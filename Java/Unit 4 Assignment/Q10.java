// Write a class to sort the given set of N integers in descending order. Include a try block to locate the array index out of bounds execption and catch it.
import java.util.*;
import java.util.Scanner;

public class Q10 {
  public static void reversArray(int[] arr){
    int left=0,right=arr.length-1;
    while(left<right){
      int temp=arr[left];
      arr[left]=arr[right];
      arr[right]=temp;
      left++;
      right--;
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    try{
      System.out.println("Enter the number of elements:");
      int n=sc.nextInt();
      if(n<=0){
        throw new IllegalArgumentException("Error");
      }
      int[] numbers=new int[n];

      System.out.println("Enter"+n+"integers:");

      for(int i=0;i<n;i++){
        numbers[i]=sc.nextInt();
      }
      Arrays.sort(numbers);
      reversArray(numbers);

      System.out.println("Sorted numbers in Descending order");
      for(int i=0;i<=n;i++){
        System.out.println(numbers[i]+" ");
      }
      System.out.println("Enter the indeox you want to access:");
      int idx=sc.nextInt();

      if(idx>n){
        throw new ArrayIndexOutOfBoundsException("no");
      }
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Error");
    }catch(IllegalArgumentException e){
      System.out.println("Error: "+e.getMessage());
    }catch(Exception e){
      System.out.println("Invalid input");
    }finally{
      sc.close();
    }
  }
}
