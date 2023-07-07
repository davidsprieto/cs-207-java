package WeekFive.HomeworkFive;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        System.out.println("Empty list? " + list.isEmpty());
        System.out.println();

        list.addLast("Smith, John");
        list.addLast("Lee, Kelvin");
        list.addLast("Davids, Tim");
        list.addLast("Willis, Linda");
        list.addLast("Wilton, Lisa");

        list.add("Lee, Kelvin", "Hunter, Roy");
        list.display();
        System.out.println();

        System.out.println("Does the list contain the info: Willis, Linda? " + list.contains("Willis, Linda"));
        System.out.println();

        list.removeFirst();
        System.out.println("After remove first:");
        list.display();
        System.out.println();

        list.removeLast();
        System.out.println("After remove last:");
        list.display();
        System.out.println();

        System.out.println("Size: " + list.size());
    }
}
