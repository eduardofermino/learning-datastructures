package datastructures.queue;

public class Main {
    public static void main(String[] args) {
        // 1. Criando a fila com o valor inicial 10 (Construtor)
        System.out.println("--- 1. CRIANDO A FILA ---");
        Queue minhaFila = new Queue(10);
        minhaFila.printQueue(); // Deve mostrar apenas: 10
        minhaFila.getLength();  // Deve mostrar: Length: 1

        System.out.println("\n--- 2. TESTANDO ENQUEUE (Enfileirar) ---");
        minhaFila.enqueue(20);
        minhaFila.enqueue(30);
        minhaFila.enqueue(40); // 40 entra e vai para o final da fila

        minhaFila.printQueue(); // Deve mostrar: 10, 20, 30, 40 (do primeiro para o último)
        minhaFila.getLength();  // Deve mostrar: Length: 4

        System.out.println("\n--- 3. TESTANDO GET_FIRST E GET_LAST ---");
        minhaFila.getFirst();   // Deve mostrar: First: 10
        minhaFila.getLast();    // Deve mostrar: Last: 40

        System.out.println("\n--- 4. TESTANDO DEQUEUE (Desenfileirar) ---");
        // Remove quem está na frente (10) e guarda na variável
        Queue.Node atendido = minhaFila.dequeue();
        System.out.println("Pessoa atendida (removida): " + atendido.value); // Deve mostrar: 10

        System.out.println("\n--- 5. ESTADO APÓS O DEQUEUE ---");
        minhaFila.getFirst();   // Nova frente deve ser: First: 20
        minhaFila.getLast();    // O último continua sendo: Last: 40
        minhaFila.getLength();  // Tamanho agora é: Length: 3

        System.out.println("\nImprimindo a fila restante:");
        minhaFila.printQueue(); // Deve mostrar: 20, 30, 40
    }
}