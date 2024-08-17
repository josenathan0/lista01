package questoes;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();

        int vogais = 0, espacos = 0, consoantes = 0;

        for (char c : frase.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais++;
            } else if (c == ' ') {
                espacos++;
            } else if (c >= 'a' && c <= 'z') {
                consoantes++;
            }
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Espaços em branco: " + espacos);
        System.out.println("Consoantes: " + consoantes);
    }
}
