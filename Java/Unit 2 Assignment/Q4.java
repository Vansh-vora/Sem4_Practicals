import java.util.Arrays;

// Write a Java program to create an array with 10 elements and sort it.
public class Q4 {
    public static void main(String[] args){
        int arr[]={10,30,6,5,67,78,89,90,45};
        System.out.println("The normal Array is:"+ Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("The sorted Array is:"+Arrays.toString(arr));
    }
}
