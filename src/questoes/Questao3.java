package questoes;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        System.out.println("Números primos menores que " + num + ":");
        for (int i = 2; i < num; i++) {
            if (numeroPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean numeroPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
