package questoes;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if (palavraInvertida(palavra)) {
            System.out.println("A palavra " + palavra + " é o mesmo de trás para frente.");
        } else {
            System.out.println("A palavra " + palavra + " não é o mesmo de trás para frente.");
        }
    }

    public static boolean palavraInvertida(String palavra) {
        String invertida = new StringBuilder(palavra).reverse().toString();
        return palavra.equalsIgnoreCase(invertida);
    }
}
