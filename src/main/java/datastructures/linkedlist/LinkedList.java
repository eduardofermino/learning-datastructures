package datastructures.linkedlist;


public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {

        int value;
        Node next;

        public Node(int value){ this.value = value; this.next = null;}

    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;

    }

    public void printList(){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

    public Node append(int value){

        Node temp = head;

        Node newNode = new Node(value);

        if ( length == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        length++;

        return newNode;

    }

    public Node prepend(int value){

        Node newNode = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        length++;

        return newNode;

    }

    public Node removeLast(){

       if (length == 0) {return null;}

       Node temp = head;
       Node pre = head;

       while(temp.next != null){
           pre = temp;
           temp = temp.next;
       }

       tail = pre;
       tail.next = null;
       length--;

       if (length == 0){
           head = null;
           tail = null;
       }

       return temp;

    }

    public Node removeFirst(){

        Node temp = head;

        if (length == 0){ return null; }
        head = head.next;
        temp.next = null;
        length--;

        if(length == 0){
            tail = null;
        }

        return temp;

    }

    public void getHead(){
        System.out.println("Head: "+ head.value);
    }
    public void getTail(){
        System.out.println("Tail: "+ tail.value);
    }
    public void getLength(){
        System.out.println("Length: "+ length);
    }

    public Node get(int index){

        if (index < 0 || index >= length ) { return null; }

        Node temp = head;

        for(int i = 0; i < index; i++){

            temp = temp.next;

        }

        return temp;

    }

    public boolean set(int index, int value){

        Node temp = get(index);

        if (temp != null) {
            temp.value = value;
            return true;
        }

        return false;

    }

    public boolean insert(int index, int value){

        Node newNode = new Node(value);
        Node temp = get(index-1);

        if ( index < 0 || index > length){
            return false;
        }

        if(index == 0){
            prepend(value);
            return true;
        }

        if (index==length){
            append(value);
            return true;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;

    }

    public Node remove(int index){

        if (length == 0){
            return null;
        }

        if ( index < 0 || index > length){
            return null;
        }

        if(index == 0){
            return removeFirst();
        }

        if(index == (length-1)){
            return removeLast();
        }

        Node temp = get(index);
        Node prev = get(index-1);
        prev.next = temp.next;
        temp.next = null;
        length--;

        return temp;

    }

    public void reverse(){

        Node temp = head;

        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for(int i = 0; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;

        }
    }

    public Node findMiddleNode(){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

    public boolean hasLoop(){

        if (head == null || head.next == null){
            return false;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return true;
            }
        }

        return false;

    }

    public Node findKthNode(int k){

         Node first = head;
         Node second = head;

         for (int i = 1; i < k; i++){
             if (first == null){
                 return null;
             }
             first = first.next;
         }

         while (first != null && first.next != null){
             first = first.next;
             second = second.next;
         }

         return second;

    }

    public void removeDuplicates(){

        Node current = head;

        while (current != null) {
            Node runner = current;

            while (runner.next != null) {
                if (runner.next.value == current.value){
                    Node duplicate = runner.next;
                    runner.next = runner.next.next;
                    duplicate.next = null;
                } else {
                    runner = runner.next;
                }
            }

            current = current.next;

        }
    }

    public int binaryToDecimal(){

        Node current = head;
        int binary = 0;

        while (current != null){
            binary = binary*2;
            if (current.value == 1) {
                binary++;
            }
            current = current.next;
        }

        return binary;
    }

    public Node partitionList(int x){

        Node greaterDummy = new Node(0);
        Node smallerDummy = new Node(0);

        Node tailGreater = greaterDummy;
        Node tailSmaller = smallerDummy;

        Node current = head;

        while(current != null) {

            if (current.value < x){
                tailSmaller.next = current;
                tailSmaller = tailSmaller.next;
            } else {
                tailGreater.next = current;
                tailGreater = tailGreater.next;
            }

            current = current.next;
        }

        tailGreater.next = null;
        tailSmaller.next = greaterDummy.next;

        return smallerDummy.next;

    }

}

