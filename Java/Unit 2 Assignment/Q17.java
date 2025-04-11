
import java.util.*;
//Write a Java program to create a Stack and perform following operations on it:
//• Push()
//• Peep()
//• Pop()
//• Search()
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        // Static initialization
        stack.push(40);
        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);

        outerLoop: while (true) {
            // i am doing an infinite menu driven prog you can do it as you like
            System.out.println("\n\nYou can perform following operations on Stack: ");
            System.out.println("1. Add element in stack");
            System.out.println("2. Get the element at top of stack");
            System.out.println("3. Remove the top element in stack");
            System.out.println("4. Search for the element in stack");
            System.out.println("5. Print the stack");
            System.out.println("6. exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // add an element in stack
                    System.out.print("\nEnter the element: ");
                    int num = sc.nextInt();

                    // use push method to add the number in stack
                    stack.push(num);
                    break;

                case 2:
                    // we need to get the top of the stack

                    System.out.println("The element that is on top of stack is: " + stack.peek());
                    break;

                case 3:
                    // here pop will remove the top element of stack
                    // top dish will be taken out LIFO
                    stack.pop();

                    break;

                case 4:
                    // get the element on a specific index
                    System.out.print("\nEnter the element you want to search: ");
                    int element = sc.nextInt();

                    System.out.println("The element is at index: " + stack.search(element));

                    break;

                case 5:
                    // print the stack using toString
                    System.out.println("The current stack is: " + stack.toString());

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
