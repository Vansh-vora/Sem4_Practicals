import java.util.PriorityQueue;

// Create a Priority queue with 10 elements and print the minimum value out of it.
public class Q14 {
    public static void main(String[] args){
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(56);
        pq.add(67);
        pq.add(5);
        pq.add(77);
        System.out.println("Priority Queue is:"+pq.toString());

        int min=pq.peek();

        System.out.println("The smallest is:"+min);

    }
}
