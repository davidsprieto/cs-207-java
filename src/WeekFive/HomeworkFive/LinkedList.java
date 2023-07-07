package WeekFive.HomeworkFive;

public class LinkedList<T> {
    protected LLNode<T> list;

    public LinkedList() {
        list = null;
    }

    public void addFirst(T info) {
        LLNode<T> node = new LLNode<T>(info);
        node.setLink(list);
        list = node;
    }

    public void addLast(T info) {
        LLNode<T> curr = list;
        LLNode<T> newNode = new LLNode<T>(info);
        if (curr == null) {
            list = newNode;
        } else {
            while (curr.getLink() != null) {
                curr = curr.getLink();
            }
            curr.setLink(newNode);
        }
    }

    public void add(T afterThis, T info) {
        LLNode<T> temp;
        LLNode<T> curr = list;
        LLNode<T> newNode = new LLNode<T>(info);
        while (curr != null) {
            if (curr.getInfo().equals(afterThis)) {
                temp = curr.getLink();
                curr.setLink(newNode);
                curr = curr.getLink();
                curr.setLink(temp);
                return;
            }
            curr = curr.getLink();
        }
    }

    public void removeFirst() {
        LLNode<T> curr = list;
        if (curr == null) {
            System.out.println("Can't remove first node because the list is empty.");
        } else {
            list = curr.getLink();
            curr.setLink(null);
        }
    }

    public void removeLast() {
        LLNode<T> curr = list;
        if (curr == null) {
            System.out.println("Can't remove last node because the list is empty.");
        }
        if (size() == 1) {
            list = null;
            return;
        }
        while (true) {
            assert curr != null;
            if (curr.getLink().getLink() == null) break;
            curr = curr.getLink();
        }
        curr.setLink(null);
    }

    public int size() {
        LLNode<T> curr = list;
        if (curr == null) {
            return 0;
        }
        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.getLink();
        }
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean contains(T item) {
        LLNode<T> curr = list;
        if (size() == 0) {
            return false;
        }
        while (curr != null) {
            if (curr.getInfo().equals(item)) {
                return true;
            }
            curr = curr.getLink();
        }
        return false;
    }

    public void display() {
        LLNode<T> currNode = list;
        while (currNode != null) {
            System.out.println(currNode.getInfo());
            currNode = currNode.getLink();
        }
    }
}
