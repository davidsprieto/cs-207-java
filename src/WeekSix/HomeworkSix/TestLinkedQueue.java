package WeekSix.HomeworkSix;

public class TestLinkedQueue
{
   public static void main(String[] args)
   {
      LinkedQueue<String> queue = new LinkedQueue<String>();

      System.out.println(queue.isEmpty());

      queue.enqueue("George", "Smith", "1901");
      queue.enqueue("Eve", "Connor", "1783");
      queue.enqueue("Else", "George", "1932");
      queue.enqueue("Lina", "Wanner", "1245");
      System.out.println();

      queue.peekFront();
      System.out.println();

      System.out.println(queue.contains("George"));
      System.out.println();

      System.out.println(queue.contains("Jim"));
      System.out.println();

      queue.display();
      System.out.println();

      System.out.println("Empty? " + queue.isEmpty());
      System.out.println();

      System.out.println("Size: " + queue.size());
      System.out.println();

      try {
         String r = queue.dequeue();
         System.out.println(r + " removed");
      } catch(QueueUnderflowException e) {
         System.out.println(e.getMessage());
      }

      System.out.println();
      queue.display();
   }
}
