package datastructures.bst;

public class Main {
    public static void main(String[] args) {
        // 1. Cria a árvore vazia
        BinarySearchTree bst = new BinarySearchTree();

        // 2. Testa as inserções
        System.out.println("--- TESTANDO INSERÇÕES ---");
        System.out.println("Inserindo 47: " + bst.insert(47)); // true
        System.out.println("Inserindo 21: " + bst.insert(21)); // true
        System.out.println("Inserindo 76: " + bst.insert(76)); // true
        System.out.println("Inserindo 18: " + bst.insert(18)); // true
        System.out.println("Inserindo 27: " + bst.insert(27)); // true

        // Tentando inserir um valor duplicado (deve retornar false)
        System.out.println("Inserindo 27 de novo (duplicado): " + bst.insert(27)); // false

        // 3. Testa as buscas (contains)
        System.out.println("\n--- TESTANDO BUSCAS (CONTAINS) ---");
        System.out.println("A árvore contem o número 27? " + bst.contains(27)); // true
        System.out.println("A árvore contem o número 76? " + bst.contains(76)); // true
        System.out.println("A árvore contem o número 99 (não existe)? " + bst.contains(99)); // false
    }
}