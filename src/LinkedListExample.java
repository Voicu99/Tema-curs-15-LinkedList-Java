import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

    public static void main(String[] args) {
        // Creating a linked list
        LinkedList<String> list = new LinkedList<>();

        // 1. Append the specified element to the end of a linked list
        list.add("Element1");
        System.out.println("After appending Element1: " + list);

        // 2. Iterate through all elements in a linked list
        System.out.println("Iterating through the list:");
        for (String element : list) {
            System.out.println(element);
        }

        // 3. Iterate through all elements starting from the specified position
        list.add("Element2");
        list.add("Element3");
        System.out.println("List before iteration from position 1: " + list);
        ListIterator<String> iterator = list.listIterator(1);
        System.out.println("Iterating from position 1:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 4. Iterate a linked list in reverse order
        System.out.println("Iterating in reverse order:");
        iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        // 5. Insert the specified element at the specified position
        list.add(1, "InsertedElement");
        System.out.println("After inserting element at position 1: " + list);

        // 6. Insert elements at the first and last position
        list.addFirst("FirstElement");
        list.addLast("LastElement");
        System.out.println("After inserting elements at first and last positions: " + list);

        // 7. Insert the specified element at the front of a linked list
        list.offerFirst("FrontElement");
        System.out.println("After inserting at front: " + list);

        // 8. Insert the specified element at the end of a linked list
        list.offerLast("EndElement");
        System.out.println("After inserting at end: " + list);

        // 9. Insert some elements at the specified position
        LinkedList<String> newElements = new LinkedList<>();
        newElements.add("NewElement1");
        newElements.add("NewElement2");
        list.addAll(2, newElements);
        System.out.println("After inserting new elements at position 2: " + list);

        // 10. Get the first and last occurrence of the specified elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // 11. Display the elements and their positions in a linked list
        System.out.println("Displaying elements with positions:");
        int index = 0;
        for (String element : list) {
            System.out.println("Position " + index + ": " + element);
            index++;
        }

        // 12. Remove a specified element from a linked list
        list.remove("Element2");
        System.out.println("After removing 'Element2': " + list);

        // 13. Remove the first and last element from a linked list
        list.removeFirst();
        list.removeLast();
        System.out.println("After removing first and last elements: " + list);

        // 14. Remove all elements from a linked list
        list.clear();
        System.out.println("After removing all elements: " + list);

        // Reinitialize list for remaining examples
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("List reset: " + list);

        // 15. Swap two elements in a linked list
        Collections.swap(list, 1, 2);
        System.out.println("After swapping positions 1 and 2: " + list);

        // 16. Shuffle the elements in a linked list
        Collections.shuffle(list);
        System.out.println("After shuffling the list: " + list);

        // 17. Join two linked lists
        LinkedList<String> anotherList = new LinkedList<>();
        anotherList.add("X");
        anotherList.add("Y");
        list.addAll(anotherList);
        System.out.println("After joining another list: " + list);

        // 18. Clone a linked list to another linked list
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();
        System.out.println("Cloned list: " + clonedList);

        // 19. Remove and return the first element of a linked list
        String firstElement = list.poll();
        System.out.println("First element removed: " + firstElement);
        System.out.println("List after removing the first element: " + list);

        // 20. Retrieve, but do not remove, the first element of a linked list
        String firstElementPeek = list.peek();
        System.out.println("First element (retrieved but not removed): " + firstElementPeek);
    }
}
