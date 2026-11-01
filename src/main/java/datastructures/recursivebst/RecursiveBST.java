package datastructures.recursivebst;

import java.util.Currency;

public class RecursiveBST {

    private Node root;

    public RecursiveBST(){
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

    private boolean rContains(Node currentNode, int value){
        if(currentNode == null) return false;
        if(currentNode.value == value) return true;
        if (value < currentNode.value){
            return rContains(currentNode.left, value);
        } else{
            return rContains(currentNode.right, value);
        }
    }

    public boolean rContains(int value){
        return rContains(root, value);
    }

    private Node insert(Node currentNode, Node newNode){
        if (currentNode == null ){
            currentNode = newNode;
        }
        if(currentNode.value < newNode.value){
            currentNode.right = insert(currentNode.right, newNode);
        } else {
            currentNode.left = insert(currentNode.left, newNode);
        }
        return newNode;
    }

    public void insert(int value){
        Node newNode = new Node(value);
        root = insert(root, newNode);
    }

    private Node deleteNode(Node currentNode, int value){
        if(currentNode == null){
            return null;
        }
        if(value < currentNode.value){
            currentNode.left = deleteNode(currentNode.left, value);
        } else if (value > currentNode.value){
            currentNode.right = deleteNode(currentNode.right, value);
        } else {
            if (currentNode.left == null && currentNode.right == null){
                return null;
            } else if (currentNode.left == null){
                currentNode = currentNode.right;
            } else if (currentNode.right == null){
                currentNode = currentNode.left;
            } else {
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = deleteNode(currentNode.right, subTreeMin);
            }

        }
        return currentNode;
    }

    public void deleteNode(int value){
        deleteNode(root, value);
    }

    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }
}
