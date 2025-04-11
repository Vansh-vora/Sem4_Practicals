
import java.util.*;
//Write a Java program to create a Priority Queue and perform following operations on it:
//• add()
//• peek()
//• poll()
//• contains()
public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Static initialization
        queue.add(56);
        queue.add(89);
        queue.add(47);
        queue.add(93);
        queue.add(74);
        queue.add(61);
        queue.add(82);
        queue.add(95);
        queue.add(38);
        queue.add(77);

        outerLoop: while (true) {
            // i am doing an infinite menu driven prog you can do it as you like
            System.out.println("\n\nYou can perform following operations on Queue: ");
            System.out.println("1. Add element in queue");
            System.out.println("2. Get the element at top of queue");
            System.out.println("3. Get and remove the top of the queue");
            System.out.println("4. Check weather that element exists in queue");
            System.out.println("5. Print the queue");
            System.out.println("6. exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // add an element in queue
                    System.out.print("\nEnter the element: ");
                    int num = sc.nextInt();

                    // use add method to add the number in queue
                    queue.add(num);
                    break;

                case 2:
                    // we need to get the top of the queue

                    System.out.println("The element that is on top of queue is: " + queue.peek());
                    break;

                case 3:
                    System.out.println("The top element was: " + queue.poll());

                    break;

                case 4:
                    // to check weather this element is in queue or not
                    System.out.print("\nEnter the element you want to check: ");
                    int element = sc.nextInt();

                    // contains just like LL returns boolean
                    if (queue.contains(element)) {
                        System.out.println("The element exists");
                    } else
                        System.out.println("The element does not exists");

                    break;

                case 5:
                    // print the queue using toString
                    System.out.println("The current queue is: " + queue.toString());

                    break;

                case 6:
                    System.out.println("\nExiting the program");
                    break outerLoop;

                default:
                    break;
            }
        }

        sc.close();
    }
}
