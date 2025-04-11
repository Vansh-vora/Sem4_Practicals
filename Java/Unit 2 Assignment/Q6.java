import java.util.Scanner;

//Write a Java program to create a two-dimensional array and sum all the diagonal elements
// of it.
public class Q6 {
    public  static void main(String[] args){
        int[][] mat=new int[3][3];
        int sum=0;
        int n=mat.length;
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            {
                System.out.println("Enter the value of matrix["+i+"]["+j+"]:");
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(mat[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            sum+=mat[i][i];

            if(i!=n-i-1){
                sum+=mat[i][n-i-1];
            }
        }
        System.out.println("Sum of diagnal elements are:"+sum);
    }
}
