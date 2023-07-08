package WeekSix.HomeworkSix;


public class LinkedQueue<T> {
    protected PersonNode<T> front;
    protected PersonNode<T> rear;
    protected int numElements;

    public LinkedQueue() {
        front = null;
        rear = null;
        numElements = 0;
    }

    public void enqueue(T fName, T lName, T sNum) {
        PersonNode<T> newPersonNode = new PersonNode<>(fName, lName, sNum);

        if (front == null) {
            front = newPersonNode;
        } else {
            rear.setLink(newPersonNode);
        }

        rear = newPersonNode;
        numElements++;
    }


    public T dequeue() throws QueueUnderflowException {
        T tempFName, tempLName, tempSNum;

        if (isEmpty()) {
            throw new QueueUnderflowException("The queue is empty.");
        } else {
            tempFName = front.getFirstName();
            tempLName = front.getLastName();
            tempSNum = front.getServiceNumber();
            front = front.getLink();

            if (front == null) {
                rear = null;
            }

            numElements--;
            return (T) (tempFName + " " + tempLName + ", " + tempSNum);
        }
    }

    public void peekFront() {
        if (size() == 0) {
            System.out.println("Queue is empty, no front node information to display.");
        } else {
            System.out.println(front.getFirstName() + " " + front.getLastName() + ", " + front.getServiceNumber());
        }
    }

    public boolean contains(T lookFor) {
        if (size() == 0) {
            return false;
        }
        boolean contains = false;
        PersonNode<T> curr = front;
        while (curr != null) {
            T fName = curr.getFirstName();
            T lName = curr.getLastName();
            T sNum = curr.getServiceNumber();

            if (fName.equals(lookFor) || lName.equals(lookFor)) {
                contains = true;
                System.out.println(fName + " " + lName + ", " + sNum);
            }
            curr = curr.getLink();
        }
        return contains;
    }

    public void display() {
        if (size() == 0) {
            System.out.println("Queue is empty, no information to display.");
        } else {
            PersonNode<T> curr = front;
            while (curr != null) {
                System.out.println(curr.getFirstName() + " " + curr.getLastName() + ", " + curr.getServiceNumber());
                curr = curr.getLink();
            }
        }
    }

    public int size() {
        return numElements;
    }

    public boolean isFull() {
        return false;
    }

    public boolean isEmpty() {
        return numElements == 0;
    }
}
