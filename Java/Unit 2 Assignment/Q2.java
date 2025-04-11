//Write a java Program to remove duplicate element in an Array.
public class Q2 {
    public  static void main(String[] args){
        int arr[]={1,2,3,4,5,5,7,8};
        System.out.println("The normal array is:");

        for(int e:arr){
            System.out.println(e+" ");
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=0;
                }
            }
        }
        System.out.println("The duplicate removed array");
        for(int e:arr){
            if(e==0){
                continue;
            }
            System.out.println(e+" ");
        }
    }
}
