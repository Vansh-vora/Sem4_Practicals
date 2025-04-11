
import java.util.*;
//Write a Java program to create a Linkedlist and perform following operations on it:
//• add()
//• addAll()
//• AddFirst()
//• get()
//• lastIndexOf()
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        // static initialization
        list.add(56);
        list.add(89);
        list.add(47);
        list.add(93);
        list.add(74);
        list.add(61);
        list.add(82);
        list.add(95);
        list.add(38);
        list.add(77);

        outerLoop: while (true) {
            // i am doing an infinite menu driven prog you can do it as you like
            System.out.println("\n\nYou can perform following operations on LinkedList: ");
            System.out.println("1. Add element in Linked List");
            System.out.println("2. Add different list in Linked List");
            System.out.println("3. Add element at the start");
            System.out.println("4. Print the element by index");
            System.out.println("5. Get the last index of any recurring element");
            System.out.println("6. Print the linked list");
            System.out.println("7. exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:

                    System.out.print("\nEnter the element: ");
                    int num = sc.nextInt();


                    list.add(num);
                    break;

                case 2:

                    Collection<Integer> newElements = new ArrayList<>();


                    System.out.println("\nEnter those elements that you want to add in the LL(enter -1 to exit): ");

                    int element = 0;
                    while (true) {
                        System.out.print("Enter element: ");
                        element = sc.nextInt();

                        if (element == -1)
                            break;


                        newElements.add(element);
                    }


                    list.addAll(newElements);

                    System.out.println("New list added ahead successfully");

                    break;

                case 3:

                    System.out.print("Enter element: ");

                    list.addFirst(sc.nextInt());

                    break;

                case 4:

                    System.out.print("\nEnter the index you want to get: ");
                    int idx = sc.nextInt();


                    System.out.println("The element on " + idx + " is: " + list.get(idx));

                    break;

                case 5:


                    System.out.print("\nEnter the element to find its last index: ");
                    int elementToFind = sc.nextInt();

                    int lastIdx = list.lastIndexOf(elementToFind);
                    System.out.println("The last index of " + elementToFind + " is: " + lastIdx);

                    break;

                case 6:

                    System.out.println("The current linked list is: " + list.toString());

                    break;

                case 7:
                    System.out.println("\nExiting the program");
                    break outerLoop;

                default:
                    break;
            }
        }

        sc.close();
    }

}
