package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTANDO DOUBLYLINKEDLIST ===\n");

        // 1. Construtor e append
        DoublyLinkedList list = new DoublyLinkedList(10);
        list.append(20);
        list.append(30);
        System.out.print("Depois de append(20) e append(30): ");
        list.printList(); // Esperado: 10, 20, 30

        // 2. Prepend
        list.prepend(5);
        System.out.print("\nDepois de prepend(5): ");
        list.printList(); // Esperado: 5, 10, 20, 30

        // 3. Getters (Head, Tail, Length)
        System.out.print("\nGetters -> ");
        list.getHead();   // 5
        list.getTail();   // 30
        list.getLength(); // 4

        // 4. Get por índice
        System.out.println("\nGet no índice 2: " + list.get(2).value); // Esperado: 20

        // 5. Set
        list.set(2, 99);
        System.out.print("Depois de set(2, 99): ");
        list.printList(); // Esperado: 5, 10, 99, 30

        // 6. Insert
        list.insert(2, 50);
        System.out.print("\nDepois de insert(2, 50): ");
        list.printList(); // Esperado: 5, 10, 50, 99, 30

        // 7. Remove por índice
        list.remove(2);
        System.out.print("\nDepois de remove(2): ");
        list.printList(); // Esperado: 5, 10, 99, 30

        // 8. RemoveFirst
        list.removeFirst();
        System.out.print("\nDepois de removeFirst(): ");
        list.printList(); // Esperado: 10, 99, 30

        // 9. RemoveLast
        list.removeLast();
        System.out.print("\nDepois de removeLast(): ");
        list.printList(); // Esperado: 10, 99
    }
}