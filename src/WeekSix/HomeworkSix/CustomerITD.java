package WeekSix.HomeworkSix;

import java.util.Scanner;

public class CustomerITD {

    public static void main(String[] args) {
        LinkedQueue<String> queue = new LinkedQueue<String>();
        int serviceNum = 1808;

        Scanner kbd = new Scanner(System.in);
        int input;

        do {
            System.out.println("1- Insert");
            System.out.println("2- Remove");
            System.out.println("3- Who is next?");
            System.out.println("4- Check if empty");
            System.out.println("5- Check the size");
            System.out.println("6- Check if contains");
            System.out.println("7- Display the queue");
            System.out.println("8- Stop");
            System.out.println();

            System.out.print("Enter your choice: ");
            input = kbd.nextInt();

            if (input == 1) {
                System.out.print("Enter First Name: ");
                String fName = kbd.next();
                System.out.print("Enter Last Name: ");
                String lName = kbd.next();
                queue.enqueue(fName, lName, String.valueOf(serviceNum));
                serviceNum++;
            }

            if (input == 2) {
                try {
                    System.out.println("Removed: " + queue.dequeue());
                } catch (QueueUnderflowException e) {
                    System.out.println(e.getMessage());
                }
            }

            if (input == 3) {
                queue.peekFront();
            }

            if (input == 4) {
                System.out.println("Empty? " + queue.isEmpty());
            }

            if (input == 5) {
                System.out.println("Size: " + queue.size());
            }

            if (input == 6) {
                System.out.print("Enter first or last name: ");
                String name = kbd.next();
                boolean isInQueue = queue.contains(name);
                System.out.println("In the queue? " + isInQueue);
            }

            if (input == 7) {
                queue.display();
            }

            if (input == 0) {
                System.out.println("Bye");
            }

            System.out.println();

        } while (input != 0);
    }

}
