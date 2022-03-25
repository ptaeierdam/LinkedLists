public class DoubleDriver {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new DoublyLinkedList();

        System.out.println(linkedList.contains(null));

        linkedList.addFirst("First");
        linkedList.addFirst("Second");
        linkedList.addFirst("Third");
        linkedList.addFirst("Fourth");
        linkedList.addFirst("Fifth");

        linkedList.addLast("Sixth");
        linkedList.addLast("Seventh");
        linkedList.addLast("Eighth");

        System.out.println(linkedList.contains("First"));
        System.out.println(linkedList.contains("Eighth"));
        System.out.println(linkedList.contains("Tenth"));
        System.out.println(linkedList.contains(null));

        System.out.println(linkedList);

        System.out.println(((DoublyLinkedList<String>) linkedList).reverseToString());

        System.out.println("Head: " + linkedList.peekFirst());
        System.out.println("Tail: " + linkedList.peekLast());

        System.out.println("Poll First: " + linkedList.pollFirst());
        System.out.println("Poll Last: " + linkedList.pollLast());

        System.out.println("Head: " + linkedList.peekFirst());
        System.out.println("Tail: " + linkedList.peekLast());

        System.out.println(linkedList);

        System.out.println(linkedList.size());

        linkedList.clear();

        System.out.println(linkedList.size());

    }
}
