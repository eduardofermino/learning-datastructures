package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTANDO MYLINKEDLIST ===\n");

        // 1. Construtor e append
        LinkedList list = new LinkedList(10);
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

        // 10. Reverse
        list.append(50);
        list.append(10);
        System.out.print("\nLista atual antes do reverse: ");
        list.printList(); // Esperado: 10, 99, 50, 10
        list.reverse();
        System.out.print("Depois de reverse(): ");
        list.printList(); // Esperado: 10, 50, 99, 10

        // 11. FindMiddleNode
        LinkedList midList = new LinkedList(1);
        midList.append(2);
        midList.append(3);
        midList.append(4);
        midList.append(5);
        System.out.println("\nFindMiddleNode em [1, 2, 3, 4, 5]: " + midList.findMiddleNode().value); // Esperado: 3

        // 12. HasLoop
        System.out.println("HasLoop (lista normal): " + midList.hasLoop()); // Esperado: false

        // 13. FindKthNode
        System.out.println("FindKthNode (k=2 a partir do fim): " + midList.findKthNode(2).value); // Esperado: 4

        // 14. RemoveDuplicates
        LinkedList dupList = new LinkedList(1);
        dupList.append(2);
        dupList.append(1);
        dupList.append(3);
        dupList.append(2);
        System.out.print("\nAntes de removeDuplicates [1, 2, 1, 3, 2]: ");
        dupList.printList();
        dupList.removeDuplicates();
        System.out.print("Depois de removeDuplicates: ");
        dupList.printList(); // Esperado: 1, 2, 3

        // 15. BinaryToDecimal (Representa 101 em binário = 5)
        LinkedList binList = new LinkedList(1);
        binList.append(0);
        binList.append(1);
        System.out.println("\nBinaryToDecimal para [1, 0, 1]: " + binList.binaryToDecimal()); // Esperado: 5

        // 16. PartitionList
        LinkedList partList = new LinkedList(1);
        partList.append(4);
        partList.append(3);
        partList.append(2);
        partList.append(5);
        partList.append(2);
        System.out.print("\nAntes de partitionList(3) [1, 4, 3, 2, 5, 2]: ");
        partList.printList();

        LinkedList.Node partitionedHead = partList.partitionList(3);
        System.out.print("Depois de partitionList(3): ");
        LinkedList.Node temp = partitionedHead;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println(); // Esperado: 1 2 2 4 3 5
    }
}