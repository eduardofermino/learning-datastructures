package datastructures.hashtable;

public class Main {

    public static void main(String[] args){

        HashTable myHashTable = new HashTable();

        myHashTable.set("Eduardo", 20);
        myHashTable.set("Gabriel", 22);
        myHashTable.set("Julia", 23);
        myHashTable.set("Miranilda", 24);
        myHashTable.set("Jose", 25);
        myHashTable.set("Mylla", 21);

        System.out.println(myHashTable.keys());

    }
}
