package datastructures.recursion;

public class Main {

    public static int factorial(int n){
        if (n == 1) return 1;
        return n * factorial(n-1);
    }

    public static void main (String[] args){
        System.out.println(factorial(4));
    }
}


// Background da recursao
// 4. return 4 * 6 // 24
    // 3. return 3 * 2 // 6
        // 2. return 2 * 1 // 2
            // 1. return 1 <- Comeca aqui