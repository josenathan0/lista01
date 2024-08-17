package questoes;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 7) {
            System.out.println("O dia da semana correspondente ao número digitado é: " + dias[numero - 1]);
        } else {
            System.out.println("Número inválido. Digite um número entre 1 e 7.");
        }
    }
}
