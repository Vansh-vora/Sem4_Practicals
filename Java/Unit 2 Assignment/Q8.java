import java.util.Arrays;

// Write a Java program to sort array elements in desending order.
public class Q8 {
    public static void main(String[] args){
        int[] mat={1,2,3,4,5,6,7,8,9};
        System.out.println("the unsorted array:"+ Arrays.toString(mat));
        Arrays.sort(mat);

        for(int i=0;i<mat.length/2;i++){
            int temp=mat[i];
            mat[i]=mat[mat.length-i-1];
            mat[mat.length-i-1]=temp;
        }
        System.out.println("The sorted array:"+Arrays.toString(mat));
    }
}
