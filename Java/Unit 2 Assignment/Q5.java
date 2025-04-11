import java.util.Scanner;

// Write a Java program to create a two-dimensional array and find the minimum value out
//of it.
public class Q5 {
    public static int getMin(int[][] arr){
        int min=arr[0][0];

        for(int[] row:arr){
            for(int e: row){
                if(min>e){
                    min=e;
                }
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] mat=new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter the value of matrix["+i+"]["+j+"]:");
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
                System.out.println(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("For this matrix the smallest num is:"+getMin(mat));
        sc.close();
    }
}
