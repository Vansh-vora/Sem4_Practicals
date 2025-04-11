import java.util.Arrays;

//Write a Java program to remove the duplicate elements of a given array and return the
//new length of the array.
// Example array: [20, 20, 30, 40, 50, 50, 50]
public class Q3 {
    public static void main(String[] args){
        int arr[]={20,20,30,40,50,50,50};
        int uniqueindex=0;
        System.out.println("The normal array is:"+ Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[uniqueindex]){
                uniqueindex++;
                arr[uniqueindex]=arr[i];
            }
        }
        uniqueindex++;
        System.out.println("The duplicate removed array");
        for(int i=0;i<uniqueindex;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("The new unique length array is:"+uniqueindex);
    }
}
