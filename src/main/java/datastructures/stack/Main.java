package datastructures.stack;

public class Main {
    public static void main(String[] args) {
        // 1. Criando a pilha com o valor inicial 10 (Construtor)
        System.out.println("--- 1. CRIANDO A PILHA ---");
        Stack minhaPilha = new Stack(10);
        minhaPilha.printStack(); // Deve mostrar apenas: 10
        minhaPilha.getHeight();  // Deve mostrar: Height: 1

        System.out.println("\n--- 2. TESTANDO PUSH (Empilhar) ---");
        minhaPilha.push(20);
        minhaPilha.push(30);
        minhaPilha.push(40); // 40 entra e vira o topo

        minhaPilha.printStack(); // Deve mostrar: 40, 30, 20, 10 (de cima para baixo)
        minhaPilha.getHeight();  // Deve mostrar: Height: 4

        System.out.println("\n--- 3. TESTANDO GET_TOP (Ver o topo) ---");
        minhaPilha.getTop();     // Deve mostrar: Top: 40

        System.out.println("\n--- 4. TESTANDO POP (Desempilhar) ---");
        // Remove o topo (40) e guarda na variável
        Stack.Node removido = minhaPilha.pop();
        System.out.println("Item removido: " + removido.value); // Deve mostrar: 40

        System.out.println("\n--- 5. ESTADO APÓS O POP ---");
        minhaPilha.getTop();     // Novo topo deve ser: Top: 30
        minhaPilha.getHeight();  // Altura deve ser: Height: 3

        System.out.println("\nImprimindo a pilha restante:");
        minhaPilha.printStack(); // Deve mostrar: 30, 20, 10
    }
}