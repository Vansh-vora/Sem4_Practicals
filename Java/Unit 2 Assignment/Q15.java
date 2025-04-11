import java.util.ArrayList;
import java.util.Scanner;

//Write a Java program to create an Arraylist with 5 elements and perform following
//operations on it:
// • get()
// • contains()
// • remove()
// • sort()
public class Q15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> ar=new ArrayList<>();

        ar.add(56);
        ar.add(66);
        ar.add(76);
        ar.add(86);
        ar.add(96);

        outerloop:while(true){
            System.out.println("You can perfrom foll operation on ArrayList:");
            System.out.println("1.Print number by it Index");
            System.out.println("2.Check whether number exist in the list");
            System.out.println("3.Remove the index");
            System.out.println("4.Sort the arraylist");
            System.out.println("5.Print the arraylist");
            System.out.println("6.exit");
            System.out.println("Enter your choice");
            int  choice=sc.nextInt();

            switch (choice){
                case 1:
                System.out.println("Enter the index you want to print:");
                int index=sc.nextInt();

                if(index>ar.size()-1){
                    System.out.println("Enter the valid index");
                    break;
                }
                int element=ar.get(index);
                    System.out.println("The element on index"+index+"is: "+element);
                    break;
                case 2:
                    System.out.println("Enter the number you want to check:");
                    int num=sc.nextInt();

                    if(ar.contains(num)){
                        System.out.println("The number is there");
                    }
                    else{
                        System.out.println("the number is not there");
                    }
                    break;
                case 3:
                    System.out.println("Enter the index you want to remove:");
                    int idx=sc.nextInt();

                    ar.remove(idx);
                    break;
                case 4:
                    ar.sort(null);
                    System.out.println("Sorted the array list");
                    break;
                case 5:
                    System.out.println("The current list is:"+ar.toString());
                    break;
                case 6:
                    System.out.println("Exiting");
                    break outerloop;
                default:
                    break;
            }
        }
        sc.close();
    }
}
