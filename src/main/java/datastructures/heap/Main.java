package datastructures.heap;

public class Main {

    public static void main (String[] args){

        Heap myHeap = new Heap();
        myHeap.insert(50);
        myHeap.insert(28);
        myHeap.insert(32);
        myHeap.insert(49);
        myHeap.insert(60);

        System.out.println(myHeap.getHeap());

    }
}
