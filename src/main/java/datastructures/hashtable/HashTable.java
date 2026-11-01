package datastructures.hashtable;

import java.util.ArrayList;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    public HashTable(){
        dataMap = new Node[size];
    }

    static class Node {
        private String key;
        private int value;
        private Node next;

        public Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    }

    public void printTable(){
        for(int i = 0; i < dataMap.length; i ++){
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while(temp != null){
                System.out.println(" {" + temp.key + "=" + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    private int hash(String key){
        int hash = 0; // hash comeca 0
        char[] keyChars = key.toCharArray(); // separa todas letras da key e transforma em um array de char ex: amor = ['a', 'm', 'o', 'r']
        for (int i = 0; i < keyChars.length; i++){ // para cada letra da palavra
            int asciiValue = keyChars[i]; // transforma a letra no numero decimal equivalente na tabela ASCII
            hash = (hash + asciiValue * 23) % dataMap.length; // calcula hash acumulado + numero decimal da letra * numero primo para distribuir melhor no dataMap, faz o valor nao passar de 0 a 6 (7 no total) para sempre caber no dataMap
        } // como a propria formula usa o hash acumulado, "amor" e "roma" tem hashs diferentes
        return hash;
    }

    public void set(String key, int value){
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null){
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get(String key){
        int index = hash(key);
        Node temp = dataMap[index];
        while(temp != null){
            if (temp.key == key){
                return temp.value;
            } else {
                temp = temp.next;
            }
        }
        return 0;

    }

    public ArrayList keys(){
        ArrayList<String> allKeys = new ArrayList<>();
        for(int i = 0; i < dataMap.length; i++){
            Node temp = dataMap[i];
            while (temp != null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }


}
