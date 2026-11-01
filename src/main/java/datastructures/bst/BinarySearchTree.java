package datastructures.bst;


import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree(){
        root = null;
    }

    static class Node {
        int value;
        Node right;
        Node left;

        public Node(int value){
            this.value = value;
            right = null;
            left = null;
        }
    }

    public boolean insert(int value) {

        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (temp.value == value) {
                return false;
            } else if (value > temp.value) {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            } else {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }
        }
    }


    public boolean contains(int value){

        Node temp = root;
        while(temp != null){
            if (temp.value == value){
                return true;
            } else if (temp.value < value){
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }
        return false;

    }





}
