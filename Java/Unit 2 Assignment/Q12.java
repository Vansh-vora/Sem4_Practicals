import java.util.LinkedList;

//Write a Java program to create LinkedList and display them.
public class Q12 {
    public static void main(String[] args){
        LinkedList<Integer> list =new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println("The Link List is:"+list.toString());


    }
}
